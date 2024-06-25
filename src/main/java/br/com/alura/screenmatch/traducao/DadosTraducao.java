package br.com.alura.screenmatch.traducao;

import br.com.alura.screenmatch.traducao.DadosResposta;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTraducao(@JsonAlias(value = "responseData") DadosResposta dadosResposta) {
}