package com.example.demo.reposotiries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;
import com.example.demo.entities.Prof;
@Repository
public interface RepoProf extends JpaRepository<Prof, Integer>{
	public Prof findByUsername(String username);
}

