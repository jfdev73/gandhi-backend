package com.gandhi.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gandhi.model.Autor;


public interface IAutorService extends ServiceGenerico<Autor, Long>  {
	
	
	public List<Autor> findByNacionalidad(String nationalidad);

}
