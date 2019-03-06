package dev.sgp.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class AjouterCollaborateurControlleur extends HttpServlet {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	String mailSociety = null;
	
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
			req.getRequestDispatcher("/WEB-INF/views/collab/ajouterCollaborateur.jsp")
			.forward(req, resp);
		}

		protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
			Collaborateur monCollaborateur = new Collaborateur();
			this.getProperties();
			
			monCollaborateur.setNom(req.getParameter("nom"));
			monCollaborateur.setPrenom(req.getParameter("prenom"));
			monCollaborateur.setAdresse(req.getParameter("adresse"));
			monCollaborateur.setNb_securite_sociale(req.getParameter("numeroSecuriteSocial"));
			monCollaborateur.setEmailPro(monCollaborateur.getPrenom() + monCollaborateur.getNom() + mailSociety);
			monCollaborateur.setPhoto(""); //rajouter une url
			monCollaborateur.setActif(true);
			collabService.sauvegarderCollaborateur(monCollaborateur);
			req.setAttribute("listeCollaborateurs", collabService.listerCollaborateurs());
			req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
			
			
		}
		public void getProperties(){
			Properties prop = new Properties();
			InputStream input = null;
			try {
				String filename = "/sirh-gestion-personnel/application.properties";
				input = new FileInputStream(filename);
				prop.load(input);
				
				this.mailSociety = prop.getProperty("mail");
			}
			catch (IOException ex) {

				System.out.println("Sorry, unable to find " + "jdbc.properties");
				ex.printStackTrace();
			} 
			finally{
				if(input!=null){
					try {
						input.close();
					}
					catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
}
}
