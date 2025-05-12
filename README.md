# Conversor de Moedas em Java

![Java](https://img.shields.io/badge/Java-17%2B-blue) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Um conversor de moedas que utiliza a ExchangeRate-API para obter taxas de câmbio em tempo real, desenvolvido em Java com interface de linha de comando.

## 🚀Funcionalidades

- Conversão entre 6 pares de moedas pré-definidos:
    - Dólar (USD) ↔ Euro (EUR)
    - Dólar (USD) ↔ Real Brasileiro (BRL)
    - Dólar (USD) ↔ Iene Japonês (JPY)
- Consulta em tempo real das taxas de câmbio
- Exibição do resultado com data/hora da conversão
- Validação de entradas do usuário

## 📋Pré-requisitos

- Java JDK 17 ou superior
- Conexão com internet (para acesso à API)
- Chave de API do [ExchangeRate-API](https://www.exchangerate-api.com/) (crie sua chave gratuita)

## 🏁Como Executar

```bash
# 1. Clone o repositório ou copie o arquivo Principal.java
# 2. Compile o programa:
javac Principal.java
# 3. Execute o programa: 
java Principal
```
## 💻Uso do Programa

- Ao executar, você verá este menu:

********************************
Seja bem vindo ao Conversor de moedas:

1) Dólar =>> Euro
2) Euro =>> Dólar
3) Dólar =>> Real (brasileiro)
4) Real brasileiro =>> Dólar
5) Dólar =>> Iene
6) Iene =>> Dólar
7) Sair
********************************

**Passo a passo:**
1. Selecione a opção desejada (1-6)
2. Insira o valor a ser convertido quando solicitado
3. O programa exibirá o resultado formatado:

```
Data e hora: 12/05/2025 19:09:17
Valor: US$ 100,00 (Dólares) correspondem a R$ 565,10 (Reais)
```

## ⚙️Configuração

Para usar sua própria chave de API:

1. Obtenha uma chave gratuita em [ExchangeRate-API](https://www.exchangerate-api.com)
2. Substitua no código-fonte:

```java
private static final String API_KEY = "sua_chave_aqui"; // ← Modifique esta linha
```
## 🏗️Estrutura do Código
### Arquivo principal:
- Principal.java - Classe principal contendo toda a lógica do programa

### Tecnologias utilizadas:

  - ExchangeRate-API v6 para cotações em tempo real

  - Biblioteca Gson para processamento de JSON

  - HttpClient para requisições HTTP

  - Tratamento robusto de erros

## 🔜Melhorias Planejadas
- ✅ Adicionar mais pares de moedas
- ✅ Implementar cache de cotações
- ✅ Criar interface gráfica
- ✅ Histórico de conversões

## ⚠️Limitações Atuais
- Conversão apenas entre moedas pré-definidas

- Requer conexão com internet permanente

- Chave de API embutida no código-fonte

## 📜Licença
- Distribuído sob a licença MIT. Veja o arquivo [LICENSE](https://license/) para mais informações
