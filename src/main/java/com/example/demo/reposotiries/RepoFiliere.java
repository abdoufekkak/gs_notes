package com.example.demo.reposotiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Filiere;

@Repository
public interface RepoFiliere extends JpaRepository<Filiere, Integer>{
	
	public Filiere findByName(String nom);
}
