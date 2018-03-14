package controller;
import bibliotheque.*;

import java.util.ArrayList;
import java.util.HashMap;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public abstract class GestionSauvegarde {
	
	public static void chargement() {

        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {

            final DocumentBuilder builder = factory.newDocumentBuilder();
            final Document document= builder.parse(new File("Bibliotheque.xml"));

	        //Affichage du prologue
	
	        System.out.println("************* PROLOGUE ************");
	
	        System.out.println("version : " + document.getXmlVersion());
	
	        System.out.println("encodage : " + document.getXmlEncoding());      
	
	        System.out.println("standalone : " + document.getXmlStandalone());


	        final Element racine = document.getDocumentElement();

        

	        //Affichage de l'élément racine
	
	        System.out.println("\n************* RACINE ************");
	        System.out.println(racine.getNodeName());

   

	        final NodeList racineNoeuds = racine.getChildNodes();
	        final int nbRacineNoeuds = racineNoeuds.getLength();
	
	            
	        
	        for (int i = 0; i<nbRacineNoeuds; i++) {
	        	//Ouvrages et Usagers
	        	if(racineNoeuds.item(i).getNodeType() == Node.ELEMENT_NODE) {
		        	System.out.println("\n************* " + racineNoeuds.item(i).getNodeName() + " *************");
		        	
		        	final NodeList ouvragesNoeuds = racineNoeuds.item(i).getChildNodes();
		        	final int nbOuvragesNoeuds = ouvragesNoeuds.getLength();
		        	
		        		for (int j = 0; j < nbOuvragesNoeuds; j++) {
		        			//Theme
		        			if(ouvragesNoeuds.item(j).getNodeType() == Node.ELEMENT_NODE) {
			        			System.out.println("\n======== " + ouvragesNoeuds.item(j).getNodeName() + " ========");
			        			
			        			final NodeList themeNoeuds = ouvragesNoeuds.item(j).getChildNodes();
			        			final int nbThemeNoeuds = themeNoeuds.getLength();
			        			
			        			for (int k = 0; k < nbThemeNoeuds; k++) {
			        				//Libelle et Ouvrage
			        				if(themeNoeuds.item(k).getNodeType() == Node.ELEMENT_NODE) {
			        					System.out.println("\n~~~~~ " + themeNoeuds.item(k).getNodeName() + " ~~~~~ " + themeNoeuds.item(k).getTextContent());
			        					
			        					final NodeList ouvrageNoeuds = themeNoeuds.item(k).getChildNodes();
			        					final int nbOuvrageNoeuds = ouvrageNoeuds.getLength();
			        					
			        					for (int l = 0; l < nbOuvrageNoeuds; l++) {
			        						//Ouvrage
			        						if(ouvrageNoeuds.item(l).getNodeType() == Node.ELEMENT_NODE) {
			        							System.out.println(ouvrageNoeuds.item(l).getNodeName() + " : " + ouvrageNoeuds.item(l).getTextContent());
			        						}
			        					}
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

	}
	
	public static void sauvegarde(Ouvrage ouvrage) {
		
	}
	
	public static void sauvegarde(Usager usager) {
		
	}
}
