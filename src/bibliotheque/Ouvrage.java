package bibliotheque;

public class Ouvrage {
	private String Reference;
	private String Titre;
	private String Edition;
	private int Annee;
	private String ISBN;
	private int NbrExemplaire;
	private String Commentaires;
	private String Categorie;
	private String Auteur;
	private String Editeur;
	private boolean Disponible; 
	private boolean Emprunte = false;

	

	public Ouvrage(String reference, String titre, String edition, int annee, String iSBN, int nbrExemplaire,
			String commentaires, String categorie, String auteur, String editeur, boolean disponible,
			boolean emprunte) {
		super();
		Reference = reference;
		Titre = titre;
		Edition = edition;
		Annee = annee;
		ISBN = iSBN;
		NbrExemplaire = nbrExemplaire;
		Commentaires = commentaires;
		Categorie = categorie;
		Auteur = auteur;
		Editeur = editeur;
		Disponible = disponible;
		Emprunte = emprunte;
	}




	public String getReference() {
		return Reference;
	}




	public void setReference(String reference) {
		Reference = reference;
	}




	public String getAuteur() {
		return Auteur;
	}




	public void setAuteur(String auteur) {
		Auteur = auteur;
	}




	public String getEditeur() {
		return Editeur;
	}




	public void setEditeur(String editeur) {
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
		StringBuffer str = new StringBuffer("Ouvrage [ Reference : " + Reference + ", Auteur(s) :" + Auteur + ", Editeur : " + Editeur + ", Titre: " + Titre
				+ ", Edition : " + Edition + ", ISBN : " + ISBN + ", NbrExemplaire : " + NbrExemplaire + ", Categorie : " + Categorie +", Commentaires : "
				+ Commentaires);
		if(Disponible)
			str.append(", Disponible : Oui");
		else 
			str.append(", Disponible : Non");
			
		if(Emprunte)
			str.append(", Emprunte : Oui");
		else
			str.append(", Emprunte : Non");
			
		return str.append(" ] ").toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Annee;
		result = prime * result + ((Auteur == null) ? 0 : Auteur.hashCode());
		result = prime * result + ((Commentaires == null) ? 0 : Commentaires.hashCode());
		result = prime * result + (Disponible ? 1231 : 1237);
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
