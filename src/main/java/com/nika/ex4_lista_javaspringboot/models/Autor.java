package com.nika.ex4_lista_javaspringboot.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity(name = "Autor")
@Table(name = "tb_autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_autor")
    private String nome;

    @Column(name = "pais_origem")
    private String nacionalidade;

    private LocalDate dataNascimento;

    // getters e setters
}