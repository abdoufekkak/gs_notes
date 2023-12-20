package com.example.demo.DTO;

public class DtoResponseEtudiant {
	private Integer id;
	private String nom;
	private String prenom;
	private String nomElement;
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
	public String getNomElement() {
		return nomElement;
	}
	public void setNomElement(String nomElement) {
		this.nomElement = nomElement;
	}
	public DtoResponseEtudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
