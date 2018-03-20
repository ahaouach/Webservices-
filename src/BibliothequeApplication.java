import java.awt.Container;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.net.URL;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import bibliotheque.Usagers;
import controller.GestionOuvrage;

/**
 * 
 * @author Kourouma Sékou Mohamed, Ahaouach Azelarab , Meleiro Lucille
 * @version 1.0
 * 
 * Cette application permet la gestion d'une bibliothèque en interne c'est à dire pour le personnel
 * qui assure les services d'emprunt et de retour des ouvrages.
 * Elle permet aussi au personnel de gérer les usagers de la bibliothèque.
 *
 */

public class BibliothequeApplication extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public BibliothequeApplication() {
		super("BIBLIOTHEQUE");
		
		Container content = getContentPane();
		JPanel message = new JPanel();
		JPanel boutons = new JPanel();
		message.setLayout(new GridLayout(0, 1));
		boutons.setLayout(new GridLayout(0, 2));
		JButton quit = new JButton("Quitter");
		JButton lunch = new JButton("Lancer");
		JLabel msg1 = new JLabel("Bienvenue sur l'application de la bibliothèque!");
		JLabel msg2 = new JLabel("Laissez cette fênetre ouverte pendant son utilisation...");
		
		message.add(msg1);
		message.add(msg2);
		boutons.add(lunch);
		boutons.add(quit);
		message.add(boutons);
		content.add(message);		
		
		quit.addActionListener(e -> {
			if(quitter() == JOptionPane.YES_OPTION) {
				System.out.println("\nAu revoir, à bientôt!");
				System.exit(0);
			}
		});
		
		lunch.addActionListener(e -> {
			try {
			    Desktop.getDesktop().browse(new URL("http://localhost:8080/Bibliotheque/").toURI());
			} catch (Exception e1) {
			    e1.printStackTrace();
			}
		});
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
	
	public int quitter() {
		return JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment fermer l'application?", "Quitter", JOptionPane.YES_NO_OPTION);
	}
	
	//MAIN
	static GestionOuvrage DATA_OUVRAGES = new GestionOuvrage(new HashMap<>());
	static Usagers DATA_USAGERS = new Usagers(new HashMap<>());
	
	public static void main(String[] args) {
		
		System.out.println("\nBienvenue dans la bibliothèque!");
		
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new BibliothequeApplication();
            	controller.GestionChargement.chargement(DATA_OUVRAGES);           	
            	controller.GestionChargement.chargement(DATA_USAGERS);
                
            }
        });		
		
		
	}

}
