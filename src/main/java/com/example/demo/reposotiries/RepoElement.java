package com.example.demo.reposotiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Element;
@Repository
public interface RepoElement extends JpaRepository<Element, Integer>{
}
