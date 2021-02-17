package solution.StateCamera.AppareilPhoto;

	
import java.awt.event.*;

import javax.swing.*;

import java.util.*;


public class FenetreGestionAppareil  extends JFrame implements ActionListener, Observer {
		
		private GestionAppareil model;
	
		private JLabel lblEtatActuel = new JLabel();
		private JLabel lblCouleurVoyant = new JLabel();
		
		private JButton btnMA = new JButton();
		private JButton btnChangerMode = new JButton();
		private JButton btnModeVisionnement = new JButton();
				
		// initialisation de l'affichage 
		public FenetreGestionAppareil(GestionAppareil model)  {			
			super();
			this.model = model;
			setBounds(200,200,260,180);
			setResizable(false);
			getContentPane().setLayout(null);
			setTitle("Appareil photo");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			lblEtatActuel.setBounds(140, 20, 150, 20);
			getContentPane().add(lblEtatActuel);
			lblCouleurVoyant.setBounds(20, 20, 150, 20);
			getContentPane().add(lblCouleurVoyant);			
			btnMA.setText("Marche/Arret");
			btnMA.setBounds(20,60,100,40);
			getContentPane().add(btnMA);
			btnMA.addActionListener(this);
	
			btnModeVisionnement.setText("Visionnement");
			btnModeVisionnement.setBounds(20,100,100,40);
			getContentPane().add(btnModeVisionnement);
			btnModeVisionnement.addActionListener(this);			
		
			btnChangerMode.setText("ChangerMode");
			btnChangerMode.setBounds(140,100,100,40);
			getContentPane().add(btnChangerMode);
			btnChangerMode.addActionListener(this);
			setVisible(true);
			mettreAJourChamps();
			

		}
	
		public void mettreAJourChamps() {
			lblEtatActuel.setText("Etat : "+model.getTextAAficher());
			lblCouleurVoyant.setText("Voyant: "+model.getCouleurVoyant());
		}
		
		public void actionPerformed(ActionEvent e) {
			String action = e.getActionCommand();
			switch (action) {
			case "Marche/Arret":
				model.boutonMApresse();
				break;
			case "Visionnement":
				model.modeVisionnement();
				break;
			case "ChangerMode":
				model.changerMode();
				break;
			}

			model.notifyObservers();
			
		}
		
		public void update(Observable o, Object arg){
			mettreAJourChamps();
		}		
}
