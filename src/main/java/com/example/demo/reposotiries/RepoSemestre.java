package com.example.demo.reposotiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Prof;
import com.example.demo.entities.Semestre;

@Repository
public interface RepoSemestre extends JpaRepository<Semestre, Integer>{
	
	public 	Semestre findByLibelle(String libelle);
}
