package com.bibliotheque.test;


import java.util.ArrayList;

import org.junit.Test;

import com.bibliotheque.livres.Livre;
import com.bibliotheque.livres.Stock;

import junit.framework.TestCase;

public class testStock extends TestCase{
	
	
	@Test
	public void testAjouterLivreDisponible(){
		Livre livre = new Livre("hey", 12, true, "SF");
		ArrayList<Livre> livresDisponibles = new ArrayList<Livre>();
		ArrayList<Livre> livresIndisponibles = new ArrayList<Livre>();
		Stock stock = new Stock(livresDisponibles, livresIndisponibles);
		stock.ajouterLivreDisponible(livre);
		assertEquals(livre, stock.getLivresDisponibles().get(0));
	}
	
	public void testAjouterLivreIndisponible(){
		Livre livre = new Livre("hey", 12, true, "SF");
		ArrayList<Livre> livresDisponibles = new ArrayList<Livre>();
		ArrayList<Livre> livresIndisponibles = new ArrayList<Livre>();
		Stock stock = new Stock(livresDisponibles, livresIndisponibles);
		stock.ajouterLivreIndisponible(livre);
		assertEquals(livre, stock.getLivresIndisponibles().get(0));
	}
	
	public void testSupprimerLivreDesDisponibles(){
		Livre livre = new Livre("hey2", 42, true, "SF");

		ArrayList<Livre> livresDisponibles = new ArrayList<Livre>();
		ArrayList<Livre> livresIndisponibles = new ArrayList<Livre>();
		livresDisponibles.add(livre);
		
		Stock stock = new Stock(livresDisponibles, livresIndisponibles);
		
		stock.supprimerLivreDesDiponibles(livre);
		assertNull(stock.getLivresDisponibles());
	}
	
	

}
