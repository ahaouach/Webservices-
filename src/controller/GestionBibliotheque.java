package controller;

import java.util.ArrayList;
import java.util.HashMap;

import bibliotheque.Ouvrage;
import bibliotheque.Ouvrages;
import bibliotheque.Usagers;


@SuppressWarnings("unused")
public class GestionBibliotheque {
	
    private HashMap<String, Ouvrage> listemprunt= new HashMap<>();
	private HashMap<String, Usagers> listUsagers = new HashMap<>();
	

	public GestionBibliotheque(HashMap<String, Usagers> listUsagers) {
		super();
		this.listUsagers = listUsagers;
	}

	public HashMap<String, Usagers> getListUsagers() {
		return listUsagers;
	}

	public void setListUsagers(HashMap<String, Usagers> listUsagers) {
		this.listUsagers = listUsagers;
	}

	public void AjouterUsagers(Usagers usager) {
		listUsagers.put(usager.getIdUsager(), usager);

	}

	public void SupprimerUsagers(String idusager) {
		listUsagers.remove(idusager);
	}

	public Usagers RechercherUserParID(String iduser) {
		return listUsagers.get(iduser);

	}

	public ArrayList<Usagers> RechercherUserParNom(String nomUser) {
		ArrayList<Usagers> users = new ArrayList<>();
		for (Usagers A : listUsagers.values()) {
			if (A.getNom().equals(nomUser)) {
				users.add(A);
			}
		}
		return users;

	}

	public void emprunter(Ouvrage ouv) {
		
		if (ouv.getEmprunte == false ) {
			ouv.setEmprunte(true);
			System.out.println(" emprunter l'ouvrage !");
		} else
			System.out.println("L'ouvrage est déjà emprunté !");
	}}
	/*public retourOuvrage( ){
	     
	    while(.hasNext()){
	    if(){
	    suppLivre(livre);
	    }
	     
	    }
	     
	    else{
	    System.out.println("Le lecteur n'a rien emprunter !");
	    }
	     
	    }
}*/
