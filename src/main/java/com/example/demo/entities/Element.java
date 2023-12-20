package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Element {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
private Integer id;
private String libelle;
private Double coefficient;
private Integer idProf;
private Integer idmodule;

@ManyToOne
@JoinColumn(name = "professeur_id")
private Prof professeur;

@ManyToOne
@JoinColumn(name = "module_id")
private Module module;

@OneToMany(mappedBy = "element", cascade = CascadeType.ALL)
private List<Note> note_elemt = new ArrayList<>();

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getIdProf() {
	return idProf;
}
public void setIdProf(Integer idProf) {
	this.idProf = idProf;
}
public Integer getIdmodule() {
	return idmodule;
}
public void setIdmodule(Integer idmodule) {
	this.idmodule = idmodule;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public Double getCoefficient() {
	return coefficient;
}
public void setCoefficient(Double coefficient) {
	this.coefficient = coefficient;
}
public Element() {
	super();
	// TODO Auto-generated constructor stub
}

}
