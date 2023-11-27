package com.examen.biblioteca.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.examen.biblioteca.model.AutorDTO;
import com.examen.biblioteca.services.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorRestController {
	
	@Autowired
	AutorService autorService;

	@PostMapping
	ResponseEntity<?> crearAutor(@RequestBody AutorDTO autorDTO) {

		AutorDTO autor = autorService.crearAutor(autorDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + autor.getId())
				.buildAndExpand(autor.getId()).toUri();

		return ResponseEntity.created(location).build();

	}

	@GetMapping("/{id}")
	ResponseEntity<?> consultarAutor(@PathVariable Long id) {

		return ResponseEntity.ok(autorService.consultarAutor(id));
	}

}
