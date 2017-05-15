package com.ListeChainee.personnage;
import com.ListeChainee.liste.MaListe;

public class Personnage {
	static int gouter = 10;
	String nom;
	
	//constructeur
	public Personnage(String nom){
		this.nom = nom;
	}
	
	public void attaquer(Personnage perso){
		perso.gouter --;
		System.out.println("j\'attaque "+ perso.nom + " et le nombre de gouter restant est de : " + gouter );
		
	}
}

