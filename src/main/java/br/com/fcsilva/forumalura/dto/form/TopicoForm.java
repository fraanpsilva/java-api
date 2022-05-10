package br.com.fcsilva.forumalura.dto.form;

import br.com.fcsilva.forumalura.modelo.Curso;
import br.com.fcsilva.forumalura.modelo.Topico;
import br.com.fcsilva.forumalura.repository.CursoRepository;
import br.com.fcsilva.forumalura.repository.TopicoRepository;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
@Setter
public class TopicoForm {

    @NotNull @NotEmpty @Length(min = 5)
    private String titulo;

    @NotNull @NotEmpty @Length(min = 10)
    private String mensagem;

    @NotNull @NotEmpty
    private String nomeCurso;

    public Topico converter(CursoRepository repository){
        Curso curso = repository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }

}
