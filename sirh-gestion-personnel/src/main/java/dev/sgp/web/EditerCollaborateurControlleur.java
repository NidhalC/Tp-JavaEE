package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurControlleur extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prénom");
		
		
		if (matricule != null || titre!=null || nom != null || prenom !=null){
		resp.setContentType("text/html");
		// code HTML ecrit dans le corps de la reponse
		resp.getWriter().write("<h1>Liste des collaborateurs</h1>"
		+ "<ul>"
		+ "<li>matricule="+ matricule + "</li>"
		+ "<li>titre="+ titre + "</li>"
		+ "<li>nom="+ nom + "</li>"
		+ "<li>prénom="+ prenom + "</li>"
		+ "</ul>");
		}
		
		else {
			resp.sendError(400, "Les paramètres suivants sont incorrects");
		}
	}

}
