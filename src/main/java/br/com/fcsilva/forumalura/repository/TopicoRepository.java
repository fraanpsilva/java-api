package br.com.fcsilva.forumalura.repository;

import br.com.fcsilva.forumalura.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TopicoRepository extends JpaRepository <Topico, Long>{

    List<Topico> findByCursoNome(String nomeCurso);
    //Topico saveTopico();

//    // se não fosse usar o padrão do spring, teria que fazer assim
//    @Query("SELECT t FROM t WHERE t.curso.nome = :nomeCurso")
//    List<Topico> carregaPorNomeCurso(@Param("nomeCurso") String nomeCurso);

}
