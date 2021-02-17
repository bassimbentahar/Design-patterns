package solution.StateCamera.AppareilPhoto;
public class ModeVideo extends Allume {
	
	public String getText() { return "Mode Video";};
	
	protected EtatAppareilPhoto changerMode() {
		return new ModePhoto();
	}	

	protected EtatAppareilPhoto modeVisionnement() {
		return new VisioVideo();
	}

}