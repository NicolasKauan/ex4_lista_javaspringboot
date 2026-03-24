package com.nika.ex4_lista_javaspringboot.repositories;

import com.nika.ex4_lista_javaspringboot.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}