package org.example.exercices.hotel;

public class Client {
    private String identifiant;
    private String nom;
    private String prenom;
    private int numerotel;

    public Client(String identifiant, String nom, String prenom, int numerotel) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.numerotel = numerotel;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(int numerotel) {
        this.numerotel = numerotel;
    }
}
