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
<<<<<<< HEAD

	public void notifier() {
		System.out.println("Votre emprunt arrive à la date limite !");
=======
	
public void notifier () {
			System.out.println("Votre  emprunt arrive à la date limite !");
>>>>>>> af1d1855d8c6df1096b8574d23a30e1e3883acc0
	}
}
