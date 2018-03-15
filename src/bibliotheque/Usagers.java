package bibliotheque;

import java.util.ArrayList;
import java.util.HashMap;

public class Usagers {

	private HashMap<String, Usager> listUsagers = new HashMap<>();

	public Usagers(HashMap<String, Usager> listUsagers) {
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
		listUsagers.put(usager.getId(), usager);

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
}
