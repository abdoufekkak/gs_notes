package com.example.demo.DTO;

public class DtoResponseModule {
	private Integer id;
	private String nom;
	private String nomFiliere;
	private String nomSemestre;
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
	public String getNomFiliere() {
		return nomFiliere;
	}
	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}
	public String getNomSemestre() {
		return nomSemestre;
	}
	public void setNomSemestre(String nomSemestre) {
		this.nomSemestre = nomSemestre;
	}
	public DtoResponseModule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DtoResponseModule(Integer id, String nom, String nomFiliere, String nomSemestre) {
		super();
		this.id = id;
		this.nom = nom;
		this.nomFiliere = nomFiliere;
		this.nomSemestre = nomSemestre;
	}
	
	
	
}
