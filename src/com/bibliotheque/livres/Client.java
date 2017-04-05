package com.bibliotheque.livres;

import java.util.ArrayList;
import java.util.Date;

public class Client {

	private ArrayList<Emprunt> emprunts;

	public void emprunter(Livre livre) {
		if (livre.isEstDisponible()) {
			emprunts.add(new Emprunt(this, livre, new Date(), new Date(new Date().getTime()+30000)));
		}
	}
	
public void notifier (Emprunt emprunt) {
			System.out.println("Votre" + emprunts.get(emprunt).getLivre().getNom() + "  emprunt arrive à la date limite !");
	}
}
