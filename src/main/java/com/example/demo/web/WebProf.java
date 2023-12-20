package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.DtoRequestProf;
import com.example.demo.DTO.DtoResponseProf;
import com.example.demo.entities.Prof;
import com.example.demo.services.ServiceProf;
@RestController
@RequestMapping("prof/")

public class WebProf {
	@Autowired
	ServiceProf serviceProf;
	
	@GetMapping("")
	public ResponseEntity<List<Prof>> getProfs() {
	    List<Prof> profs = serviceProf.getProf(); 
	    return new ResponseEntity<>(profs, HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<DtoResponseProf > addProf(@RequestBody DtoRequestProf dtoRequestProf) {
		DtoResponseProf dtoResponseProf=	serviceProf.AddProf(dtoRequestProf);
		return  new ResponseEntity<>(dtoResponseProf,HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<DtoResponseProf > modProf(@RequestBody DtoRequestProf dtoRequestProf,@PathVariable Integer id) {
		DtoResponseProf dtoResponseProf=	serviceProf.ModifyPof( dtoRequestProf,id);
		return  new ResponseEntity<>(dtoResponseProf,HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletProf(@PathVariable Integer id) {
			serviceProf.deleteProf(id);
	        return ResponseEntity.noContent().build();
	}
}