package com.bibliotheque.livres;

public class Livre{
	
	private String titre;
	private int idLivre;
	private boolean estDisponible;
	private String genre;
	
	public Livre(String titre, int idLivre, boolean estDisponible, String genre) {
		super();
		this.titre = titre;
		this.idLivre = idLivre;
		this.estDisponible = estDisponible;
		this.genre = genre;
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
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}	
}
