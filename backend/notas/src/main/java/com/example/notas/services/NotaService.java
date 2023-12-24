package com.example.notas.services;

import com.example.notas.model.Nota;
import com.example.notas.dto.NotaRequestDTO;
import com.example.notas.model.Pessoa;
import com.example.notas.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService {
    private NotaRepository notaRepository;
    private PessoaService pessoaService;


   /*
   * Injeção de dependencias.
   * */
    @Autowired
    public NotaService(NotaRepository notaRepository, PessoaService pessoaService) {
        this.notaRepository = notaRepository;
        this.pessoaService = pessoaService;
    }
    public List<Nota> obterNotaPorId(Long id){
        return notaRepository.findByPessoaId(id);
    }


    public Nota criarNota(NotaRequestDTO notaRequestDTO) throws Exception {
        Pessoa pessoa = pessoaService.obterPessoaPorId(notaRequestDTO.getPessoaId());
        Nota novaNota = new Nota(notaRequestDTO.getTitulo(),notaRequestDTO.getConteudo(), pessoa);
        return notaRepository.save(novaNota);
    }




}
