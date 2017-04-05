package com.bibliotheque.livres;

import java.util.ArrayList;

public class Stock {
	protected ArrayList<Livre> livresDisponibles = new ArrayList<Livre>();
	private ArrayList<Livre> livresIndisponibles = new ArrayList<Livre>();
	
	
	
	public Stock(ArrayList<Livre> livresDisponibles, ArrayList<Livre> livresIndisponibles) {
		super();
		this.livresDisponibles = livresDisponibles;
		this.livresIndisponibles = livresIndisponibles;
	}
	
	public ArrayList<Livre> getLivresDisponibles() {
		return livresDisponibles;
	}
	public ArrayList<Livre> getLivresIndisponibles() {
		return livresIndisponibles;
	}
	
	public void ajouterLivreDisponible(Livre livre){
		livresDisponibles.add(livre);
	}

	public void ajouterLivreIndisponible(Livre livre){
		livresIndisponibles.add(livre);
<<<<<<< HEAD
=======
	}
	
	public void supprimerLivreDesDiponibles(Livre livre){
		livresDisponibles.remove(livre);
	}
	
	public void supprimerLivreDesIndiponibles(Livre livre){
		livresIndisponibles.remove(livre);
>>>>>>> af1d1855d8c6df1096b8574d23a30e1e3883acc0
	}
}
