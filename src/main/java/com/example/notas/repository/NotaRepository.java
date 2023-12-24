package com.example.notas.repository;

import com.example.notas.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


/*
* Interface utilizada para realizar consultas no banco de dados.
*
* <Nota: Representa a entidade a ser consultada.>
* <Long: Representa o tipo utilizado na chave primaria.>
* */
@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {


    /*
     * findBy: indica que sera realizado uma consulta.
     * Pessoa:Objeto a ser procurado pelo parametro fornecido(id -- fk de 'Pessoa' presente em nota).
     * Id: Indica o parametro para consulta.
     * */
    List<Nota> findByPessoaId(Long id);


    /*
     * deleteBy: indica que sera realizado uma exclusão.
     * Id: parametro utilizado para exclusão.
     * */
    void deleteById(Long id);



}
