<%@page import="bibliotheque.Auteur"%>
<%@page import="java.util.HashMap"%>
<%@page import="controller.GestionOuvrage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recapetulatif nouveau ouvrage</title>
<jsp:useBean id='ouvrages' scope='request' class='java.util.HashMap' />
<%@ page import="java.util.HashMap, bibliotheque.Ouvrage"%>
</head>
<body>
	<h1>RECAPITULATIF SAISIE D'UN OUVRAGE</h1>
	<%
		if (ouvrages.isEmpty() == false && ouvrages.size() > 0) {
	%>
	<table border="1" cellspacing="0" cellpadding="3">
		<th>REFERANCE</th>
		<th>EDITION</th>
		<th>ANNEE</th>
		<th>ISBN</th>
		<th>NBREXEMPLAIRE</th>
		<th>COMMENTAIRE</th>
		<th>CATEGORIE</th>
		<th>AUTEUR</th>
		<th>EDITEUR</th>
		<th>DISPONIBLE</th>
		<th>EMPRUNT</th>


		<%
			for (int i = 0; i < ouvrages.size(); i++) {
		%>
		<tr>
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getAuteur());
				%>
			</td>
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getTitre());
				%>
			</td>
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getEmprunte());
				%>
			</td>
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getCategorie());
				%>
			</td>
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getCommentaires());
				%>
			</td>
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getEditeur());
				%>
			</td> 
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getEdition());
				%>
			</td> 
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getISBN());
				%>
			</td> 
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getReference());
				%>
			</td>
			<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getNbrExemplaire());
				%>
			</td>
<td>
				<%
					out.println(((Ouvrage) ouvrages.get(i)).getAnnee());
				%>
			</td>

		</tr>
		<%
			}
		%>

	</table>
	<%
		}
	%>
</body>
</html>