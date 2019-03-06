package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate date_de_naissance;
	private String adresse;
	private String nb_securite_sociale;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;
	public String getMatricule() {
		return matricule;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public LocalDate getDate_de_naissance() {
		return date_de_naissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public String getNb_securite_sociale() {
		return nb_securite_sociale;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public boolean isActif() {
		return actif;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setDate_de_naissance(LocalDate date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setNb_securite_sociale(String nb_securite_sociale) {
		this.nb_securite_sociale = nb_securite_sociale;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	
	
}
