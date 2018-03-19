package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import bibliotheque.Ouvrage;
import bibliotheque.Usager;
import bibliotheque.Usagers;

public class GestionChargement {
	
	public static void chargement(GestionOuvrage donneesOuvragesChargees) {
		System.out.println("\nDEBUT CHARGEMENT DONNEES OUVRAGES");
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			final DocumentBuilder builder = factory.newDocumentBuilder();
			final Document document = builder.parse(new File("Bibliotheque.xml"));

			final Element racine = document.getDocumentElement();

			//Elément racine

			final NodeList racineNoeuds = racine.getChildNodes();
			final int nbRacineNoeuds = racineNoeuds.getLength();

			for (int i = 0; i < nbRacineNoeuds; i++) {
				// Ouvrages et Usagers
				if (racineNoeuds.item(i).getNodeType() == Node.ELEMENT_NODE
						&& racineNoeuds.item(i).getNodeName().equals("Ouvrages")) { // Ouvrages

					final NodeList ouvragesNoeuds = racineNoeuds.item(i).getChildNodes();
					final int nbOuvragesNoeuds = ouvragesNoeuds.getLength();

					for (int j = 0; j < nbOuvragesNoeuds; j++) {
						// Theme

						if (ouvragesNoeuds.item(j).getNodeType() == Node.ELEMENT_NODE) {
							// Libelle
							//final Element libelle = (Element) ouvragesNoeuds.item(j);
							
							final NodeList themeNoeuds = ouvragesNoeuds.item(j).getChildNodes();
							final int nbThemeNoeuds = themeNoeuds.getLength();

							for (int k = 0; k < nbThemeNoeuds; k++) {
								// Ouvrage
								if (themeNoeuds.item(k).getNodeType() == Node.ELEMENT_NODE) {

									// Disponibilite et Etat emprunt
									final Element Dispo = (Element) themeNoeuds.item(k);
									final Element Emprunt = (Element) themeNoeuds.item(k);

									final NodeList ouvrageNoeuds = themeNoeuds.item(k).getChildNodes();
									final int nbOuvrageNoeuds = ouvrageNoeuds.getLength();
									
									String ref=""; 
									String titre="";
									String edition="";
									int annee=0;
									String iSBN="";
									int nbrEx=0;
									String com="";
									String cat="";
									String aut="";
									String edit="";
									boolean dispo=false;
									boolean empr=false;
									
									for (int l = 0; l < nbOuvrageNoeuds; l++) {
										// Elements d'un ouvrage
										if (ouvrageNoeuds.item(l).getNodeType() == Node.ELEMENT_NODE) {
											
											if(ouvrageNoeuds.item(l).getNodeName().equals("Reference")) ref = ouvrageNoeuds.item(l).getTextContent();
											if(ouvrageNoeuds.item(l).getNodeName().equals("Titre")) titre = ouvrageNoeuds.item(l).getTextContent();
											if(ouvrageNoeuds.item(l).getNodeName().equals("Edition")) edition = ouvrageNoeuds.item(l).getTextContent();
											if(ouvrageNoeuds.item(l).getNodeName().equals("Annee")) annee = Integer.parseInt(ouvrageNoeuds.item(l).getTextContent());
											if(ouvrageNoeuds.item(l).getNodeName().equals("ISBN")) iSBN = ouvrageNoeuds.item(l).getTextContent();
											if(ouvrageNoeuds.item(l).getNodeName().equals("NbreExemplaires")) nbrEx = Integer.parseInt(ouvrageNoeuds.item(l).getTextContent());
											if(ouvrageNoeuds.item(l).getNodeName().equals("Commentaires")) com = ouvrageNoeuds.item(l).getTextContent();
											if(ouvrageNoeuds.item(l).getNodeName().equals("Categorie")) cat = ouvrageNoeuds.item(l).getTextContent();
											if(ouvrageNoeuds.item(l).getNodeName().equals("Auteur")) aut = ouvrageNoeuds.item(l).getTextContent();
											if(ouvrageNoeuds.item(l).getNodeName().equals("Editeur")) edit = ouvrageNoeuds.item(l).getTextContent();
											if(ouvrageNoeuds.item(l).getNodeName().equals("Disponible")) dispo = Boolean.parseBoolean(Dispo.getAttribute("Disponible"));
											if(ouvrageNoeuds.item(l).getNodeName().equals("Emprunte")) empr = Boolean.parseBoolean(Emprunt.getAttribute("Emprunte"));
											
										}
									}
									
									//Chargement dans la liste des ouvrages
									Ouvrage o = new Ouvrage(ref, titre, edition, annee, iSBN, nbrEx, com, cat, aut, edit, dispo, empr);
									donneesOuvragesChargees.ajouter(o);

								}
							}
						}
					}
				}
			}
			
		}

		catch (final ParserConfigurationException e) {
			e.printStackTrace();
		}

		catch (final SAXException e) {
			e.printStackTrace();
		}

		catch (final IOException e) {
			e.printStackTrace();
		}
		
		donneesOuvragesChargees.afficher();
		System.out.println("\nFIN CHARGEMENT DONNEES OUVRAGES");
	}
	
	public static void chargement(Usagers donneesUsagersChargees) {
		System.out.println("\nDEBUT CHARGEMENT DONNEES USAGERS");
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			final DocumentBuilder builder = factory.newDocumentBuilder();
			final Document document = builder.parse(new File("Bibliotheque.xml"));

			final Element racine = document.getDocumentElement();

			//Elément racine

			final NodeList racineNoeuds = racine.getChildNodes();
			final int nbRacineNoeuds = racineNoeuds.getLength();

			for (int i = 0; i < nbRacineNoeuds; i++) {
				// Usagers
				if (racineNoeuds.item(i).getNodeType() == Node.ELEMENT_NODE
						&& racineNoeuds.item(i).getNodeName().equals("Usagers")) { // Usagers

					final NodeList usagersNoeuds = racineNoeuds.item(i).getChildNodes();
					final int nbUsagersNoeuds = usagersNoeuds.getLength();

					for (int j = 0; j < nbUsagersNoeuds; j++) {
						// Usager

						if (usagersNoeuds.item(j).getNodeType() == Node.ELEMENT_NODE) {

							final NodeList usagerNoeuds = usagersNoeuds.item(j).getChildNodes();
							final int nbUsagerNoeuds = usagerNoeuds.getLength();
							
							String idUsager="";
							String datenaiss="";
							String nom="";
							String prenom="";
							String adresse="";
							String email="";
							ArrayList<String> listEmpruntUser = new ArrayList<>();
							
							for (int k = 0; k < nbUsagerNoeuds; k++) {
								// Elements d'un usager
								if (usagerNoeuds.item(k).getNodeType() == Node.ELEMENT_NODE) {

									if(usagerNoeuds.item(k).getNodeName().equals("IdUsager")) idUsager = usagerNoeuds.item(k).getTextContent();
									if(usagerNoeuds.item(k).getNodeName().equals("NomUsager")) datenaiss = usagerNoeuds.item(k).getTextContent();
									if(usagerNoeuds.item(k).getNodeName().equals("PrenomUsager")) nom = usagerNoeuds.item(k).getTextContent();
									if(usagerNoeuds.item(k).getNodeName().equals("Datenaiss")) prenom = usagerNoeuds.item(k).getTextContent();
									if(usagerNoeuds.item(k).getNodeName().equals("Adresse")) adresse = usagerNoeuds.item(k).getTextContent();
									if(usagerNoeuds.item(k).getNodeName().equals("Email")) email = usagerNoeuds.item(k).getTextContent();
									
									final NodeList EmpruntsNoeuds = usagerNoeuds.item(k).getChildNodes();
									final int NbreEmpruntNoeuds = EmpruntsNoeuds.getLength();
									
									for (int l = 0; l < NbreEmpruntNoeuds; l++) {
										//Emprunts de l'usager
										if (EmpruntsNoeuds.item(l).getNodeType() == Node.ELEMENT_NODE) {
											if(EmpruntsNoeuds.item(l).getNodeName().equals("Reference")) {
												listEmpruntUser.add(EmpruntsNoeuds.item(l).getTextContent());
											}
										}
									}
								}
							}
							
							//Chargement dans la liste des ouvrages
							Usager u = new Usager(idUsager, datenaiss, nom, prenom, adresse, email, listEmpruntUser);
							donneesUsagersChargees.AjouterUsagers(u);
						}
					}
				}
			}
			
		}

		catch (final ParserConfigurationException e) {
			e.printStackTrace();
		}

		catch (final SAXException e) {
			e.printStackTrace();
		}

		catch (final IOException e) {
			e.printStackTrace();
		}
		
		donneesUsagersChargees.afficher();
		System.out.println("\nFIN CHARGEMENT DONNEES USAGERS");
	}

}
