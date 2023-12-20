package com.example.demo.services;
import com.example.demo.DTO.DTOResponseAdmin;
import com.example.demo.DTO.DtoRequestAdmin;
import com.example.demo.Exception.Exception404;
import com.example.demo.Exception.Exception500;
import com.example.demo.Mappers.MapperAdmin;
import com.example.demo.entities.Admin;
import com.example.demo.reposotiries.RepoAdmin;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceAdmin {
	@Autowired
	private RepoAdmin repoAdmin;
	private MapperAdmin mapperAdmin = Mappers.getMapper(MapperAdmin.class);
	public List <Admin> getAdmin(){
		return repoAdmin.findAll();
	}
	
	public DTOResponseAdmin AddAdmin(DtoRequestAdmin dtoRequestAdmin){
		Admin admin2=repoAdmin.findByUsername(dtoRequestAdmin.getUsername());
		if(admin2!=null) { throw new Exception500("admin already exist"); }
		Admin admin= mapperAdmin.DtoRequestToAdmin(dtoRequestAdmin);
		 admin=repoAdmin.save(admin);
		 return mapperAdmin.AdminTODtoResponse(admin);
	}
	
	public void deleteAdmin(Integer Id) {
		Admin admin2=repoAdmin.findById(Id).orElse(null);
		if(admin2==null) { throw new Exception404("admin not found");}
	   repoAdmin.delete(admin2);
	}
	
	public DTOResponseAdmin ModifyAdmin(DtoRequestAdmin dtoRequestAdmin,Integer Id){
		Admin admin2=repoAdmin.findById(Id).orElse(null);
		if(admin2==null) { throw new Exception404("admin not found"); }
		Admin admin= mapperAdmin.DtoRequestToAdmin(dtoRequestAdmin);
	
		return mapperAdmin.AdminTODtoResponse(repoAdmin.save(admin));
	}
	
}
