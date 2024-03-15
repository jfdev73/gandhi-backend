package com.gandhi.service.impl;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gandhi.model.Autor;
import com.gandhi.repository.AutorRepository;
import com.gandhi.service.IAutorService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class AutorServiceImpl implements IAutorService {

	private final AutorRepository autorRepository;

	@Override
	public List<Autor> getAll() {
		
		return (List<Autor>) autorRepository.findAll();
	}

	@Override
	public Autor findById(Long id) {
		
		Autor autor = autorRepository.findById(id).orElseThrow();
		
	
		return autor;
	}

	@Override
	public Autor save(Autor autor) {
		var autorGuardado = autorRepository.save(autor);
		return autorGuardado;
	}

	@Override
	public Autor update(Autor autor) {
		var autorBd = findById(autor.getId());
		
		
		
		autorBd.setNacionalidad(autor.getNacionalidad());
		autorBd.setNombre(autor.getNombre());
		
		return autorRepository.save(autorBd);
	}

	@Override
	public void delete(Long id) {
		findById(id);
		autorRepository.deleteById(id);

	}

	@Override
	public List<Autor> findByNacionalidad(String nacionalidad) {
		return autorRepository.findByNacionalidad(nacionalidad);
		
	}

}
