package org.example.exercices.Exceptions;

import java.util.Scanner;

public class Exo1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int entiera;
        int entierb;
        System.out.println("Calculatrice :");
        System.out.println("nombre a :");
        entiera = scanner.nextInt();
        System.out.println("nombre b :");
        entierb = scanner.nextInt();
        try {
            System.out.println("résultat : " + entiera / entierb);
        } catch (ArithmeticException e) {
            System.out.println("Erreur :" + e);
        }   
        
    }
}
