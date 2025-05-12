Conversor de Moedas em Java
Java
License

Um conversor de moedas que utiliza a ExchangeRate-API para obter taxas de câmbio em tempo real, desenvolvido em Java com interface de linha de comando.

Funcionalidades
Conversão entre 6 pares de moedas pré-definidos:

Dólar (USD) ↔ Euro (EUR)

Dólar (USD) ↔ Real Brasileiro (BRL)

Dólar (USD) ↔ Iene Japonês (JPY)

Consulta em tempo real das taxas de câmbio

Exibição do resultado com data/hora da conversão

Validação de entradas do usuário

Pré-requisitos
Java JDK 17 ou superior

Conexão com internet (para acesso à API)

Chave de API do ExchangeRate-API (criar sua chave gratuita na página do ExchangeRate-API link: https://www.exchangerate-api.com/)

Como Executar
Clone o repositório ou copie o arquivo Principal.java

Compile o programa:

bash
javac Principal.java
Execute o programa:

bash
java Principal
Uso do Programa
Ao executar, você verá um menu com as opções:

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
Escolha uma opção para a conversão:
Digite o número correspondente à conversão desejada

Informe o valor a ser convertido quando solicitado

O programa exibirá o resultado com:

Moedas de origem e destino

Valor original e convertido

Taxa de câmbio utilizada

Data e hora da conversão

Estrutura do Código
Principal.java: Classe principal com o menu e lógica do programa

Uso da ExchangeRate-API v6 para obter taxas atualizadas

Biblioteca Gson para processamento de JSON

HttpClient para requisições HTTP

Tratamento de erros e validações

Exemplo de Saída
Moeda de origem: USD
Moeda de destino: BRL
Valor original: 100.0
Valor convertido: 496.50
Taxa de câmbio: 4.965
Data/hora: 2023-11-20T15:30:45.123456
Personalização
Para usar sua própria chave de API:

Acesse ExchangeRate-API e obtenha uma chave gratuita

Substitua a string 6aeb478b080fb5458467f863 no código pela sua chave

Limitações
Conversões apenas entre moedas pré-definidas

Necessidade de conexão com internet

Chave de API hardcoded no código fonte

Melhorias Futuras
Adicionar mais pares de moedas

Implementar cache das taxas de câmbio

Criar interface gráfica

Adicionar histórico de conversões

Licença
Distribuído sob a licença MIT.
