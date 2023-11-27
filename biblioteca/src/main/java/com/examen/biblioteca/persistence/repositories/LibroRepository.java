package com.examen.biblioteca.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.biblioteca.persistence.entities.LibroEntity;


@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, Long>{

}
