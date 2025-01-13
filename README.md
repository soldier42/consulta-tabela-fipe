<h1 align="center">Consulta da Tabela Fipe</h1>

<p align="center">
<img loading="lazy" src="http://img.shields.io/static/v1?label=STATUS&message=FINALIZADO&color=00FF00&style=for-the-badge"/>
</p>

# Índice 

* [Descrição do Projeto](#descrição-do-projeto)
* [Requisitos](#requisitos)
* [Funcionalidade](#funcionalidade)
* [Demonstração da Aplicação](#demonstração-da-aplicação)
* [Tecnologias utilizadas](#tecnologias-utilizadas)
* [Acesso ao Projeto](#acesso-ao-projeto)

# Descrição do Projeto e Objetivo
Este projeto é a resolução de um desafio proposto pela equipe da Alura em parceria com a Oracle One: a proposta é desenvolver uma aplicação que faça, com requisições via [**API**](https://deividfortuna.github.io/fipe/), consultas de preços de modelos específicos de veículos com base na tabela FIPE.

O objetivo do projeto é consolidar os conhecimentos adquiridos nas aulas de [**Java: persistência de dados e consultas com Spring Data JPA**](https://cursos.alura.com.br/course/java-persistencia-dados-consultas-spring-data-jpa).

# Requisitos

## JDK v17.0.12
O JDK é um ambiente de desenvolvimento para construção de aplicações que usa a linguagem Java.
- A versão que foi utilizada neste projeto foi a **jdk-17.0.12** e pode ser encontrado no site da [**Oracle**](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html).


# Funcionalidades
- **Consulta de preços**: A aplicação permite consultas sobre preços de um veículo especificado pelo próprio usuário. Os tipos de veículos disponíveis são: carro, moto e caminhão.

# Demonstração da Aplicação
A aplicação é intuitiva, portanto basta que o usuário siga as instruções do terminal. Eis um exemplo abaixo:
```
Digite o tipo de veículo desejado:
- Carro
- Caminhão
- Moto

>> carro

-------------------------------
Dados[codigo=1, nome=Acura]
Dados[codigo=10, nome=Cadillac]
Dados[codigo=11, nome=CBT Jipe]
Dados[codigo=25, nome=Honda]
.
.
.
Dados[codigo=6, nome=Audi]
Dados[codigo=7, nome=BMW]
Dados[codigo=8, nome=BRM]

Informe o código da marca para consulta: 
>> 25

-------------------------------
Dados[codigo=10017, nome=HR-V EXL 1.5 Sensing 16V 5p Aut.]
Dados[codigo=10216, nome=HR-V Advance 1.5  Flex TB 16V 5p Aut.]
Dados[codigo=10217, nome=HR-V EX 1.5 Flex Sensing 16V 5p Aut.]
.
.
.
Dados[codigo=9678, nome=CITY Sedan Touring 1.5 Flex 16V 4p Aut.]
Dados[codigo=9732, nome=CITY Hatchback EXL 1.5 Flex 16V Aut.]
Dados[codigo=9733, nome=CITY Hatchback Touring 1.5 Flex 16V Aut]

Digite um trecho do nome do carro a ser buscado: 
>> civic
-------------------------------

Modelos filtrados: 
Dados[codigo=1248, nome=Civic Coupe EX/ EXS 1.6 16V 2p]
Dados[codigo=8281, nome=Civic Coupe Si 1.5 TB 16V 208cv Mec. 2p]
Dados[codigo=7036, nome=Civic Coupe Si 2.4 16V 206cv Mec. 2p]
.
.
.

Dados[codigo=6326, nome=Civic Sedan LXR 2.0 Flexone 16V Aut. 4p]
Dados[codigo=4010, nome=Civic Sedan LXS 1.8/1.8 Flex 16V Aut. 4p]

Informe do código do veículo para consulta: 
>> 6326
--------------------------------

Veiculo[tipoVeiculo=1, valor=R$ 75.578,00, marca=Honda, modelo=Civic Sedan LXR 2.0 Flexone 16V Aut. 4p, anoModelo=2016, combustivel=Gasolina, codigoFipe=014074-0, mesReferencia=janeiro de 2025, siglaCombustivel=G]

Veiculo[tipoVeiculo=1, valor=R$ 71.853,00, marca=Honda, modelo=Civic Sedan LXR 2.0 Flexone 16V Aut. 4p, anoModelo=2015, combustivel=Gasolina, codigoFipe=014074-0, mesReferencia=janeiro de 2025, siglaCombustivel=G]

Veiculo[tipoVeiculo=1, valor=R$ 67.782,00, marca=Honda, modelo=Civic Sedan LXR 2.0 Flexone 16V Aut. 4p, anoModelo=2014, combustivel=Gasolina, codigoFipe=014074-0, mesReferencia=janeiro de 2025, siglaCombustivel=G]
```
*consulta feita em 13/01/2025*

## Observações
Para bom funcionamento do código, é recomendado que:
- Utilize-se apenas **valores inteiros** quando forem solicitados códigos de modelo e veículo;

O código ainda **não possui tratamentos de erros**, portanto, leia atentamente as instruções.

Pelo código ser ligeiramente simples, não foi feito um feito um tratamento das consultas quando *printadas*.

Todos os dados são obtidos através da [**FIPE API**](https://deividfortuna.github.io/fipe/).

# Tecnologias Utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

# Acesso ao Projeto
1. Clone este repositório:
```
git clone https://github.com/soldier42/
```
2. Certifique de que todas os [requisitos](#requisitos) estejam certos e instalados.
3. Execute e compile o código.
