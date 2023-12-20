package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Semestre {
	@Id

	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer Id;
	private String libelle;
	
	

@OneToMany(mappedBy = "semestre", cascade = CascadeType.ALL)
private List<Module> modules = new ArrayList<>();
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
