package org.example.exercices.hotel;

public class Chambre {
    private int numerochambre;
    private boolean statut;
    private int nombredelit;
    private int tarif;

    public Chambre(int numerochambre, boolean statut, int nombredelit, int tarif) {
        this.numerochambre = numerochambre;
        this.statut = statut;
        this.nombredelit = nombredelit;
        this.tarif = tarif;
    }

    public int getNumerochambre() {
        return numerochambre;
    }

    public void setNumerochambre(int numerochambre) {
        this.numerochambre = numerochambre;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getNombredelit() {
        return nombredelit;
    }

    public void setNombredelit(int nombredelit) {
        this.nombredelit = nombredelit;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    
}
