package com.examen.biblioteca.mappers;

import java.util.ArrayList;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.examen.biblioteca.model.AutorDTO;
import com.examen.biblioteca.persistence.entities.AutorEntity;

@Mapper(componentModel = "spring", uses = {LibroMapper.class})
public interface AutorMapper {
	
	
	AutorDTO toDto(AutorEntity autor);
    AutorEntity toEntity(AutorDTO autorDTO);
    
//    ArrayList<AutorEntity> listToEntity(ArrayList<AutorDTO> listAutorDTO);
//    ArrayList<AutorDTO> listToDto(ArrayList<AutorEntity> listaAutores);
//    
   

}
