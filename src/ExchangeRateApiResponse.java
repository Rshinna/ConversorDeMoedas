import java.util.Map;

public record ExchangeRateApiResponse(
        String result,
        Map<String, Double> conversion_rates
) {}