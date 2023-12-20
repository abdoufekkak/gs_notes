package com.example.demo.Mappers;

import org.mapstruct.Mapper;

import com.example.demo.DTO.DtoRequestSemestre;
import com.example.demo.DTO.DtoResponsetSemestre;
import com.example.demo.entities.Semestre;

@Mapper
public interface MapperSemestre {

	 Semestre DtoRequestToSemsestre(DtoRequestSemestre dtoRequestSemestre);
	  
		 DtoResponsetSemestre SemsestreTODtoResponse(Semestre semestre);

}
