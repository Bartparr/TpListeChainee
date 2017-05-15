package com.ListeChainee.utilitaire;

import com.ListeChainee.liste.MaListe;
import com.ListeChainee.personnage.Personnage;

public class Utilitaire {
	
	public static void taper(MaListe<? extends Personnage>  maListe ){
		
		for (Personnage perso: maListe.printAll()){
			perso.attaquer(perso);
		}
	}

}
