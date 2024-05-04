package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        apiKeyClass.readKey();
        String url = "https://api.currencyapi.com/v3/latest?apikey=" + apiKeyClass.getApiKey();
        System.out.println(url);
        System.out.println("Hello world!");

    }
}