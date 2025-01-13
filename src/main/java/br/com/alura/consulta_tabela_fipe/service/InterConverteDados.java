package br.com.alura.consulta_tabela_fipe.service;

import java.util.List;

public interface InterConverteDados {
    <T> T obterDados(String json, Class<T> classe);

    <T> List<T> obterLista(String json, Class<T> classe);
}
