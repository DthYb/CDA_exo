package org.example.exercices.hotel;

import java.util.Scanner;

public class Main {
    static private String choix;
    static private Boolean menu = true;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bienvenue dans le système de réservation");
        while(menu == true) {
            System.out.println("Que voulez-vous faire?");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Afficher la liste des clients");
            System.out.println("3. Afficher les réservations d'un clients");
            System.out.println("4. Ajouter une réservation");
            System.out.println("5. Annuler une réservation");
            System.out.println("6. Afficher la liste des réservations");
            System.out.println("0. Quitter");
            System.out.println("Votre choix :");
            choix = scanner.nextLine();

            switch(choix) {
                case "1":
                // Client client = new Client(param);
                break;
                case "2":
                break;
                case "3":
                break;
                case "4":
                break;
                case "5":
                break;
                case "6":
                break;
                case "0":
                System.out.println("Enrevoir :) !");
                menu = false;
                break;
                default:
                System.out.println("Votre choix n'est pas valide, veuillez réessayez: ");
                break;
            }
        }
    }
}