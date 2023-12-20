package com.example.demo.Mappers;

import org.mapstruct.Mapper;

import com.example.demo.DTO.DTOResponseAdmin;
import com.example.demo.DTO.DtoRequestAdmin;
import com.example.demo.entities.Admin;


@Mapper
public interface MapperAdmin {

	Admin DtoRequestToAdmin(DtoRequestAdmin dtoRequestAdmin);
	  
	 DTOResponseAdmin AdminTODtoResponse(Admin admin);
}
