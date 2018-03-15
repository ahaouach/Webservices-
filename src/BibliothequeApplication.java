import bibliotheque.*;
import controller.*;

public class BibliothequeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenue dans la bibliothèque!");
		
		bibliotheque.Ouvrage o1 = new bibliotheque.Ouvrage("002ART",
															new Auteur("10","Momo","Kourouma"),
															new Editeur("5", "HACHETTE"),
															2010,
															"Trop de boulot",
															"3",
															"02156",
															150,
															"Oh! Faut bosser...",
															true,
															"Cinema",
															false);
		
		bibliotheque.Ouvrage o2 = new bibliotheque.Ouvrage("003SCI",
															new Auteur("6","David","Auber"),
															new Editeur("3", "ATLAS"),
															2007,
															"Programmation JAVA/C++",
															"1",
															"21350",
															200,
															"Programmation objet avancee",
															true,
															"Informatique",
															false);
		
		//controller.GestionSauvegarde.sauvegarde(o1, "Art");
		//controller.GestionSauvegarde.sauvegarde(o2, "Science");
		
		bibliotheque.Usager u1 = new Usager("4", "27/05/1993", "Bourne", "Jason", "3 rue Lyautey, 33600, Pessac, France", "json.bourne@email.com");
		controller.GestionSauvegarde.sauvegarde(u1);
		
		controller.GestionSauvegarde.chargement();
		
	}

}
