package com.example.notas.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
* Objeto para transferencias de dados do front para o backend.
* */
@Getter @Setter @NoArgsConstructor
public class NotaRequestDTO {
    private String titulo;
    private String conteudo;
    private Long pessoaId;


}
