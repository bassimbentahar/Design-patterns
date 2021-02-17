package solution.StateCamera.AppareilPhoto;

public class VisioVideo extends ModeVisionnement {

	public String getText() { return "Visio video";};
	protected EtatAppareilPhoto changerMode() {
		return new VisioPhoto();		
	}	

}
