package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Integer Id;
	private String nom;
	private String username;
	private String mdp;
	

    @ManyToMany
    private List<Role> roles = new ArrayList<>();
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
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
