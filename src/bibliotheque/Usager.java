package bibliotheque;

import java.util.HashMap;

public class Usager {
	private String id;
	private String datenaiss;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;

	public static HashMap<String, Ouvrage> listEmpruntUser = new HashMap<>(); // liste des emprunt de chaque user

	public Usager(String idUsager, String datenaiss, String nom, String prenom, String adresse, String email) {
		super();
		this.id = idUsager;
		this.datenaiss = datenaiss;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;

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

	public HashMap<String, Ouvrage> getListEmpruntUser() {
		return listEmpruntUser;
	}

	public void setListEmpruntUser(HashMap<String, Ouvrage> listEmpruntUser) {
		Usager.listEmpruntUser = listEmpruntUser;
	}

	public boolean equals(Usager o) {
		if (!(o instanceof Usager)) {
			return false;
		}
		Usager user = (Usager) o;
		return getId().equals(user.id);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


}
