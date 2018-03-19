import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import bibliotheque.Usagers;
import controller.GestionOuvrage;

public class BibliothequeApplication extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public BibliothequeApplication() {
		super("BIBLIOTHEQUE");
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1));
		JButton quit = new JButton("Quitter");
		JLabel label1 = new JLabel("Bienvenue sur l'application de la bibliothèque!");
		JLabel label2 = new JLabel("Laissez cette fênetre ouverte pendant son utilisation...");
		
		panel.add(label1);
		panel.add(label2);
		panel.add(quit, BorderLayout.SOUTH);
		setContentPane(panel);
		
		
		quit.addActionListener(e -> {
			if(quitter() == JOptionPane.YES_OPTION) {
				System.out.println("\nAu revoir, à bientôt!");
				System.exit(0);
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
