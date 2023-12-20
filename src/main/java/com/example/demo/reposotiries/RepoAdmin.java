package com.example.demo.reposotiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;
@Repository
public interface RepoAdmin extends JpaRepository<Admin, Integer>{
	
	public Admin findByUsername(String username);
}