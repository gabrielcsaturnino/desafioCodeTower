package com.example.notas.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*
 * Objeto para transferencias de dados do front para o backend.
 * */
@Getter @Setter
public class PessoaRequestDTO {


    private String nome;
    private int idade;


}
