package controller;

import bibliotheque.Ouvrage;
import bibliotheque.Usager;

public class GestionEmprunt {

	public void emprunter(Ouvrage ouv) {

		if (!ouv.getEmprunte()) {
			ouv.setEmprunte(true);
			System.out.println(" emprunter l'ouvrage !");
			Usager.listEmpruntUser.put(ouv.getReference(), ouv);
		} else
			System.out.println("L'ouvrage est d�j� emprunt� !");
		Usager.listEmpruntUser.get(ouv.getReference()); // liste des emprunt faites par un user
	}

	public void retourOuvrage(Ouvrage ouv) {
		if (ouv.getEmprunte()) {
			ouv.setEmprunte(false);
			System.out.println(" l'ouvrage est retourn� !");
		} else
			System.out.println(" l'ouvrage est toujours emprunt� !");
		Usager.listEmpruntUser.get(ouv.getReference());
	}

}
