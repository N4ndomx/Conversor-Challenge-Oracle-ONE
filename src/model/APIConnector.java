package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class APIConnector {

    public static String getRate(String urlString) {
        String responseString = "";
        
        try {
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
            } else {
                System.out.println("Error al realizar la solicitud. Código de error: " + responseCode);
            }

            conn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseString;
    }
    
    public static double extractRate(String response,String idConver) {
        double exchangeRate = 0.0;

        try {
            JSONObject json = new JSONObject(response);
            JSONObject rates = json.getJSONObject("rates");
            exchangeRate = rates.getDouble(idConver);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return exchangeRate;
    }
}
