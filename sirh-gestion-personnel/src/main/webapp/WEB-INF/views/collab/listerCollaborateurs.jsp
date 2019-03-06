<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/boostrap-4.3.1-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
		<%
			List<Collaborateur> collabList = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
			for (Collaborateur monCollaborateur : collabList) {
		%>
		<li><%=monCollaborateur.getNom()%></li>
		<li><%=monCollaborateur.getPrenom()%></li>
		<li><%=monCollaborateur.getNb_securite_sociale()%></li>
		<li><%=monCollaborateur.getAdresse()%></li>
		<%
			}
		%>
	</ul>
</body>
</html>