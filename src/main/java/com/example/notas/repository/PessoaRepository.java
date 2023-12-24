package com.example.notas.repository;

import com.example.notas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


/*
 * Interface utilizada para realizar consultas no banco de dados.
 *
 * <Pessoa: Representa a entidade a ser consultada.>
 * <Long: Representa o tipo utilizado na chave primaria.>
 * */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {



}
