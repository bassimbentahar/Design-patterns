package solution.StateCamera.AppareilPhoto;

public class VisioPhoto extends ModeVisionnement {

	public String getText() { return "Visio photo";};
	protected EtatAppareilPhoto changerMode() {
		return new VisioVideo();		
	}	
}
