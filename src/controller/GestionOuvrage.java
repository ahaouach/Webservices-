package controller;

import java.util.ArrayList;
import java.util.HashMap;

//import bibliotheque.Auteur;
//import bibliotheque.Editeur;
import bibliotheque.Ouvrage;
//import bibliotheque.Usager;

public class GestionOuvrage {
	private ArrayList<String> listAuteurs = new ArrayList<>();
	private ArrayList<String> listEditeurs = new ArrayList<>();
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

	public Ouvrage RechercherRef(String ref) {
		for (Ouvrage O : listOuvrages.values()) {
			if (O.getReference().equals(ref)){
				return O;
			}
		}
		return null;

	}

	public ArrayList<String> ajouterAuteur(String aut) {
		listAuteurs.add(aut);
		return listAuteurs;

	}

	/*public ArrayList<Ouvrage> rechercherParTitre(String titre) {
		ArrayList<Ouvrage> resOuvrage = new ArrayList<>();
		for (Ouvrage l : listOuvrages.values()) {
			if (l.getTitre().equals(titre)) {
				resOuvrage.add(l);
			}
		}
		return resOuvrage;

	}*/

	public ArrayList<String> ajouterEditeur(String editor) {
		listEditeurs.add(editor);
		return listEditeurs;

	}

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
	
	public void afficher() {
		System.out.println("\n======== LISTE OUVRAGES ========");
		listOuvrages.forEach((k,v)->System.out.println(v.toString()));
		System.out.println("\n================================");
	}

}
