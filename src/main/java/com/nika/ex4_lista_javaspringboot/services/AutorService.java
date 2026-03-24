package com.nika.ex4_lista_javaspringboot.services;

import com.nika.ex4_lista_javaspringboot.models.Autor;
import com.nika.ex4_lista_javaspringboot.repositories.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private final AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public Autor salvar(Autor autor) {
        return repository.save(autor);
    }

    public List<Autor> listar() {
        return repository.findAll();
    }

    public Autor buscar(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}