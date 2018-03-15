package bibliotheque;


public class Auteur {
	private String idAuteur;
	private String nomAuteur;
	private String prenomAuteur;

	public Auteur() {
		this.idAuteur = "";
		this.nomAuteur = "";
		this.prenomAuteur = "";
	}

	public Auteur(String idAuteur, String nomAuteur, String prenomAuteur) {
		super();
		this.idAuteur = idAuteur;
		this.nomAuteur = nomAuteur;
		this.prenomAuteur = prenomAuteur;
	}

	public String getIdAuteur() {
		return idAuteur;
	}

	public void setIdAuteur(String idAuteur) {
		this.idAuteur = idAuteur;
	}

	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}

	public String getPrenomAuteur() {
		return prenomAuteur;
	}

	public void setPrenomAuteur(String prenomAuteur) {
		this.prenomAuteur = prenomAuteur;
	}

	@Override
	public String toString() {
		return "Auteur [idAuteur=" + idAuteur + ", nomAuteur=" + nomAuteur + ", prenomAuteur=" + prenomAuteur + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Auteur))
			return false;
		Auteur a = (Auteur) obj;
		return idAuteur.equals(a.getIdAuteur()) && nomAuteur.equals(a.getNomAuteur())
				&& prenomAuteur.equals(a.getPrenomAuteur());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAuteur == null) ? 0 : idAuteur.hashCode());
		result = prime * result + ((nomAuteur == null) ? 0 : nomAuteur.hashCode());
		result = prime * result + ((prenomAuteur == null) ? 0 : prenomAuteur.hashCode());
		return result;
	}

}
