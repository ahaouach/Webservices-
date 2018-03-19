<%@page import="bibliotheque.Usager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Emprunt</title>
<jsp:useBean id='emprunt' scope='request' class='java.util.ArrayList' />
<%@ page import="java.util.ArrayList, bibliotheque.*,  controller.*"%>
</head>
<body>
	<h1>Gestion emprunt</h1>

	<table border="1" cellspacing="0" cellpadding="3">
		<th>ID</th>
		<th>NOM</th>

		<%
			for (int i = 0; i < emprunt.size(); i++) {
		%>


		<tr>
			<td>Saisir la ID de l'abonnée :</td>
			<td><input type="text" size=70 name="id" /></td>
			<td>
				<%
					out.println(((Usager) emprunt.get(i)).getNom());
				%>
			</td>
			<td>
				<%
					out.println(((Usager) emprunt.get(i)).getPrenom());
				%>
			</td>
			<td>
				<%
					out.println(((Usager) emprunt.get(i)).getlistEmpruntUser());
				%>
			</td>
		</tr>
		<%
			}
		%>

	</table>
	<%
		
	%>