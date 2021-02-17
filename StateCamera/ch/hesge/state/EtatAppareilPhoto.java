package solution.StateCamera.AppareilPhoto;

public abstract class EtatAppareilPhoto {
	
	abstract public String getText();
	abstract public String getCouleur();
	
	protected EtatAppareilPhoto boutonMApresse() {
		return this;		
	}	
	protected EtatAppareilPhoto modeVisionnement() {
		return this;
	}
	protected EtatAppareilPhoto changerMode() {
		return this;
	}
}
