package org.example;

public class NotValidCurrencyException extends Exception{
    public NotValidCurrencyException(){
        super("Not a valid currency.");
    }
    public NotValidCurrencyException(String e){
        super(e);
    }
}
