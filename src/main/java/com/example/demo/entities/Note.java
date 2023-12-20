package com.example.demo.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
@Entity
public class Note {

	
	
	@EmbeddedId
	private NoteKey id;
	private double note_key;

	
	@ManyToOne
	@MapsId("id_etudiant")
	@JoinColumn(name = "id_etudiant")
	private Etudiant etudiant;

	@ManyToOne
	@MapsId("id_element")
	@JoinColumn(name = "id_element")
	private Element element;

	public NoteKey getId() {
		return id;
	}

	public void setId(NoteKey id) {
		this.id = id;
	}

	public double getNote_key() {
		return note_key;
	}

	public void setNote_key(double note_key) {
		this.note_key = note_key;
	}

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
