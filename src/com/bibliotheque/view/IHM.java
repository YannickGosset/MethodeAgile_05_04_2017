package com.bibliotheque.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bibliotheque.livres.Livre;
import com.bibliotheque.livres.Stock;

public class IHM {

	private Stock stock;
	
	public IHM (Stock stock) {
		this.stock = stock;
	}

	
	public JPanel creerPanelLivres () {
		JPanel affichageLivres = new JPanel ();
		
		for (Livre l : stock.getLivresDisponibles()) {
			affichageLivres.add(new JLabel (l.getTitre() + ' '));
		}
		return affichageLivres;
		
	}
	public static void main(String[] args) {

		JFrame fenetre = new JFrame ("Bibiliotheque");
		fenetre.setVisible(true);
		fenetre.setSize(800, 600);
		fenetre.add(creerPanelLivres());
		
	}
}
