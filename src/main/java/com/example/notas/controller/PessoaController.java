package com.example.notas.controller;

import com.example.notas.model.Pessoa;
import com.example.notas.dto.PessoaRequestDTO;
import com.example.notas.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    PessoaService pessoaService;

    /*
    * Metodo para criar 'Pessoa'.
    * */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Pessoa> criarPessoa(@RequestBody PessoaRequestDTO pessoaRequestDTO){
           Pessoa pessoa = pessoaService.criarPessoa(pessoaRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);

    }

}
