package bibliotheque;

import java.util.HashMap;

public class Usager {
	private String idUsager;
	private String datenaiss;
	private String nom;
	private String prenom;
	private String address;
	public static HashMap<String, Ouvrage> listEmpruntUser = new HashMap<>(); // liste des emprunt de chaque user

	public Usager(String idUsager, String datenaiss, String nom, String prenom, String address) {
		super();
		this.idUsager = idUsager;
		this.datenaiss = datenaiss;
		this.nom = nom;
		this.prenom = prenom;
		this.address = address;

	}

	public String getIdUsager() {
		return idUsager;
	}

	public void setIdUsager(String idUsager) {
		this.idUsager = idUsager;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public HashMap<String, Ouvrage> getListEmpruntUser() {
		return listEmpruntUser;
	}

	public void setListEmpruntUser(HashMap<String, Ouvrage> listEmpruntUser) {
		this.listEmpruntUser = listEmpruntUser;
	}

	public boolean equals(Usager o) {
		if (!(o instanceof Usager)) {
			return false;
		}
		Usager user = (Usager) o;
		return getIdUsager().equals(user.idUsager);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsager == null) ? 0 : idUsager.hashCode());
		return result;
	}

}
