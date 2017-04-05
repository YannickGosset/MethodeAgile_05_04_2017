package com.bibliotheque.livres;

public class Livre{
	
	private String titre;
	private int idLivre;
	private boolean estDisponible;
	
	public Livre(String titre, int idLivre, boolean estDisponible) {
		super();
		this.titre = titre;
		this.idLivre = idLivre;
		this.estDisponible = estDisponible;
	}

	public void setEstDisponible(boolean estDisponible) {
		this.estDisponible = estDisponible;
	}

	public boolean isEstDisponible() {
		return estDisponible;
	}

	public String getTitre() {
		return titre;
	}
	public String getGenre() {
		return titre;
	}


	
	
}
