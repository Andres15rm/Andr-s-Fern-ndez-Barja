package com.examen.biblioteca.services;

import java.util.ArrayList;

import com.examen.biblioteca.model.AutorDTO;

public interface AutorService {
	
	AutorDTO crearAutor (AutorDTO autorDTO);
	
	AutorDTO consultarAutor (Long id);

//	ArrayList<AutorDTO> consultarAutores();

}
