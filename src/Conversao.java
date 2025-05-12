import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Conversao {

    private String daMoeda;
    private String paraMoeda;
    private double quantidade;
    private double taxa;
    private LocalDateTime dateTime;

    public Conversao(String daMoeda, String paraMoeda, double quantidade, double taxa, LocalDateTime dateTime) {
        this.daMoeda = daMoeda;
        this.paraMoeda = paraMoeda;
        this.quantidade = quantidade;
        this.taxa = taxa;
        this.dateTime = dateTime;
    }

    public String getDaMoeda() {
        return daMoeda;
    }

    public void setDaMoeda(String daMoeda) {
        this.daMoeda = daMoeda;
    }

    public String getParaMoeda() {
        return paraMoeda;
    }

    public void setParaMoeda(String paraMoeda) {
        this.paraMoeda = paraMoeda;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    private static String getNomeMoeda(String codigoMoeda) {
        return switch (codigoMoeda) {
            case "USD" -> "Dólares";
            case "EUR" -> "Euros";
            case "BRL" -> "Reais";
            case "JPY" -> "Ienes";
            default -> codigoMoeda;
        };
    }

    private static String getSimboloMoeda(String codigoMoeda) {
        return switch (codigoMoeda) {
            case "USD" -> "US$";
            case "EUR" -> "€";
            case "BRL" -> "R$";
            case "JPY" -> "¥";
            default -> codigoMoeda;
        };
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);

        String nomeMoedaOrigem = getNomeMoeda(daMoeda);
        String nomeMoedaDestino = getNomeMoeda(paraMoeda);
        String simboloMoedaOrigem = getSimboloMoeda(daMoeda);
        String simboloMoedaDestino = getSimboloMoeda(paraMoeda);
        String valorOriginalFormatado = String.format("%.2f", quantidade);
        String valorConvertidoFormatado = String.format("%.2f", quantidade * taxa);

        return "Data e hora: " + formattedDateTime + "\n" +
                "Valor: " + simboloMoedaOrigem + " " + valorOriginalFormatado + " (" + nomeMoedaOrigem + ")" +
                " correspondem a " + simboloMoedaDestino + " " + valorConvertidoFormatado + " (" + nomeMoedaDestino + ")";
    }

}