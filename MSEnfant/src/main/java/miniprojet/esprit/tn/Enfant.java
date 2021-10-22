package miniprojet.esprit.tn;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enfant implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int  id;
private String prenom,nom;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}



public Enfant() {
	super();
}
public Enfant(String prenom, String nom, int age) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.age = age;
}
@Override
public String toString() {
	return "Enfant [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", age=" + age + "]";
}
	
	
}
