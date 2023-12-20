package com.example.demo.services;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DtoRequestFiliere;
import com.example.demo.DTO.DtoResponseFiliere;
import com.example.demo.Exception.Exception404;
import com.example.demo.Exception.Exception500;
import com.example.demo.Mappers.MapperFiliere;
import com.example.demo.entities.Filiere;
import com.example.demo.reposotiries.RepoFiliere;



@Service
public class ServiceFiliere {
	@Autowired
	private RepoFiliere repoFiliere;
	private MapperFiliere mapperFiliere = Mappers.getMapper(MapperFiliere.class);
	public List <Filiere> getFiliere(){
		return repoFiliere.findAll();
	}
	
	public DtoResponseFiliere AddFiliere(DtoRequestFiliere dtoRequestFiliere){
		Filiere filiere2=repoFiliere.findByName(dtoRequestFiliere.getNom());
		if(filiere2!=null) {throw new Exception500("filiere already exist"); }
		Filiere filiere= mapperFiliere.DtoRequestToFiliere(dtoRequestFiliere);
		filiere=repoFiliere.save(filiere);
		 return mapperFiliere.FiliereDtoToResponse(filiere);
	}
	
	public void deleteFiliere(Integer Id) {
		Filiere filiere2=repoFiliere.findById(Id).orElse(null);
		if(filiere2==null) { throw new Exception404("filiere not found") ;}
	   repoFiliere.delete(filiere2);
	}
	
	public DtoResponseFiliere ModifyFiliere(DtoRequestFiliere dtoRequestFiliere,Integer Id){
		Filiere filiere2=repoFiliere.findById(Id).orElse(null);
		if(filiere2==null) { throw new Exception404("filiere not found"); }
		Filiere filiere= mapperFiliere.DtoRequestToFiliere(dtoRequestFiliere);
	
		return mapperFiliere.FiliereDtoToResponse(repoFiliere.save(filiere));
	}
}
