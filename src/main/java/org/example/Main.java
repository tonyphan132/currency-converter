package org.example;

import com.google.gson.Gson;
import java.net.http.HttpRequest;
import java.util.Scanner;

public class Main {
    private final static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        apiKeyClass.readKey();
        String route = "https://api.currencyapi.com/v3/latest?apikey=" + apiKeyClass.getApiKey();
        displayCurrency();
        in.close();
    }

    private static void getParam(){
        System.out.println("What is your base currency?");
        displayCurrency();
        System.out.println("What currency are you converting into?");
        displayCurrency();
    }

    private static void displayCurrency(){
        System.out.println("CAD: Canadian Dollar\nVND: Vietnamese Dong\nUSD: US Dollar\n");
    }
}