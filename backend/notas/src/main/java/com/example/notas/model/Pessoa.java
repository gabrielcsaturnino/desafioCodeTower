package com.example.notas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter @Table(name = "Pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private int idade;


    /*
     * Pessoa(1)--------(N)Notas
     * Relação bidirecional
     * mappedBy:Define o lado de referencia da relação
     *
     *  */
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Nota> notas;


    public Pessoa() {

    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }



}
