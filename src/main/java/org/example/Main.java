package org.example;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private final static Scanner in = new Scanner(System.in);
    private final static String[] currencies = {"CAD", "USD", "VND"};
    public static void main(String[] args) {
        Currency rate = null;
        apiKeyClass.readKey();
        String route = null;
        String responseTry = "{\"meta\":{\"last_updated_at\":\"2024-05-04T23:59:59Z\"},\"data\":{\"USD\":{\"code\":\"USD\",\"value\":0.7307376748}}}";
        String responseTry2 = "{\"meta\":{\"last_updated_at\":\"2024-05-04T23:59:59Z\"},\"data\":{\"USD\":{\"code\":\"USD\",\"value\":0.7307376748}}}";
        /*
        try{
            route = "https://api.currencyapi.com/v3/latest?apikey=" + apiKeyClass.getApiKey() + "&base_currency=" + getCurrency(0) + "&currencies=" + getCurrency(1);
            HttpRequest postReq = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(route))
                    .build();
            try(HttpClient client = HttpClient.newHttpClient()){
                HttpResponse<String> getResponse = client.send(postReq, HttpResponse.BodyHandlers.ofString());
                System.out.println(getResponse.body());
            }catch(Exception e){
                System.out.println("FAILED");
                System.out.println(e.getMessage());
            }

        }catch(NotValidCurrencyException e){
            System.out.println(e.getLocalizedMessage());
        }

         */


        System.out.println(responseTry);
        rate = new Gson().fromJson(responseTry, Currency.class);
        System.out.println(rate.getMeta().getLastUpdatedAt());
        System.out.println(rate.getData().getName().getCode());
        System.out.println(rate.getData().getName().getValue());
        in.close();
    }

    private static String getCurrency(int baseOrQuote) throws NotValidCurrencyException{
        String currency = null;
        boolean condition = false;
        if (baseOrQuote == 0){
            System.out.println("What currency do you want to convert?");
        }
        else{
            System.out.println("What currency do you want to convert into?");
        }
        displayCurrency();
        while(!condition){
            currency = in.next();
            for(String element: currencies){
                if(currency.equals(element)){
                    condition = true;
                    break;
                }
            }
            if(!condition){
                throw new NotValidCurrencyException();
            }
        }
        return currency;
    }

    private static void displayCurrency(){
        System.out.println("CAD: Canadian Dollar\nVND: Vietnamese Dong\nUSD: US Dollar\nYour choice: ");
    }
}