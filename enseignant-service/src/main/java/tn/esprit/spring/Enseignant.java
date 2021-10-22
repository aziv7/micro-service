package tn.esprit.spring;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Enseignant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nom, prenom, email;
	private Integer classe;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
	
	@Override
	public String toString() {
		return "Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", classes="
				+ classe + "]";
	}
	public Enseignant(String nom, String prenom, String email, Integer classe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.classe = classe;
	}
	public Enseignant() {
		super();
	}
	public Integer getClasse() {
		return classe;
	}
	public void setClasse(Integer classe) {
		this.classe = classe;
	}
	
	

}
