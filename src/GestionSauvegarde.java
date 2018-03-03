import bibliotheque.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public abstract class GestionSauvegarde {
	
	public void chargement() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();


	      try {

	         // Création de notre parseur via la factory

	         DocumentBuilder builder = factory.newDocumentBuilder();

	         File fileXML = new File("test.xml");


	         // parsing de notre fichier via un objet File et récupération d'un

	         // objet Document

	         // Ce dernier représente la hiérarchie d'objet créée pendant le parsing

	         Document xml = builder.parse(fileXML);


	         // Via notre objet Document, nous pouvons récupérer un objet Element

	         // Ce dernier représente un élément XML mais, avec la méthode ci-dessous,

	         // cet élément sera la racine du document

	         Element root = xml.getDocumentElement();

	         System.out.println(root.getNodeName());


	      } catch (ParserConfigurationException e) {

	          e.printStackTrace();

	       } catch (SAXException e) {

	          e.printStackTrace();

	       } catch (IOException e) {

	          e.printStackTrace();

	       }

	}
	
	public void sauvegarde(Ouvrage ouvrage) {
		
	}
	
	public void sauvegarde(Usagers usager) {
		
	}
}
