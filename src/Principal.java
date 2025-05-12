import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
    private static final String API_BASE_URL = "https://v6.exchangerate-api.com/v6/6aeb478b080fb5458467f863/latest/";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcao = "";

        String menu = """
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
                """;



        while (!opcao.equals("7")) {

            System.out.println(menu);
            opcao = sc.nextLine();
            String daMoeda = "";
            String paraMoeda = "";

            switch (opcao) {
                case "1":
                    daMoeda = "USD";
                    paraMoeda = "EUR";
                    break;
                case "2":
                    daMoeda = "EUR";
                    paraMoeda = "USD";
                    break;
                case "3":
                    daMoeda = "USD";
                    paraMoeda = "BRL";
                    break;
                case "4":
                    daMoeda = "BRL";
                    paraMoeda = "USD";
                    break;
                case "5":
                    daMoeda = "USD";
                    paraMoeda = "JPY";
                    break;
                case "6":
                    daMoeda = "JPY";
                    paraMoeda = "USD";
                    break;
                case "7":
                    System.out.println("Saindo...");
                    continue;
                default:
                    System.out.println("Opção inválida! Tente novamente");
                    continue;
            }

            if (!daMoeda.isEmpty() && !paraMoeda.isEmpty()) {
                double taxa = getTaxaCambio(daMoeda, paraMoeda);
                if (taxa == 0.0) {
                    System.out.println("Erro ao obter taxa de câmbio. Tente novamente.");
                    continue;
                }

                System.out.print("Digite a quantidade: ");
                double quantidade;
                try {
                    quantidade = Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Quantidade inválida! Tente novamente.");
                    continue;
                }

                double quantidadeConvertida = quantidade * taxa;
                LocalDateTime dateTime = LocalDateTime.now();
                Conversao conversao = new Conversao(daMoeda,paraMoeda,quantidade,taxa, dateTime);
                System.out.println(conversao);

            }
        }
        sc.close();
    }

    private static double getTaxaCambio(String daMoeda, String paraMoeda) {
        String apiUrl = API_BASE_URL + daMoeda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                System.out.println("Erro na API: " + response.statusCode());
                return 0.0;
            }

            Gson gson = new Gson();
            ExchangeRateApiResponse apiResponse = gson.fromJson(response.body(), ExchangeRateApiResponse.class);

            if (!apiResponse.result().equals("success")) {
                System.out.println("API retornou erro: " + apiResponse.result());
                return 0.0;
            }

            return apiResponse.conversion_rates().get(paraMoeda);
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao acessar a API: " + e.getMessage());
            return 0.0;
        }

    }
}