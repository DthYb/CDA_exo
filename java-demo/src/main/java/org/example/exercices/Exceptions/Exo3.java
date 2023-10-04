package org.example.exercices.Exceptions;

public class Exo3 {
    public static void main(String[] args) {
        String[] table = {"1","2","3","4","5"};
        try {
            System.out.println(table[6]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("erreur : " + e);
        }
    }
}
