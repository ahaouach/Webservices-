package controller;

import java.util.ArrayList;
import java.util.HashMap;

//import bibliotheque.Auteur;
//import bibliotheque.Editeur;
import bibliotheque.Ouvrage;
//import bibliotheque.Usager;

public class GestionOuvrage {
/*private HashMap<String, String> listAuteurs = new HashMap<>();
	private HashMap<String, Editeur> listEditeurs = new HashMap<>();*/
	private HashMap<String, Ouvrage> listOuvrages = new HashMap<>();

	public GestionOuvrage(HashMap<String, Ouvrage> listOuvrages) {
		super();
		this.listOuvrages = listOuvrages;
	}

	public void ajouter(Ouvrage ouvrage) {
		listOuvrages.put(ouvrage.getReference(), ouvrage);

	}

	public void supprimer(Ouvrage ouvrage) {
		listOuvrages.remove(ouvrage.getReference());
	}

	public Ouvrage rechercherID(Ouvrage ouvrage) {
		return listOuvrages.get(ouvrage.getReference());

	}

	/*public ArrayList<Auteur> ajouterAuteur(Auteur aut) {
		ArrayList<Auteur> auteurs = new ArrayList<>();
		auteurs.add(aut);
		return auteurs;

	}*/

	/*public ArrayList<Ouvrage> rechercherParTitre(String titre) {
		ArrayList<Ouvrage> resOuvrage = new ArrayList<>();
		for (Ouvrage l : listOuvrages.values()) {
			if (l.getTitre().equals(titre)) {
				resOuvrage.add(l);
			}
		}
		return resOuvrage;

	}*/

	/*public ArrayList<Editeur> ajouterEditeur(Editeur editor) {
		ArrayList<Editeur> editeurs = new ArrayList<>();
		editeurs.add(editor);
		return editeurs;

	}*/

public ArrayList<Ouvrage> RechercherParRef(String ref) {
	ArrayList<Ouvrage> resOuvrage = new ArrayList<>();
	for (Ouvrage O : listOuvrages.values()) {
		if (O.getReference().equals(ref)){
			resOuvrage.add(O);
		}
	}
	return resOuvrage;

}
	
	
	/*public void Ajouter_Ouvrage(Ouvrage ouvrage) {
		listOuvrages.put(ouvrage.getReference(), ouvrage);

	}

	public void Supprimer_Ouvrage(String reference) {
		listOuvrages.remove(reference);
	}

	public Ouvrage RechercherOuvParID(String ref) {
		return listOuvrages.get(ref);

	}*/

	public ArrayList<Ouvrage> RechercherOuvParTitre(String titre) {
		ArrayList<Ouvrage> res = new ArrayList<>();
		for (Ouvrage ouv : listOuvrages.values()) {
			if (ouv.getTitre().equals(titre)) {
				res.add(ouv);
			}
		}
		return res;

	}

}
