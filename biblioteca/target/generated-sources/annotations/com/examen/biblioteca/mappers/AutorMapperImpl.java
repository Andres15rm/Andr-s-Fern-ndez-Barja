package com.examen.biblioteca.mappers;

import com.examen.biblioteca.model.AutorDTO;
import com.examen.biblioteca.model.LibroDTO;
import com.examen.biblioteca.persistence.entities.AutorEntity;
import com.examen.biblioteca.persistence.entities.LibroEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-27T17:24:29+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.5 (Eclipse Adoptium)"
)
@Component
public class AutorMapperImpl implements AutorMapper {

    @Autowired
    private LibroMapper libroMapper;

    @Override
    public AutorDTO toDto(AutorEntity autor) {
        if ( autor == null ) {
            return null;
        }

        AutorDTO autorDTO = new AutorDTO();

        autorDTO.setId( autor.getId() );
        autorDTO.setNombre( autor.getNombre() );
        autorDTO.setNacionalidad( autor.getNacionalidad() );
        autorDTO.setLibros( libroEntityListToLibroDTOList( autor.getLibros() ) );

        return autorDTO;
    }

    @Override
    public AutorEntity toEntity(AutorDTO autorDTO) {
        if ( autorDTO == null ) {
            return null;
        }

        AutorEntity autorEntity = new AutorEntity();

        autorEntity.setId( autorDTO.getId() );
        autorEntity.setNombre( autorDTO.getNombre() );
        autorEntity.setNacionalidad( autorDTO.getNacionalidad() );
        autorEntity.setLibros( libroDTOListToLibroEntityList( autorDTO.getLibros() ) );

        return autorEntity;
    }

    protected List<LibroDTO> libroEntityListToLibroDTOList(List<LibroEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<LibroDTO> list1 = new ArrayList<LibroDTO>( list.size() );
        for ( LibroEntity libroEntity : list ) {
            list1.add( libroMapper.toDto( libroEntity ) );
        }

        return list1;
    }

    protected List<LibroEntity> libroDTOListToLibroEntityList(List<LibroDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<LibroEntity> list1 = new ArrayList<LibroEntity>( list.size() );
        for ( LibroDTO libroDTO : list ) {
            list1.add( libroMapper.toEntity( libroDTO ) );
        }

        return list1;
    }
}
