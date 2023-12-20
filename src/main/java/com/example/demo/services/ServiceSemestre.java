package com.example.demo.services;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DtoRequestSemestre;
import com.example.demo.DTO.DtoResponsetSemestre;
import com.example.demo.Exception.Exception404;
import com.example.demo.Exception.Exception500;
import com.example.demo.Mappers.MapperSemestre;
import com.example.demo.entities.Semestre;
import com.example.demo.reposotiries.RepoSemestre;
@Service
public class ServiceSemestre {
	@Autowired
	private RepoSemestre repoSemestre;
	private MapperSemestre mapperSemestre = Mappers.getMapper(MapperSemestre.class);
	public List <Semestre> getSemestre(){
		return repoSemestre.findAll();
	}
	
	public DtoResponsetSemestre AddSemestre(DtoRequestSemestre dtoRequestSemestre){
		Semestre semestre2=repoSemestre.findByLibelle(dtoRequestSemestre.getLibelle());
		if(semestre2!=null) { throw new Exception500("semestre already exist"); }
		Semestre semestre= mapperSemestre.DtoRequestToSemsestre(dtoRequestSemestre);
		semestre=repoSemestre.save(semestre);
		 return mapperSemestre.SemsestreTODtoResponse(semestre);
	}
	
	public void deleteSemestre(Integer Id) {
		Semestre semestre2=repoSemestre.findById(Id).orElse(null);
		if(semestre2==null) { throw new Exception404("semestre not found") ;}
	   repoSemestre.delete(semestre2);
	}
	
	public DtoResponsetSemestre ModifySemestre(DtoRequestSemestre dtoRequestSemestre,Integer Id){
		Semestre semestre2=repoSemestre.findById(Id).orElse(null);
		if(semestre2==null) { throw new Exception404("semestre not found"); }
		Semestre semestre= mapperSemestre.DtoRequestToSemsestre(dtoRequestSemestre);
	
		return mapperSemestre.SemsestreTODtoResponse(repoSemestre.save(semestre));
	}
}
