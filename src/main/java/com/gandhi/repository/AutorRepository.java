package com.gandhi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gandhi.model.Autor;


public interface AutorRepository extends CrudRepository<Autor, Long>{
	
	
	public List<Autor> findByNacionalidad(String nacionalidad);
	
	

}
