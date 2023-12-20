package com.example.demo.Mappers;

import org.mapstruct.Mapper;

import com.example.demo.DTO.DtoRequestEtudiant;
import com.example.demo.DTO.DtoResponseEtudiant;
import com.example.demo.entities.Etudiant;




@Mapper
public interface MapperEtudiant {


	Etudiant DtoRequestToEtudiant(DtoRequestEtudiant dtoRequestEtudiant);
	  
	 DtoResponseEtudiant EtudiantTODtoResponse(Etudiant etudiant);
}
