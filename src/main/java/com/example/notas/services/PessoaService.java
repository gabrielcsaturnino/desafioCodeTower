package com.example.notas.services;

import com.example.notas.model.IdNotFindException;
import com.example.notas.model.Pessoa;
import com.example.notas.dto.PessoaRequestDTO;
import com.example.notas.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    private PessoaRepository pessoaRepository;

    /*
    * Injeção de dependencia.
    * */
    @Autowired
    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }


    public Pessoa obterPessoaPorId(Long pessoaId) throws Exception {
        /*
        * findById: metodo JpaRepository.
        * */
        return pessoaRepository.findById(pessoaId).orElseThrow(() -> new IdNotFindException(pessoaId));
    }



    public Pessoa criarPessoa(PessoaRequestDTO pessoaRequestDTO){
        Pessoa pessoa = new Pessoa(pessoaRequestDTO.getNome(), pessoaRequestDTO.getIdade());
        /*
        * save: metodo JpaRepository.
        * */
        return pessoaRepository.save(pessoa);
    }
}
