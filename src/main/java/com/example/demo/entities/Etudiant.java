package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Integer id;
	private String nom;
	private String prenom;
	
	@OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<Note> note_etd = new ArrayList<>();
	
	
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
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
