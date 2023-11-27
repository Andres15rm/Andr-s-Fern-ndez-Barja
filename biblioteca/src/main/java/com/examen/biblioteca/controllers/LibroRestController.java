package com.examen.biblioteca.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.examen.biblioteca.model.LibroDTO;
import com.examen.biblioteca.services.LibroService;

@RestController
@RequestMapping("/books")
public class LibroRestController {
	
	@Autowired
	LibroService libroService;
	
	@PostMapping("/autor")
	public ResponseEntity<?> crearLibro(@RequestBody LibroDTO libroDTO) {

		LibroDTO lib = libroService.crearLibro(libroDTO);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/" + lib.getId())
				.buildAndExpand(lib.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
		
	}

}
