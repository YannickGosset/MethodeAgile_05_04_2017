package com.bibliotheque.livres;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Livre livre1 = new Livre("Harry Potter", 0, true, "fantaisie");
		Livre livre2 = new Livre("Lumina", 1, true, "fantaisie");
		Livre livre3 = new Livre("Harry Potter2", 2, true, "fantaisie");
		
		ArrayList<Livre> livresDisponibles = new ArrayList<Livre>();
		
		Stock stock = new Stock(livresDisponibles, null);
		stock.ajouterLivreDisponible(livre1);
		stock.ajouterLivreDisponible(livre2);
		stock.ajouterLivreDisponible(livre3);
		
		Client client = new Client();
		client.emprunter(stock.getLivresDisponibles().get(0));
		stock.supprimerLivreDesDiponibles(livre1);
		stock.ajouterLivreIndisponible(livre1);
		Administrateur administrateur = new Administrateur();

		for(Emprunt e : client.getEmprunts()){
			administrateur.voirDateRetour(e);
		}
		
		client.notifier();
		
	}
}