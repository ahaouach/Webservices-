package controller;

import bibliotheque.Ouvrage;
import bibliotheque.Usager;

public class GestionEmprunt {

	public void emprunter(Ouvrage ouv, Usager us) {

		if (!ouv.getEmprunte()) {
			ouv.setEmprunte(true);
			System.out.println(" Emprunté l'ouvrage !");
			us.listEmpruntUser.add(ouv.getReference());
		} else
			System.out.println("L'ouvrage est déjà emprunté !");
		us.listEmpruntUser.add(ouv.getReference()); // liste des emprunt faites par un user
	}

	public void retourOuvrage(Ouvrage ouv) {
		if (ouv.getEmprunte()) {
			ouv.setEmprunte(false);
			System.out.println(" l'ouvrage est retourné !");
		} else
			System.out.println(" l'ouvrage est toujours emprunté !");
		//Usager.listEmpruntUser.get(ouv.getReference());
	}

}
