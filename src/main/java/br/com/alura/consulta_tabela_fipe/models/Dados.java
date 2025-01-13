package br.com.alura.consulta_tabela_fipe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Dados(String codigo,
                    String nome) {

}
