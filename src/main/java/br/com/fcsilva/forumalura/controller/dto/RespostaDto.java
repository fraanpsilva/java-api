package br.com.fcsilva.forumalura.controller.dto;

import br.com.fcsilva.forumalura.modelo.Resposta;
import lombok.Getter;

import java.time.LocalDateTime;


@Getter
public class RespostaDto {

    private Long id;
    private String mensagem;
    private LocalDateTime dataCriacao;
    public String nomeAutor;

    public RespostaDto(Resposta resposta) {
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriacao = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }
}
