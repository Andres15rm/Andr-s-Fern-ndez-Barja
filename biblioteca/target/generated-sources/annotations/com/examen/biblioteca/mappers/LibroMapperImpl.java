package com.examen.biblioteca.mappers;

import com.examen.biblioteca.model.LibroDTO;
import com.examen.biblioteca.persistence.entities.LibroEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-27T17:24:29+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class LibroMapperImpl implements LibroMapper {

    @Override
    public LibroDTO toDto(LibroEntity libro) {
        if ( libro == null ) {
            return null;
        }

        LibroDTO libroDTO = new LibroDTO();

        libroDTO.setAutorId( mapCursoId( libro.getAutor() ) );
        libroDTO.setId( libro.getId() );
        libroDTO.setTitulo( libro.getTitulo() );
        libroDTO.setIsbn( libro.getIsbn() );
        libroDTO.setPrecio( libro.getPrecio() );

        return libroDTO;
    }

    @Override
    public LibroEntity toEntity(LibroDTO libroDTO) {
        if ( libroDTO == null ) {
            return null;
        }

        LibroEntity libroEntity = new LibroEntity();

        libroEntity.setId( libroDTO.getId() );
        libroEntity.setTitulo( libroDTO.getTitulo() );
        libroEntity.setIsbn( libroDTO.getIsbn() );
        libroEntity.setPrecio( libroDTO.getPrecio() );

        return libroEntity;
    }
}
