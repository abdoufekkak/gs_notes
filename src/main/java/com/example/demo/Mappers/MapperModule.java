package com.example.demo.Mappers;

import org.mapstruct.Mapper;

import com.example.demo.DTO.DtoRequestModule;
import com.example.demo.entities.Module;
@Mapper
public interface MapperModule {

	

	Module DtoRequestToEt(DtoRequestModule dtoRequestModule);
	  
//	 DtoResponseEtudiant EtudiantTODtoResponse(Etudiant etudiant);
}
