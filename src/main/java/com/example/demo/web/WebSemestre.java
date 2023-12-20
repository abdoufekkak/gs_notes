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

import com.example.demo.services.ServiceSemestre;
import com.example.demo.entities.Semestre;
import com.example.demo.DTO.DtoRequestSemestre;
import com.example.demo.DTO.DtoResponsetSemestre;
@RestController
@RequestMapping("semestre/")
public class WebSemestre {
	@Autowired
	ServiceSemestre serviceSemestre;
	
	@GetMapping("")
	public ResponseEntity<List<Semestre>> getSemestres() {
	    List<Semestre> semestres = serviceSemestre.getSemestre(); // Assurez-vous que la méthode getSemestre() renvoie une liste de semestres
	    return new ResponseEntity<>(semestres, HttpStatus.OK);
	}

	@PostMapping("")
	public ResponseEntity<DtoResponsetSemestre > addSemestre(@RequestBody DtoRequestSemestre dtoRequestSemestre) {
		DtoResponsetSemestre dtoResponseSemestre=	serviceSemestre.AddSemestre(dtoRequestSemestre);
		return  new ResponseEntity<>(dtoResponseSemestre,HttpStatus.CREATED);
	}
	@PutMapping("{id}")
	public ResponseEntity<DtoResponsetSemestre > modSemestre(@RequestBody DtoRequestSemestre dtoRequestSemestre,@PathVariable Integer id) {
		DtoResponsetSemestre dtoResponseSemestre=	serviceSemestre.ModifySemestre(dtoRequestSemestre,id);
		return  new ResponseEntity<>(dtoResponseSemestre,HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletSemestre(@PathVariable Integer id) {
			serviceSemestre.deleteSemestre(id);
	        return ResponseEntity.noContent().build();
}
	}
