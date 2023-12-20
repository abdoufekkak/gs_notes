package com.example.demo.Mappers;

import org.mapstruct.Mapper;

import com.example.demo.DTO.DtoRequestFiliere;
import com.example.demo.DTO.DtoResponseFiliere;
import com.example.demo.entities.Filiere;

@Mapper
public interface MapperFiliere {
	Filiere DtoRequestToFiliere(DtoRequestFiliere dtoRequestFiliere);
	  
	 DtoResponseFiliere FiliereDtoToResponse(Filiere filiere);
}
