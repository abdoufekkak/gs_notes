package com.example.demo.Mappers;

import org.mapstruct.Mapper;

import com.example.demo.DTO.DtoRequestElement;
import com.example.demo.DTO.DtoResponceElement;
import com.example.demo.entities.Element;


 @Mapper
public interface MapperElement {

	 Element DtoRequestToElement(DtoRequestElement dtoRequestElement);
	  
		 DtoResponceElement ElementTODtoResponse(Element element);


}
