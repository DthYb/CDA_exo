package org.example.exercices.TPStream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trader abdallah = new Trader("Abdallah","Cambridge");
        Trader audrey = new Trader("audrey", "Milan");
        Trader corentin = new Trader("corentin", "Cambridge");
        Trader tristan = new Trader("tristan", "Cambridge");

        List<Transaction> Transaction = Arrays.asList(
        new Transaction(abdallah, 2011, 400), 
        new Transaction( abdallah, 2012, 300),
        new Transaction(audrey, 2012, 1000), 
        new Transaction(audrey, 2011, 400),
        new Transaction(corentin, 2012, 710),
        new Transaction(corentin, 2012, 700),
        new Transaction(tristan, 2012, 950),
        new Transaction(tristan, 2022, 900)
        );
    }

    public void gettrasaction2011() {
        
    }
}
