package com.examen.biblioteca.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.biblioteca.mappers.AutorMapper;
import com.examen.biblioteca.model.AutorDTO;
import com.examen.biblioteca.persistence.entities.AutorEntity;
import com.examen.biblioteca.persistence.repositories.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	AutorRepository autorRepository;
	
	@Autowired
	AutorMapper autorMapper;
	
	@Override
	public AutorDTO crearAutor(AutorDTO autorDTO) {
		// TODO Auto-generated method stub
		return autorMapper.toDto(autorRepository.save(autorMapper.toEntity(autorDTO)));
	}

	//Metodo equivocado
	@Override
	public AutorDTO consultarAutor(Long id) {
		// TODO Auto-generated method stub
		AutorEntity autorE = autorRepository.findById(id).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
		
		return autorMapper.toDto(autorE);
	}
	
//	@Override
//	public ArrayList<AutorDTO> consultarAutores() {
//	    // TODO Auto-generated method stub
//	    ArrayList<AutorEntity> listaAutores = autorRepository.findAll();
//	    ArrayList<AutorDTO> listaA= AutorMapper.listToDto(listaAutores);
//	    
//	    return listaA;
//	}
	
	
	
	

}
