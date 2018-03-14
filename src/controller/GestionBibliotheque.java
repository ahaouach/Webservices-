package controller;

import java.util.ArrayList;
import java.util.HashMap;

import bibliotheque.Ouvrage;
//import bibliotheque.Ouvrages;
import bibliotheque.Usager;

public class GestionBibliotheque {

	private HashMap<String, Usager> listUsagers = new HashMap<>();

	public GestionBibliotheque(HashMap<String, Usager> listUsagers) {
		super();
		this.listUsagers = listUsagers;
	}

	public HashMap<String, Usager> getListUsagers() {
		return listUsagers;
	}

	public void setListUsagers(HashMap<String, Usager> listUsagers) {
		this.listUsagers = listUsagers;
	}

	public void AjouterUsagers(Usager usager) {
		listUsagers.put(usager.getIdUsager(), usager);

	}

	public void SupprimerUsagers(String idusager) {
		listUsagers.remove(idusager);
	}

	public Usager RechercherUserParID(String iduser) {
		return listUsagers.get(iduser);

	}

	public ArrayList<Usager> RechercherUserParNom(String nomUser) {
		ArrayList<Usager> users = new ArrayList<>();
		for (Usager A : listUsagers.values()) {
			if (A.getNom().equals(nomUser)) {
				users.add(A);
			}
		}
		return users;

	}

	public void emprunter(Ouvrage ouv) {

		if (ouv.getEmprunte() == false) {
			ouv.setEmprunte(true);
			System.out.println(" emprunter l'ouvrage !");
		} else
			System.out.println("L'ouvrage est d√©j√† emprunt√© !");
	}

	public void retourOuvrage(Ouvrage ouv) {
		if (ouv.getEmprunte() == true) {
			ouv.setEmprunte(false);
			System.out.println(" l'ouvrage est retournÈ !");
		} else
			System.out.println(" l'ouvrage est toujours empruntÈ !");
	}
}
