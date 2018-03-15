package bibliotheque;


public class Ouvrage {
	private String Reference;
	private Auteur Auteur;
	private Editeur Editeur;
	private int Annee;
	private String Titre;
	private String Edition;
	private String ISBN;
	private int NbrExemplaire;
	private String Commentaires;
	private boolean Disponible;
	private String Categorie; 
	private boolean Emprunte = false;


	public Ouvrage(String reference, bibliotheque.Auteur auteur, bibliotheque.Editeur editeur, int annee, String titre,
			String edition, String iSBN, int nbrExemplaire, String commentaires, boolean disponible, String categorie,
			boolean emprunte) {
		super();
		Reference = reference;
		Auteur = auteur;
		Editeur = editeur;
		Annee = annee;
		Titre = titre;
		Edition = edition;
		ISBN = iSBN;
		NbrExemplaire = nbrExemplaire;
		Commentaires = commentaires;
		Disponible = disponible;
		Categorie = categorie;
		Emprunte = emprunte;
	}

	
	

	public String getReference() {
		return Reference;
	}




	public void setReference(String reference) {
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




	public int getAnnee() {
		return Annee;
	}




	public void setAnnee(int annee) {
		Annee = annee;
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




	public int getNbrExemplaire() {
		return NbrExemplaire;
	}




	public void setNbrExemplaire(int nbrExemplaire) {
		NbrExemplaire = nbrExemplaire;
	}




	public String getCommentaires() {
		return Commentaires;
	}




	public void setCommentaires(String commentaires) {
		Commentaires = commentaires;
	}




	public boolean getDisponible() {
		return Disponible;
	}




	public void setDisponible(boolean disponible) {
		Disponible = disponible;
	}




	public String getCategorie() {
		return Categorie;
	}




	public void setCategorie(String categorie) {
		Categorie = categorie;
	}




	public boolean getEmprunte() {
		return Emprunte;
	}




	public void setEmprunte(boolean emprunte) {
		Emprunte = emprunte;
	}




	@Override
	public String toString() {
		return "Ouvrage [Reference=" + Reference + ", Auteur=" + Auteur + ", Editeur=" + Editeur + ", Titre=" + Titre
				+ ", Edition=" + Edition + ", ISBN=" + ISBN + ", NbrExemplaire=" + NbrExemplaire + ", Commentaires="
				+ Commentaires + ", Disponible=" + Disponible + ", Categorie=" + Categorie + ", Emprunte=" + Emprunte
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Annee;
		result = prime * result + ((Auteur == null) ? 0 : Auteur.hashCode());
		result = prime * result + ((Categorie == null) ? 0 : Categorie.hashCode());
		result = prime * result + ((Commentaires == null) ? 0 : Commentaires.hashCode());
		result = prime * result + (Disponible ? 1231 : 1237);
		result = prime * result + ((Editeur == null) ? 0 : Editeur.hashCode());
		result = prime * result + ((Edition == null) ? 0 : Edition.hashCode());
		result = prime * result + (Emprunte ? 1231 : 1237);
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
