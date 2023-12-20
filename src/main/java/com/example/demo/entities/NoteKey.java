package com.example.demo.entities;
import jakarta.persistence.Embeddable;

@Embeddable

public class NoteKey {

	
	
	private Integer id_etudiant;
	private Integer id_element;
	public Integer getId_etudiant() {
		return id_etudiant;
	}
	public void setId_etudiant(Integer id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
	public Integer getId_element() {
		return id_element;
	}
	public void setId_element(Integer id_element) {
		this.id_element = id_element;
	}
	public NoteKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
