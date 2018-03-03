package bibliotheque;


import java.sql.Timestamp;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity*/
public class Ouvrage {
	private String Reference;
	private Auteur Auteur;
	private Editeur Editeur;
	private String Titre;
	private String Edition;
	private String ISBN;
	private int NbrExemplaire;
	private String Commentaires;
	
	public Ouvrage() {
		Reference = "";
		Auteur = new Auteur();
		Editeur = new Editeur();
		Titre = "";
		Edition = "";
		ISBN = "";
		NbrExemplaire = 0;
		Commentaires = "";
	}
	
	public Ouvrage(String reference, Auteur auteur, Editeur editeur, String titre, String edition, String iSBN, int nbr,
			String commentaires) {
		super();
		Reference = reference;
		Auteur = auteur;
		Editeur = editeur;
		Titre = titre;
		Edition = edition;
		ISBN = iSBN;
		NbrExemplaire = nbr;
		Commentaires = commentaires;
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

	@Override
	public String toString() {
		return "Ouvrage [Reference=" + Reference + ", Auteur=" + Auteur + ", Editeur=" + Editeur + ", Titre=" + Titre
				+ ", Edition=" + Edition + ", ISBN=" + ISBN + ", NbrExemplaire=" + NbrExemplaire + ", Commentaires="
				+ Commentaires + "]";
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