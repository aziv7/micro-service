package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Activite implements Serializable {
	
	private static final long serialVersionUID = 6;
			
	@Id
	@GeneratedValue
	private int id;
	private String nom, description;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Activite() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
