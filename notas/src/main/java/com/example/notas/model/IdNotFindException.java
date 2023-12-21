package com.example.notas.model;

public class IdNotFindException extends RuntimeException{
    public IdNotFindException(Long pessoaId){
        super("Pessoa com id: " + pessoaId + " não encontrado");
    }
}
