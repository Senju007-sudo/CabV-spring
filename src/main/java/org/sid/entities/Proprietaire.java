package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Proprietaire implements Serializable {	
	@Id
	private String id;
	private String cin ;
	private String nom ;
	private String prenoms; 
	private String adresse;
	private String tel ;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Proprietaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Proprietaire(String id, String cin, String nom, String prenoms, String adresse, String tel) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
		this.prenoms = prenoms;
		this.adresse = adresse;
		this.tel = tel;
	}
	
	
	
	
}
