package solution.StateCamera.AppareilPhoto;
import java.awt.Toolkit;

public abstract class  Allume extends EtatAppareilPhoto {
	
	public String getCouleur() { return "Vert";};

	protected EtatAppareilPhoto boutonMApresse() {
		return new Eteinte();
	}
	
}
