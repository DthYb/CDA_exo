package org.example.exercices.Exceptions;

import java.util.Scanner;

public class Exo2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String numchar;
        int num;
        System.out.println("Veuillez entrer un nombre :");
        numchar = scanner.nextLine();
        try {
            num = Integer.parseInt(numchar);
            System.out.println("Votre nombre est : " + num);
        } catch (NumberFormatException e) {
            System.out.println("erreur : " + e);
        }

    }

}
