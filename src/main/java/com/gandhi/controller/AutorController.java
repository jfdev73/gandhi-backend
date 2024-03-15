package com.gandhi.controller;

import java.util.List;

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

import com.gandhi.model.Autor;
import com.gandhi.service.IAutorService;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "autor")
public class AutorController {
	
	private final IAutorService autorService;
	
	@GetMapping
	public List<Autor> getAll(){
		return autorService.getAll();
	}
	
	@GetMapping("{id}")
	public Autor getById(@PathVariable Long id) {
		return autorService.findById(id);
		
	}
	
	@GetMapping("/bynacionalidad/{nacionalidad}")
	public List<Autor> getByNacionalidad( @PathVariable String nacionalidad){
		return autorService.findByNacionalidad(nacionalidad);
	}
	
	@PostMapping
	public ResponseEntity<Autor> save(@RequestBody Autor autor) {
		var autorGuardado = autorService.save(autor);
		return new ResponseEntity<>(autorGuardado, HttpStatus.CREATED);
		//return autorService.save(autor);
		
	}
	
	@PutMapping
	public Autor update(@RequestBody Autor autor) {
		return autorService.update(autor);
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		 autorService.delete(id);
		 
		 //return ResponseEntity.noContent().build();
		
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);		 
		
	}
	
	

}
