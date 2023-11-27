package com.examen.biblioteca.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.examen.biblioteca.model.LibroDTO;
import com.examen.biblioteca.persistence.entities.AutorEntity;
import com.examen.biblioteca.persistence.entities.LibroEntity;



@Mapper(componentModel = "spring")
public interface LibroMapper {
	
	@Mapping(source = "autor", target = "autorId", qualifiedByName = "mapAutorId")
    LibroDTO toDto(LibroEntity libro);

    LibroEntity toEntity(LibroDTO libroDTO);

    @Named("mapAutorId")
    default Long mapCursoId(AutorEntity autor) {
        if (autor == null) {
            return null;
        }
        return autor.getId();
    }

}
