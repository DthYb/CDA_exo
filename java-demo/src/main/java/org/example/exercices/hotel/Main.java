package org.example.exercices.hotel;

import java.util.Scanner;

public class Main {
    static private String stop;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le système de réservation");
        while(stop()) {
            System.out.println("voulez-vous continuer?");
            stop = scanner.nextLine();
        }
    }
    
    static public boolean stop() {
        try {
            switch(stop) {
                case "o", "oui", "y", "yes":
                return true;
                default:
                break;
            }
        } catch(Exception e ){
            System.out.println("Erreur: " + e);

        }
        return false;
    }
}