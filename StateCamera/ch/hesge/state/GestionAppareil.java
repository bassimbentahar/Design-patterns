package solution.StateCamera.AppareilPhoto;

import java.util.*;


public class GestionAppareil extends Observable {

	private EtatAppareilPhoto etatCourant ;
	
	private String texteAAfficher;
	
	private String couleurVoyant;
	
	public void setTextAAfficher(String texte) {
		texteAAfficher = texte;
		setChanged();	
	}
	
	public String getTextAAficher() {
		return texteAAfficher;
	}
	
	public void setCouleurVoyant(String texte) {
		couleurVoyant = texte;
		setChanged();			
	}
	
	public String getCouleurVoyant() {
		return couleurVoyant;
		
	}
		
	public GestionAppareil() {
		etatCourant = new Eteinte();
		texteAAfficher= etatCourant.getText();
		couleurVoyant = etatCourant.getCouleur();
		display();
	}
	
	public void boutonMApresse() {
		etatCourant=etatCourant.boutonMApresse();
		texteAAfficher= etatCourant.getText();
		couleurVoyant = etatCourant.getCouleur();
		setChanged();

	}
	
	public void modeVisionnement() {
		etatCourant=etatCourant.modeVisionnement();
		texteAAfficher= etatCourant.getText();
		couleurVoyant = etatCourant.getCouleur();		
		setChanged();
	
	}
	
	public void changerMode() {
		etatCourant=etatCourant.changerMode();
		texteAAfficher= etatCourant.getText();
		couleurVoyant = etatCourant.getCouleur();		
		setChanged();
	
	}

	
	private void display(){
		addObserver(new FenetreGestionAppareil(this));
	}	
	

}
