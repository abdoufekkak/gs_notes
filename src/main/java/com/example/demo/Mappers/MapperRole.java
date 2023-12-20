package com.example.demo.Mappers;

import org.mapstruct.Mapper;

import com.example.demo.DTO.DtoRequestRolle;
import com.example.demo.DTO.DtoResponseRole;
import com.example.demo.entities.Role;

@Mapper
public interface MapperRole {


	Role DtoRequestToRole(DtoRequestRolle dtoRequestRole);
	  
	 DtoResponseRole AdminTODtoRole(Role role);
}