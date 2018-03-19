package controller;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import bibliotheque.Ouvrage;
import bibliotheque.Usager;


public class GestionSauvegarde {

	public static void sauvegarde(Ouvrage ouvrage, String theme) {

		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			final DocumentBuilder builder = factory.newDocumentBuilder();
			final Document document = builder.parse(new File("Bibliotheque.xml"));

			final Element racine = document.getDocumentElement();

			// Elément racine

			System.out.println(racine.getNodeName());

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
							final Element libelle = (Element) ouvragesNoeuds.item(j);

							if (theme.contains(libelle.getAttribute("Libelle"))) {
								
								System.out.println("Ajout ouvrage...\n");

								final Element ouv = (Element) document.createElement("Ouvrage");
								ouv.setAttribute("Disponible", "" + ouvrage.getDisponible());
								ouv.setAttribute("Emprunte", "" + ouvrage.getEmprunte());

								final Element ref = (Element) document.createElement("Reference");
								ref.appendChild(document.createTextNode(ouvrage.getReference()));

								final Element titre = (Element) document.createElement("Titre");
								titre.appendChild(document.createTextNode(ouvrage.getTitre()));

								final Element edition = (Element) document.createElement("Edition");
								edition.appendChild(document.createTextNode(ouvrage.getEdition()));

								final Element annee = (Element) document.createElement("Annee");
								annee.appendChild(document.createTextNode("" + ouvrage.getAnnee()));

								final Element isbn = (Element) document.createElement("ISBN");
								isbn.appendChild(document.createTextNode(ouvrage.getISBN()));

								final Element nbreEx = (Element) document.createElement("NbreExemplaires");
								nbreEx.appendChild(document.createTextNode("" + ouvrage.getNbrExemplaire()));

								final Element com = (Element) document.createElement("Commentaires");
								com.appendChild(document.createTextNode(ouvrage.getCommentaires()));

								final Element cat = (Element) document.createElement("Categorie");
								cat.appendChild(document.createTextNode(ouvrage.getCategorie()));

								final Element auteur = (Element) document.createElement("Auteur");
								auteur.appendChild(document.createTextNode(ouvrage.getAuteur().toString()));

								final Element editeur = (Element) document.createElement("Editeur");
								editeur.appendChild(document.createTextNode(ouvrage.getEditeur().toString()));

								ouvragesNoeuds.item(j).appendChild(ouv);

								ouv.appendChild(ref);
								ouv.appendChild(titre);
								ouv.appendChild(edition);
								ouv.appendChild(annee);
								ouv.appendChild(isbn);
								ouv.appendChild(nbreEx);
								ouv.appendChild(com);
								ouv.appendChild(cat);
								ouv.appendChild(auteur);
								ouv.appendChild(editeur);

								// Sauvegarde
								final TransformerFactory transformerFactory = TransformerFactory.newInstance();
								final Transformer transformer = transformerFactory.newTransformer();
								final DOMSource source = new DOMSource(document);
								final StreamResult sortie = new StreamResult(new File("Bibliotheque.xml"));

								// formatage
								transformer.setOutputProperty(OutputKeys.INDENT, "yes");
								transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

								// sortie
								transformer.transform(source, sortie);
								
								System.out.println(ouvrage);
								System.out.println("Ouvrage ajouté dans le thème : "+ theme);

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

		catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}

		catch (TransformerException e) {
			e.printStackTrace();
		}

	}
	
	public static void sauvegarde(Usager nouvUsager) {
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {

			final DocumentBuilder builder = factory.newDocumentBuilder();
			final Document document = builder.parse(new File("Bibliotheque.xml"));

			final Element racine = document.getDocumentElement();

			// Elément racine

			System.out.println(racine.getNodeName());

			final NodeList racineNoeuds = racine.getChildNodes();
			final int nbRacineNoeuds = racineNoeuds.getLength();

			for (int i = 0; i < nbRacineNoeuds; i++) {
				// Ouvrages et Usagers
				if (racineNoeuds.item(i).getNodeType() == Node.ELEMENT_NODE
						&& racineNoeuds.item(i).getNodeName().equals("Usagers")) { // Usagers
					
					System.out.println("Ajout nouvel usagé...\n");
					
					final Element usager = (Element) document.createElement("Usager");
					
					final Element id = (Element) document.createElement("IdUsager");
					id.appendChild(document.createTextNode(nouvUsager.getId()));

					final Element nom = (Element) document.createElement("NomUsager");
					nom.appendChild(document.createTextNode(nouvUsager.getNom()));

					final Element prenom = (Element) document.createElement("PrenomUsager");
					prenom.appendChild(document.createTextNode(nouvUsager.getPrenom()));

					final Element dateNaiss = (Element) document.createElement("Datenaiss");
					dateNaiss.appendChild(document.createTextNode(nouvUsager.getDatenaiss()));

					final Element adr = (Element) document.createElement("Adresse");
					adr.appendChild(document.createTextNode(nouvUsager.getAdresse()));
					
					final Element mail = (Element) document.createElement("Email");
					mail.appendChild(document.createTextNode(nouvUsager.getEmail()));
					
					final Element emprunts = (Element) document.createElement("Emprunts");
					emprunts.setAttribute("NbreEmprunt", "" + nouvUsager.listEmpruntUser.size());
					
					for(int j=0; j < nouvUsager.listEmpruntUser.size(); j++) {
						
						final Element ref = (Element) document.createElement("Reference");
						ref.appendChild(document.createTextNode(nouvUsager.listEmpruntUser.get(j)));
						emprunts.appendChild(ref);
					}

					racineNoeuds.item(i).appendChild(usager);

					usager.appendChild(id);
					usager.appendChild(nom);
					usager.appendChild(prenom);
					usager.appendChild(dateNaiss);
					usager.appendChild(adr);
					usager.appendChild(mail);
					usager.appendChild(emprunts);
					

					// Sauvegarde
					final TransformerFactory transformerFactory = TransformerFactory.newInstance();
					final Transformer transformer = transformerFactory.newTransformer();
					final DOMSource source = new DOMSource(document);
					final StreamResult sortie = new StreamResult(new File("Bibliotheque.xml"));

					// formatage
					transformer.setOutputProperty(OutputKeys.INDENT, "yes");
					transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

					// sortie
					transformer.transform(source, sortie);
					
					System.out.println(nouvUsager);
					System.out.println("Usager Ajouté !");
					
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

		catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}

		catch (TransformerException e) {
			e.printStackTrace();
		}

	}
}
