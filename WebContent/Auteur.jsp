<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Auteur</title>
<jsp:useBean id='auteurs' scope='request' class='java.util.Vector'/>
<%@ page import ="java.util.Vector, bibliotheque.Auteur"  %>
</head>
<body>
	<h1> RECAPITULATIF SAISIE D'UN AUTEUR </h1>
		<% if (auteurs != null && auteurs.size() > 0) { %>
		<table border="1" cellspacing="0" cellpadding="3">
			<th> ID </th>
			<th> NOM </th>
			<th> PRENOM </th>
			<% for (int i = 0; i < auteurs.size(); i++) { %>
				<tr> 
					<td>
						<% out.println(((Auteur)auteurs.elementAt(i)).getIdAuteur());  %>
					</td>
					<td>
						<% out.println(((Auteur)auteurs.elementAt(i)).getNomAuteur());  %>
					</td>
					<td>
						<% out.println(((Auteur)auteurs.elementAt(i)).getPrenomAuteur());  %>
					</td>
				</tr>
			<% } %>
			
		</table>
		<% } %>
</body>
</html>