package com.example.demo.Mappers;

import org.mapstruct.Mapper;

import com.example.demo.DTO.DtoRequestProf;
import com.example.demo.DTO.DtoResponseProf;
import com.example.demo.entities.Prof;



@Mapper
public interface MapperProf {

	Prof DtoRequestToProf(DtoRequestProf dtoRequestProf);
	  
	 DtoResponseProf ProfTODtoResponse(Prof prof);

}
