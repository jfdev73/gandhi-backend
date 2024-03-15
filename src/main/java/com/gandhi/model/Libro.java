package com.gandhi.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String isbn;
	
	private String titulo;
	
	@Column(name = "num_paginas")
	private Integer numPaginas;
	
	private BigDecimal precio;
	
	private Integer stock;
	
	private String idioma;
	
	private LocalDate fechaPublicacion;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "id_editorial")
	private Editorial editorial;
	
	@ManyToOne
	@JoinColumn(name = "id_autor")
	private Autor autor;
	


}
