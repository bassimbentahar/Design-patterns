package solution.StateCamera.AppareilPhoto;
import java.awt.Toolkit;

public class Eteinte extends EtatAppareilPhoto {
	
	public String getText() { return "Eteint";};
	public String getCouleur() { return "Rouge";};
	
	public Eteinte() {
		super();
		Toolkit.getDefaultToolkit().beep();		
		// TODO Auto-generated constructor stub
	}
	protected EtatAppareilPhoto boutonMApresse() {
		return new ModePhoto();
	}
	
}
