package com.examen.biblioteca.model;

import java.math.BigDecimal;
import java.util.List;

import com.examen.biblioteca.persistence.entities.AutorEntity;
import com.examen.biblioteca.persistence.entities.LibroEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {
	
	private Long id;
	private String titulo;
	private String isbn;
	private BigDecimal precio;
	private Long autorId;


}
