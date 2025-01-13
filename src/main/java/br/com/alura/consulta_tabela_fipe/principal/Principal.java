package br.com.alura.consulta_tabela_fipe.principal;

import br.com.alura.consulta_tabela_fipe.models.Dados;
import br.com.alura.consulta_tabela_fipe.models.Modelo;
import br.com.alura.consulta_tabela_fipe.models.Veiculo;
import br.com.alura.consulta_tabela_fipe.service.ConsumoApi;
import br.com.alura.consulta_tabela_fipe.service.ConverteDados;

import java.util.*;

public class Principal {


    public void exibeMenu() {
        ConsumoApi consultarApi = new ConsumoApi();
        Scanner entrada = new Scanner(System.in);
        ConverteDados conversor = new ConverteDados();

        System.out.println("""
                Digite o tipo de veículo desejado:
                - Carro
                - Caminhão
                - Moto
                """);

        System.out.print("> ");

        String tipoDoVeiculo = entrada.nextLine().toLowerCase();
        String urlApi = "https://parallelum.com.br/fipe/api/v1/";

        if (tipoDoVeiculo.toLowerCase().contains("carr")) {
            urlApi += "carros/marcas";
        } else if (tipoDoVeiculo.toLowerCase().contains("mot")) {
            urlApi += "motos/marcas";
        } else {
            urlApi += "caminhoes/marcas";
        }

        String dados = consultarApi.getData(urlApi);

        ConverteDados converteDados = new ConverteDados();

        List<Dados> listaDasMarcas = converteDados.obterLista(dados, Dados.class);

        listaDasMarcas.stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.println("Informe o código da marca para consulta: ");
        String codigoDaMarca = entrada.nextLine();

        urlApi += "/" + codigoDaMarca + "/modelos";

        String json = consultarApi.getData(urlApi);

        var listaDosModelos = conversor.obterDados(json, Modelo.class);

        listaDosModelos.modelos().stream()
                .sorted(Comparator.comparing(Dados::codigo))
                .forEach(System.out::println);

        System.out.println("Digite um trecho do nome do carro a ser buscado: ");
        String trechoDoCarro = entrada.nextLine();


        System.out.println("\nModelos filtrados: ");
        listaDosModelos.modelos().stream()
                        .filter(m -> m.nome().toLowerCase().contains(trechoDoCarro))
                        .forEach(System.out::println);

        System.out.println("Informe do código do veículo para consulta: ");
        String codigoDoVeiculo = entrada.nextLine();

        urlApi += "/" + codigoDoVeiculo + "/anos";
        json = consultarApi.getData(urlApi);

        List<Dados> listaDoVeiculoPorAno = converteDados.obterLista(json, Dados.class);

        List<Veiculo> listaInfoVeiculosPorAno = new ArrayList<>();

        for (Dados value : listaDoVeiculoPorAno) {
            json = consultarApi.getData(urlApi + "/" + value.codigo());
            listaInfoVeiculosPorAno.add(conversor.obterDados(json, Veiculo.class));
        }

        listaInfoVeiculosPorAno.forEach(System.out::println);
    }
}
