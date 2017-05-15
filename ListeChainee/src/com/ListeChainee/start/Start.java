package com.ListeChainee.start;

import com.ListeChainee.liste.MaListe;
import com.ListeChainee.personnage.Homme;
import com.ListeChainee.personnage.Personnage;
import com.ListeChainee.utilitaire.Utilitaire;




public class Start {

	public static void main(String[] args) throws Exception {
		
		/*
		 
		 
		MaListe<Integer> liste = new MaListe<Integer>();
		liste.add(5);
		liste.add(4);
		liste.add(2);
		liste.add(6);
		
		int result = 0;
		for(Integer i : liste.printAll()){
			result+=i;
		}
		
		liste.delete(2);
		System.out.println("----------------------------");
		for(Integer i : liste.printAll()){
			System.out.println(i);
		}
		liste.delete(2);
		System.out.println("----------------------------");
		for(Integer i : liste.printAll()){
			System.out.println(i);
		}
		liste.delete(2);
		System.out.println("----------------------------");
		for(Integer i : liste.printAll()){
			System.out.println(i);
		}
		
		*/

	
		// deuxieme partie: generique avec wildcard, generic et polymorphisme
		
		MaListe<Homme> listePerso = new MaListe<Homme>();
		Homme homme1 = new Homme("fatou");
		Homme homme2 = new Homme("barth");
		
		listePerso.add(homme1);
		listePerso.add(homme2);
		
		Utilitaire.taper(listePerso);
		
	}
	
	
}