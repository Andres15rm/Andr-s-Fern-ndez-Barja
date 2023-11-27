package com.examen.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.biblioteca.mappers.LibroMapper;
import com.examen.biblioteca.model.LibroDTO;
import com.examen.biblioteca.persistence.entities.AutorEntity;
import com.examen.biblioteca.persistence.entities.LibroEntity;
import com.examen.biblioteca.persistence.repositories.AutorRepository;
import com.examen.biblioteca.persistence.repositories.LibroRepository;

import jakarta.transaction.Transactional;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	LibroRepository libroRepository;
	@Autowired
	LibroMapper libroMapper;
	@Autowired
	AutorRepository autorRepository;
	
	@Override
	@Transactional
	public LibroDTO crearLibro(LibroDTO libroDTO) {
		// TODO Auto-generated method stub
		LibroEntity libro = libroMapper.toEntity(libroDTO);
	    
		if (libroDTO.getId() != null) {
	        AutorEntity autor = autorRepository.findById(libroDTO.getId()).orElseThrow(() -> new RuntimeException("autor no encontrado"));
	        
	        libro.setAutor(autor);
	    }
		
	    libro = libroRepository.save(libro);
	    return libroMapper.toDto(libro);
	}

}
