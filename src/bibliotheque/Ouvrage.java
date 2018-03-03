package bibliotheque;

public class Ouvrage {
	private String Reference;
	private Auteur Auteur;
	private Editeur Editeur;
	private String Titre;
	private String Edition;
	private String ISBN;
	private int NbrExemplaire;
	private String Commentaires;
	private Boolean Disponible;
	private String Categorie; 
	private boolean emprunte = false	;
	public boolean getEmprunte;
	
	

	

	public Ouvrage(String reference, bibliotheque.Auteur auteur, bibliotheque.Editeur editeur, String titre,
			String edition, String iSBN, int nbrExemplaire, String commentaires, Boolean disponible, String categorie,
			boolean emprunte) {
		super();
		Reference = reference;
		Auteur = auteur;
		Editeur = editeur;
		Titre = titre;
		Edition = edition;
		ISBN = iSBN;
		NbrExemplaire = nbrExemplaire;
		Commentaires = commentaires;
		Disponible = disponible;
		Categorie = categorie;
		this.emprunte = emprunte;
	}

	
	public String getReference() {
		return Reference;
	}

	public void setReferance(String reference) {
		Reference = reference;
	}

	public Auteur getAuteur() {
		return Auteur;
	}

	public void setAuteur(Auteur auteur) {
		Auteur = auteur;
	}

	public Editeur getEditeur() {
		return Editeur;
	}

	public void setEditeur(Editeur editeur) {
		Editeur = editeur;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getEdition() {
		return Edition;
	}

	public void setEdition(String edition) {
		Edition = edition;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNbr() {
		return NbrExemplaire;
	}

	public void setNbr(int nbr) {
		NbrExemplaire = nbr;
	}

	public String getCommentaires() {
		return Commentaires;
	}

	public void setCommentaires(String commentaires) {
		Commentaires = commentaires;
	}

	public int getNbrExemplaire() {
		return NbrExemplaire;
	}

	public void setNbrExemplaire(int nbrExemplaire) {
		NbrExemplaire = nbrExemplaire;
	}

	public void setReference(String reference) {
		Reference = reference;
	}

	public Boolean getDisponible() {
		return Disponible;
	}

	public void setDisponible(Boolean disponible) {
		Disponible = disponible;
	}

	public String getCategorie() {
		return Categorie;
	}

	public void setCategorie(String categorie) {
		Categorie = categorie;
	}

	public boolean getEmprunte() {
		return emprunte;
	}

	public void setEmprunte(boolean emprunte) {
		this.emprunte = emprunte;
	}

	@Override
	public String toString() {
		return "Ouvrage [Reference=" + Reference + ", Auteur=" + Auteur + ", Editeur=" + Editeur + ", Titre=" + Titre
				+ ", Edition=" + Edition + ", ISBN=" + ISBN + ", NbrExemplaire=" + NbrExemplaire + ", Commentaires="
				+ Commentaires + ", Disponible=" + Disponible + ", Categorie=" + Categorie + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Auteur == null) ? 0 : Auteur.hashCode());
		result = prime * result + ((Commentaires == null) ? 0 : Commentaires.hashCode());
		result = prime * result + ((Editeur == null) ? 0 : Editeur.hashCode());
		result = prime * result + ((Edition == null) ? 0 : Edition.hashCode());
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + NbrExemplaire;
		result = prime * result + ((Reference == null) ? 0 : Reference.hashCode());
		result = prime * result + ((Titre == null) ? 0 : Titre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ouvrage))
			return false;
		Ouvrage o = (Ouvrage) obj;
		return Reference.equals(o.getReference());
	}

}
