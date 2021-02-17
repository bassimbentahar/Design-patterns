package solution.StateCamera.AppareilPhoto;

public abstract class ModeVisionnement extends Allume {
	public String getCouleur() { return "Orange";};
	protected EtatAppareilPhoto modeVisionnement() {
		return new ModePhoto();		
	}	
}
