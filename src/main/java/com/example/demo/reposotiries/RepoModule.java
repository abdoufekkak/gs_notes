package com.example.demo.reposotiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Module;

@Repository
public interface RepoModule extends JpaRepository<Module, Integer>{
	public Module findByName(String nom);

}
