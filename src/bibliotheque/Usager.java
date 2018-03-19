package bibliotheque;

import java.util.ArrayList;


public class Usager {
	private String id;
	private String datenaiss;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;

	//public static HashMap<String, Ouvrage> listEmpruntUser = new HashMap<>(); // liste des emprunt de chaque user
	public ArrayList<String> listEmpruntUser = new ArrayList<>();

	public Usager(String idUsager, String datenaiss, String nom, String prenom, String adresse, String email, ArrayList<String> listEmpruntUser) {

		super();
		this.id = idUsager;
		this.datenaiss = datenaiss;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.listEmpruntUser = listEmpruntUser;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(String datenaiss) {
		this.datenaiss = datenaiss;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public ArrayList<String> getListEmpruntUser() {
		return listEmpruntUser;
	}

	public void setListEmpruntUser(ArrayList<String> listEmpruntUser) {
		this.listEmpruntUser = listEmpruntUser;
	}

	public boolean equals(Usager o) {
		if (!(o instanceof Usager)) {
			return false;
		}
		Usager user = (Usager) o;
		return getId().equals(user.id);

	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((datenaiss == null) ? 0 : datenaiss.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listEmpruntUser == null) ? 0 : listEmpruntUser.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}
	
	public String toString() {
		StringBuffer liste = new StringBuffer("\nListe des Emprunts: \n");
		for (String s : listEmpruntUser) {
			liste.append(s + " ");
		}
		StringBuffer nbre = new StringBuffer("\nNombre d'emprunt(s): " + listEmpruntUser.size());
		
		return "\nUsager [ Id : " + id + ", Date de naissance = " + datenaiss + ", Nom : " + nom + ", Prenom : " + prenom + ", Adresse : "
				+ adresse + ", Email : " + email + " ] " + nbre + liste;
	}
	

}
