package br.com.fcsilva.forumalura.controller.dto;

import br.com.fcsilva.forumalura.modelo.Resposta;
import br.com.fcsilva.forumalura.modelo.StatusTopico;
import br.com.fcsilva.forumalura.modelo.Topico;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class DetalhesTopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;

    public DetalhesTopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
        this.nomeAutor = topico.getAutor().getNome();
        this.status = topico.getStatus();
        this.respostas = new ArrayList<>();
        this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto :: new).collect(Collectors.toList()));
    }
}
