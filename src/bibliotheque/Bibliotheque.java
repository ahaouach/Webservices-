package bibliotheque;

public class Bibliotheque {
	private String nom;
	
	public Bibliotheque() {
		this.nom = "";
	}
	
	public Bibliotheque(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Bibliotheque :" + nom ;
	}
}
