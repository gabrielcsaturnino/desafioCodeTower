package com.example.notas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity @Getter @Setter @Table(name = "Nota")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String conteudo;

    /*
    * Nota(N)--------(1)Pessoa
    * Relação bidirecional
    * JoinColumn: define a chave estrangeira como fk_pessoa_id
    * */
    @ManyToOne
    @JoinColumn(name = "fk_pessoa_id", nullable = false)
    @JsonIgnore
    private Pessoa pessoa;

    public Nota() {

    }
    public Nota(String titulo, String conteudo, Pessoa pessoa){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.pessoa = pessoa;
    }


}