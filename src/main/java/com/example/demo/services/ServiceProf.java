package com.example.demo.services;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.DtoRequestProf;
import com.example.demo.DTO.DtoResponseProf;
import com.example.demo.Exception.Exception404;
import com.example.demo.Exception.Exception500;
import com.example.demo.Mappers.MapperProf;
import com.example.demo.entities.Prof;
import com.example.demo.reposotiries.RepoProf;

@Service
public class ServiceProf {
	@Autowired
	private RepoProf repoProf;
	private MapperProf mapperProf = Mappers.getMapper(MapperProf.class);
	public List <Prof> getProf(){
		return repoProf.findAll();
	}
	
	public DtoResponseProf AddProf(DtoRequestProf dtoRequestProf){
		Prof prof2=repoProf.findByUsername(dtoRequestProf.getUsername());
		if(prof2!=null) {  throw new Exception500("Prof already exist"); }
		Prof prof= mapperProf.DtoRequestToProf(dtoRequestProf);
		 prof=repoProf.save(prof);
		 return mapperProf.ProfTODtoResponse(prof);
	}
	
	public void deleteProf(Integer Id) {
		Prof prof2=repoProf.findById(Id).orElse(null);
		if(prof2==null) { throw new Exception404("prof not found") ;}
	   repoProf.delete(prof2);
	}
	
	public DtoResponseProf ModifyPof(DtoRequestProf dtoRequestProf,Integer Id){
		Prof prof2=repoProf.findById(Id).orElse(null);
		if(prof2==null) { throw new Exception404("prof not found"); }
		Prof prof= mapperProf.DtoRequestToProf(dtoRequestProf);
	
		return mapperProf.ProfTODtoResponse(repoProf.save(prof));
	}
}
