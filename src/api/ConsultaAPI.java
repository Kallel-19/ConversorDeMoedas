import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    private static String API_KEY = "d959ac56db252e11808e08cf";
    private static String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public FiltroMoedas buscarTaxas(String baseMoeda) {
        try {
            String url = BASE_URL + API_KEY + "/latest/" + baseMoeda; // o latest ele busca a taxa de cambio mais atualizada disponivel na API
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonResponse jsonResponse = gson.fromJson(response.body(), JsonResponse.class);

            return new FiltroMoedas(
                    jsonResponse.conversion_rates.ARS,
                    jsonResponse.conversion_rates.BOB,
                    jsonResponse.conversion_rates.BRL,
                    jsonResponse.conversion_rates.CLP,
                    jsonResponse.conversion_rates.COP
            );

        } catch (Exception e) {
            System.out.println("Erro ao consultar a API: " + e.getMessage());
            return null;
        }
    }

    private class JsonResponse {
        ConversionRates conversion_rates;
    }

    private static class ConversionRates {
        double ARS, BOB, BRL, CLP, COP;
    }
}
