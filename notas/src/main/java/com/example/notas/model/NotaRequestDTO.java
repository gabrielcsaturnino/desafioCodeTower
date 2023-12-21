package com.example.notas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class NotaRequestDTO {
    private String titulo;
    private String conteudo;
    private Long pessoaId;


}
