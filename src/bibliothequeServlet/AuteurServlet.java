package bibliothequeServlet;

import java.io.IOException;

import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bibliotheque.Auteur;

/**
 * Servlet implementation class AuteurServlet
 */
@WebServlet("/AuteurServlet")
public class AuteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("idAuteur");
		String name = request.getParameter("nomAuteur");
		String subname = request.getParameter("prenomAuteur");
		
		Vector<Auteur> auteurs = new Vector<Auteur>();
		Auteur nouvelAuteur = new Auteur(id, name, subname);
		auteurs.add(nouvelAuteur);
		
		request.setAttribute("auteurs", auteurs);
		
		getServletConfig().getServletContext().getRequestDispatcher("/Auteur.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
