package bibliotheque;

public class Editeur {
	private String idEditeur;
	private String maisonEdition;

	public Editeur(String id_Editeur, String maison_Edition) {
		super();
		idEditeur = id_Editeur;
		maisonEdition = maison_Edition;
	}

	public String getIdEditeur() {
		return idEditeur;
	}

	public void setIdEditeur(String id_Editeur) {
		idEditeur = id_Editeur;
	}

	public String getMaisonEdition() {
		return maisonEdition;
	}

	@Override
	public String toString() {
		return "Editeur [Id_Editeur=" + idEditeur + ", Maison_Edition=" + maisonEdition + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEditeur == null) ? 0 : idEditeur.hashCode());
		result = prime * result + ((maisonEdition == null) ? 0 : maisonEdition.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Editeur))
			return false;
		Editeur e = (Editeur) obj;
		return idEditeur.equals(e.getIdEditeur()) && maisonEdition.equals(e.getMaisonEdition());
	}

}
