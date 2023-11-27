package com.examen.biblioteca.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examen.biblioteca.persistence.entities.*;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, Long>{

}
