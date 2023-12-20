package com.example.demo.DTO;

public class DtoResponseProf {
	private Integer Id;
	private String nom;
	private String username;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public DtoResponseProf() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
