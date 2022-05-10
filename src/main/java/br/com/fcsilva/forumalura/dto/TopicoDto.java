package br.com.fcsilva.forumalura.dto;

import br.com.fcsilva.forumalura.modelo.Topico;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class TopicoDto {
    // DTO - Data Transfer Object

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    public TopicoDto(Topico topico) {
        // pegando os dados indicados na criação de um tópico
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }


    public static List<TopicoDto> converter(List<Topico> topicos) {
        // convertendo Topicos em TopicosDto
        return topicos.stream().map(TopicoDto :: new).collect(Collectors.toList());

    }
}
