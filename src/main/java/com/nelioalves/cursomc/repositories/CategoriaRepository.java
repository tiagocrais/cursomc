package com.nelioalves.cursomc.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, ID> {

	Optional<Categoria> findById(Integer id);
}
