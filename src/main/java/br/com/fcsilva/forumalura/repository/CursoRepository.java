package br.com.fcsilva.forumalura.repository;

import br.com.fcsilva.forumalura.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);
}
