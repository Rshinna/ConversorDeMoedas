# Conversor de Moedas em Java

![Java](https://img.shields.io/badge/Java-17%2B-blue) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Um conversor de moedas que utiliza a ExchangeRate-API para obter taxas de câmbio em tempo real, desenvolvido em Java com interface de linha de comando.

## Funcionalidades

- Conversão entre 6 pares de moedas pré-definidos:
    - Dólar (USD) ↔ Euro (EUR)
    - Dólar (USD) ↔ Real Brasileiro (BRL)
    - Dólar (USD) ↔ Iene Japonês (JPY)
- Consulta em tempo real das taxas de câmbio
- Exibição do resultado com data/hora da conversão
- Validação de entradas do usuário

## Pré-requisitos

- Java JDK 17 ou superior
- Conexão com internet (para acesso à API)
- Chave de API do [ExchangeRate-API](https://www.exchangerate-api.com/) (crie sua chave gratuita)

## Como Executar

```bash
# 1. Clone o repositório ou copie o arquivo Principal.java
# 2. Compile o programa:
javac Principal.java
# 3. Execute o programa: 
java Principal
