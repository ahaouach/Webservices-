<%@page import="bibliotheque.Usagers"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usagers</title>
<jsp:useBean id='usagers' scope='request' class='java.util.Vector<Usager>' />
<%@ page import="java.util.Vector, bibliotheque.Usager"%>
</head>
<body>
	<h1>RECAPITULATIF SAISIE D'UN UTILISATEUR</h1>
	<%
		if (usagers != null && usagers.size() > 0) {
	%>
	<table border="1" cellspacing="0" cellpadding="3">
		<th>ID</th>
		<th>NOM</th>
		<th>PRENOM</th>
		<th>ADRESSE</th>
		<th>EMAIL</th>
		<th>PASSWORD</th>
		<%
			for (int i = 0; i < usagers.size(); i++) {
		%>
		<tr>
			<td>
				<%
					out.println(((Usager) usagers.elementAt(i)).getId());
				%>
			</td>
			<td>
				<%
					out.println(((Usager) usagers.elementAt(i)).getNom());
				
				%>
			</td>
			<td>
				<%
					out.println(((Usager) usagers.elementAt(i)).getPrenom());
				%>
			</td>
			<td>
				<%
					out.println(((Usager) usagers.elementAt(i)).getAdresse());
				%>
			</td>
			<td>
				<%
					out.println(((Usager) usagers.elementAt(i)).getDatenaiss());
				%>
			</td>
			<td>
				<%
					out.println(((Usager) usagers.elementAt(i)).getEmail());
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