package org.example;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class apiKeyClass {
    private final static String apiKeyFile = "api_key.txt";
    public static String apiKey;

    public static String getApiKey() {
        return apiKey;
    }

    public static void readKey(){
        Scanner read = null;
        try{
            read = new Scanner(new FileInputStream(apiKeyFile));
            if (read.hasNextLine()){
                apiKey = read.nextLine();
            }
            else{
                throw new Exception("File Empty!");
            }
            System.out.println();
        }catch(FileNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        if (read != null){
            read.close();
        }
    }
}
