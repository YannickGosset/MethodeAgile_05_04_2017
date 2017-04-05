package com.bibliotheque.livres;

import java.util.Date;

public class Emprunt {

	private Client client;
	private Livre livre;
	private Date dateEmprunt;
	private Date dateRetour;
	
	public Emprunt(Client client, Livre livre, Date dateEmprunt, Date dateRetour) {
		super();
		this.client = client;
		this.livre = livre;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
	}

	public Date getDateRetour() {
		System.out.println("Date retour : ");
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	
	
	
}
