<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ page import = "dao.*" %>
<%@ page import = "Model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Welcome</title>
</head>
<body>
Compte créé <%= request.getParameter("nom") %> avec succéé <br/><br />
<table>
	<tr>
	    <th>CIN</th>
	    <th>Nom</th>
	    <th>Prenom</th>
	    <th>Adresse</th>
	    <th>Actions</th>
  	</tr>
	<% for (User u : UserDAO.getAllUsers()) {%>
	<tr>
		<td><input type="text" name="cin" value="<%= u.getCin() %>" /></td>
		<td><input type="text" name="nom" value="<%= u.getNom() %>" /></td>
		<td><input type="text" name="prenom" value="<%= u.getPrenom() %>" /></td>
		<td><input type="text" name="adresse" value="<%= u.getAdresse() %>" /></td>
	</tr>
	<% } %>
</table>
</body>
</html>