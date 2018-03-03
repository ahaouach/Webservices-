<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bibliotheque</title>
<jsp:useBean id='biblio' scope='request' class='bibliotheque.Bibliotheque'/>
<%@ page import ="bibliotheque.Bibliotheque"  %>
</head>
<body>
	
		<h1> RECAPITULATIF SAISIE D'UN OUVRAGE </h1>
		<table>
			
			<tr>
				<td>
					Titre :
				</td>
				<td>
					<% out.println(biblio.getNom()); %>
				</td>
			</tr>
			
			
		</table>
</body>
</html>