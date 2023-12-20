package com.example.demo.DTO;

public class DtoRequestEtudiant {
	private String nom;
	private String prenom;
	private Integer idElement;
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
	public Integer getIdElement() {
		return idElement;
	}
	public void setIdElement(Integer idElement) {
		this.idElement = idElement;
	}
	public DtoRequestEtudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
