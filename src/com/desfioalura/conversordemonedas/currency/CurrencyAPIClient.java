package com.desfioalura.conversordemonedas.currency;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyAPIClient {
    private static final String API_KEY = "df2e508e9109324ace32fced";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double getExchangeRate(Currency fromCurrency, Currency toCurrency) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL + fromCurrency))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
                return json.getAsJsonObject("conversion_rates").get(toCurrency.toString()).getAsDouble();
                //Obtiene los datos de conversión del Json y busca el codigo de la divisa a convertir
            } else {
                System.out.println("Error en la conexión: " + response.statusCode());
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
            return -1;
        }
    }
}
