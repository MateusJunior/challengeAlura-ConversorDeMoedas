package model;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {


    public Currency buscaMoeda(String siglaMoeda){
        String keyAPI = "6aa00ef5286be619f056f771";
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + keyAPI + "/latest/" + siglaMoeda);
        System.out.println(endereco);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Currency.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível consultar a cotação dessa moeda.");
        }
    }
}
