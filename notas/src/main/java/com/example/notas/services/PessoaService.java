package com.example.notas.services;

import com.example.notas.model.IdNotFindException;
import com.example.notas.model.Pessoa;
import com.example.notas.repository.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }


    public Pessoa obterPessoaPorId(Long pessoaId) throws Exception {
        return pessoaRepository.findById(pessoaId).orElseThrow(() -> new IdNotFindException(pessoaId));
    }
}
