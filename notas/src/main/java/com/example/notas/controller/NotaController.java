package com.example.notas.controller;

import com.example.notas.model.Nota;
import com.example.notas.model.NotaRequestDTO;
import com.example.notas.services.NotaService;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/notas")
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping("/{pessoaId}")
    public ResponseEntity<List<Nota>> getNotasDaPessoa(@PathVariable Long pessoaId) {
        List<Nota> notas = notaService.obterNotaPorId(pessoaId);
        if (notas != null) {
            return ResponseEntity.ok(notas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/todas")
    public ResponseEntity<List<Nota>> getAll(){
        List<Nota> notas = notaService.obterTodas();
        return ResponseEntity.ok(notas);
    }

    @PostMapping("/{pessoaId}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Nota> criarNota(@RequestBody NotaRequestDTO notaRequestDTO) throws Exception {
        Nota novaNota = notaService.criarNota(notaRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaNota);

    }

}
