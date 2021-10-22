package tn.esprit.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parent implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6;
	@Id
	@GeneratedValue
	private int id;
	private String nom, prenom, email,metier;
	private int salaire;

	public Parent(String nom, String prenom, String email, String metier, int salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.metier = metier;
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public Parent() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

}
