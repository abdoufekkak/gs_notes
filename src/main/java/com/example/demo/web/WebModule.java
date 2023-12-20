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

import com.example.demo.services.ServiceModule;
import com.example.demo.entities.Module;
import com.example.demo.DTO.DtoRequestModule;
import com.example.demo.DTO.DtoResponseModule;


@RestController
@RequestMapping("module/")
public class WebModule {
	@Autowired
	ServiceModule serviceModule;
	
	@GetMapping("")
	public ResponseEntity<List<Module> > getModule() {
		return new ResponseEntity<>(serviceModule.getModule(),HttpStatus.OK);
	}
	@PostMapping("")
	public ResponseEntity<DtoResponseModule > addModule(@RequestBody DtoRequestModule dtoRequestModule) {
		DtoResponseModule dtoResponseSemestre=serviceModule.AddModule(dtoRequestModule);
		return  new ResponseEntity<>(dtoResponseSemestre,HttpStatus.CREATED);
	}
	@PutMapping("{id}")
	public ResponseEntity<DtoResponseModule > modModule(@RequestBody DtoRequestModule dtoRequestModule,@PathVariable Integer id) {
		DtoResponseModule dtoResponseModule=	serviceModule.ModifyModule(dtoRequestModule,id);
		return  new ResponseEntity<>(dtoResponseModule,HttpStatus.OK);
	}
//	@DeleteMapping("{id}")
//	public ResponseEntity<?> deletModule(@PathVariable Integer id) {
//			serviceModule.deleteModule(id);
//	        return ResponseEntity.noContent().build();
//}
//	

}
