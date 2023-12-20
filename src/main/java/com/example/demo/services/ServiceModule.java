package com.example.demo.services;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DtoRequestModule;
import com.example.demo.DTO.DtoResponseModule;
import com.example.demo.Exception.Exception404;
import com.example.demo.Mappers.MapperModule;
import com.example.demo.entities.Filiere;
import com.example.demo.entities.Semestre;
import com.example.demo.reposotiries.RepoFiliere;
import com.example.demo.reposotiries.RepoModule;
import com.example.demo.reposotiries.RepoSemestre;
import com.example.demo.entities.Module;


@Service
public class ServiceModule {
	@Autowired
	private RepoSemestre repoSemestre;
	@Autowired
	private RepoFiliere repoFiliere;
	@Autowired
	private RepoModule repoModule;
	private MapperModule mapperModule = Mappers.getMapper(MapperModule.class);	
	
	
	public List <Module> getModule(){
		
		return repoModule.findAll();
	}
	
	public DtoResponseModule AddModule(DtoRequestModule dtoRequestModule){
		Filiere filiere= repoFiliere.findById(dtoRequestModule.getIdFiliere()).orElse(null);
		Semestre semestre= repoSemestre.findById(dtoRequestModule.getIdSemestre()).orElse(null);
		
		Module module= repoModule.findByName(dtoRequestModule.getNom());

		if(filiere==null || semestre==null || module!=null) {throw new Exception404("filiere or semestre not found");}
		Module module2=mapperModule.DtoRequestToEt(dtoRequestModule);
		 module2=repoModule.save(module2);
		 
		 return new DtoResponseModule(module2.getId(),module2.getNom(),module2.getFiliere().getNom(),module2.getSemestre().getLibelle());
		 
	}
	
//	public void deleteModule(Integer Id) {
//		Filiere filiere2=repoFiliere.findById(Id).orElse(null);
//		if(filiere2==null) { return ;}
//	   repoFiliere.delete(filiere2);
//	}
	
	public DtoResponseModule ModifyModule(DtoRequestModule dtoRequestModule,Integer Id){
		Filiere filiere= repoFiliere.findById(dtoRequestModule.getIdFiliere()).orElse(null);
		Semestre semestre= repoSemestre.findById(dtoRequestModule.getIdSemestre()).orElse(null);
		
		Module module= repoModule.findByName(dtoRequestModule.getNom());

		if(filiere==null || semestre==null || module==null) {throw new Exception404("filiere or semestre or module not found");}
		Module module2=mapperModule.DtoRequestToEt(dtoRequestModule);
		 module2=repoModule.save(module2);
		 
		 return new DtoResponseModule(module2.getId(),module2.getNom(),module2.getFiliere().getNom(),module2.getSemestre().getLibelle());
	}



}
