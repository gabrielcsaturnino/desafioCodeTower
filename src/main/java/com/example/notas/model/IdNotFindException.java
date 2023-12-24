package com.example.notas.model;

public class IdNotFindException extends RuntimeException{
    /*
    * Usado apenas para testes durante o desenvolvimento.
    * */
    public IdNotFindException(Long pessoaId){
        super("Pessoa com id: " + pessoaId + " não encontrado");
    }
}
