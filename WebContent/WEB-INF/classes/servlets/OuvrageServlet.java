package bibliothequeServlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bibliotheque.Ouvrage;

/**
 * Servlet implementation class UsagerServlet
 */
@WebServlet("/OuvrageServlet")
public class OuvrageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/Ouvrage.jsp";
	public static final String CHAMP_REF = "Referance";
	public static final String CHAMP_TITRE = "Titre";
	public static final String CHAMP_EDITION = "Edition";
	public static final String CHAMP_ANNEE = "Annee";
	public static final String CHAMP_ISBN = "Isbn";
	public static final String CHAMP_NBREXEMPLAIRE = "Nbrexemplaire";
	public static final String CHAMP_COMMENTAIRES = "Commentaires";
	public static final String CHAMP_CATEGORIE = "Categorie";
	public static final String CHAMP_AUTEUR = "Auteur";
	public static final String CHAMP_EDITEUR = "Editeur";
	public static final String CHAMP_DISPONIBLE = "Disponible";
	public static final String CHAMP_EMPRUNT = "Emprunt";
	public static final String ATTR_ERREURS = "erreurs";
	public static final String ATTR_RESULTAT = "resultat";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OuvrageServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub

		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ref = request.getParameter(CHAMP_REF);
		String titre = request.getParameter(CHAMP_TITRE);
		String edition = request.getParameter(CHAMP_EDITION);
		String editeur = request.getParameter(CHAMP_EDITEUR);
		String auteur = request.getParameter(CHAMP_AUTEUR);
		String annee = request.getParameter(CHAMP_ANNEE);
		String categorie = request.getParameter(CHAMP_CATEGORIE);
		String commentaire = request.getParameter(CHAMP_COMMENTAIRES);
		String disponible = request.getParameter(CHAMP_DISPONIBLE);
		String emprunt = request.getParameter(CHAMP_EMPRUNT);
		String isbn = request.getParameter(CHAMP_ISBN);
		String nbrexemplaire = request.getParameter(CHAMP_NBREXEMPLAIRE);

		HashMap<String, Ouvrage> Ouv = new HashMap<>();

		Ouvrage ouv = new Ouvrage(ref, titre, edition, Integer.parseInt(annee), isbn, Integer.parseInt(nbrexemplaire), commentaire, categorie, auteur, editeur, Boolean.parseBoolean(disponible), Boolean.parseBoolean(emprunt));
				
		Ouv.put(ouv.getReference(), ouv);

		request.setAttribute("ouvrage", Ouv);

		getServletConfig().getServletContext().getRequestDispatcher(VUE).forward(request, response);
		// response.getWriter().append("Served at: ").append(request.getContextPath());

	}

}
