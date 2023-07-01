package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class APIConnector {

    public static double getExchangeRate(String fromCurrency, String toCurrency, int amount) {
        String responseString = "";

        try {
            // Construir la URL de la solicitud
            String urlString = "https://api.frankfurter.app/latest?" +
                    "&amount=" + amount +
                    "&from=" + fromCurrency +
                    "&to=" + toCurrency;
            System.out.println(urlString);

            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Obtener la respuesta de la API
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                
                // Obtener la respuesta como cadena
                responseString = response.toString();

                // Manejar la respuesta JSON según tus necesidades
                // ...
            } else {
                System.out.println("Error al realizar la solicitud. Código de error: " + responseCode);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return extractExchangeRate(responseString,toCurrency);
    }
    
    private static double extractExchangeRate(String response,String idconver) {
        double exchangeRate = 0.0;

        try {
            JSONObject json = new JSONObject(response);
            JSONObject rates = json.getJSONObject("rates");
            exchangeRate = rates.getDouble(idconver);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return exchangeRate;
    }
}
