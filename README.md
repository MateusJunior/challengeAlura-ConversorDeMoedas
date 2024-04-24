# Conversor de Moedas - Desafio Alura

Neste projeto, você irá criar um conversor de moedas utilizando a API da [ExchangeRate-API](https://app.exchangerate-api.com/).

## Objetivo

O objetivo deste desafio é criar uma aplicação que permita ao usuário converter valores de uma moeda para outra de forma rápida e precisa, utilizando a API de taxas de câmbio fornecida pela ExchangeRate-API.

## Funcionalidades

- **Seleção de Moedas:** Permitir ao usuário selecionar as moedas de origem e destino para a conversão.
- **Input de Valor:** Receber o valor a ser convertido.
- **Histórico de Conversões:** Salvar e exibir o histórico das últimas conversões realizadas.

## Recursos Utilizados

- **ExchangeRate-API:** API que fornece as taxas de câmbio em tempo real. A documentação pode ser encontrada em [ExchangeRate-API Docs](https://www.exchangerate-api.com/docs).
- **Java 19:** Utilizei os conceitos de programação orientada a objetos e a linguagem de programação Java.

## Como Executar o Projeto

1. Clone este repositório em sua máquina local.
2. Abra o arquivo `Principal.java` em sua IDE Java.
3. Explore as funcionalidades do conversor de moedas.

## Estrutura do Projeto

A estrutura básica do projeto é a seguinte:

- `Model`: Arquivo principal da aplicação onde a interface do conversor de moedas é definida.
  - `ConsultaMoeda.java`: Onde é feita a consulta via Exchange-API;
  - `Currency.java`: Java Record onde eu digo o que será pego e como será guardado da API Json.
- `Principal.java`: Arquivo de estilo para a aparência da aplicação.
- `README.md`: Este arquivo que você está lendo, contendo informações sobre o projeto.

## Contribuição

Sinta-se à vontade para contribuir com melhorias neste projeto. Você pode enviar pull requests com novas funcionalidades, correções de bugs, ou melhorias na documentação.

## Licença

Este projeto está sob a licença [MIT](https://opensource.org/licenses/MIT). Sinta-se livre para utilizar e modificar o código conforme necessário.

---

Espero que este README ajude a compreender o desafio da Alura para o conversor de moedas utilizando a ExchangeRate-API. Posso ajudar com mais alguma coisa?
