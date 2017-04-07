package com.bibliotheque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.bibliotheque.livres.Client;
import com.bibliotheque.livres.Livre;
import com.bibliotheque.livres.Stock;

public class IHM {

	private static Stock stock;
	private static Client client;
	public IHM () {
		this.client  = new Client ();
		ArrayList <Livre> dispo = new ArrayList<Livre>();
		dispo.add(new Livre ("mdr", 2, true, "lol"));
		
		ArrayList <Livre> pasDispo = new ArrayList<Livre>();
		pasDispo.add(new Livre ("mdr2", 2, false, "lol"));
		
		this.stock = new Stock(dispo, pasDispo);
		
		JFrame fenetre = new JFrame ("Bibiliotheque");
		fenetre.setVisible(true);
		fenetre.setSize(800, 600);
		fenetre.add(creerPanelLivres());
	}

	
	public static JPanel creerPanelLivres () {
		JPanel affichageLivres = new JPanel ();
		affichageLivres.add(new JLabel ("Livres dispo : "));
		affichageLivres.setLayout(new BoxLayout(affichageLivres, BoxLayout.Y_AXIS));
		ArrayList <Livre> livres = stock.getLivresDisponibles();
		for (Livre l : stock.getLivresDisponibles()) {
			affichageLivres.add(new JLabel (l.getTitre() + ' '));
			JButton reserver = new JButton("reserver");
			reserver.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Livre " + l.getTitre() + " reservé !");
					client.emprunter(l);
					stock.ajouterLivreIndisponible(l);
					stock.supprimerLivreDesDiponibles(l);
					creerPanelLivres();
				}
			});
			affichageLivres.add(reserver);
		}
		affichageLivres.add(new JLabel ("Livres pas dispo : "));
		for (Livre l : stock.getLivresIndisponibles()) {
			affichageLivres.add(new JLabel (l.getTitre() + ' '));
		}
		return affichageLivres;
		
	}
	public static void main(String[] args) {
		IHM ihm = new IHM();	
	}
}
