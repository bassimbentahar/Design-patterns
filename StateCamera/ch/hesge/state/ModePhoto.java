package solution.StateCamera.AppareilPhoto;

public class ModePhoto extends Allume {
	
	public String getText() { return "Mode Photo";};
	
	protected EtatAppareilPhoto changerMode() {
		return new ModeVideo();
	}	
	
	protected EtatAppareilPhoto modeVisionnement() {
		return new VisioPhoto();
	}

}
