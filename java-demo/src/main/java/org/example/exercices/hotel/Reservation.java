package org.example.exercices.hotel;

import java.util.ArrayList;

public class Reservation {
    private String identifiant;
    private boolean status;
    private ArrayList<Chambre> listechambres = getListechambres();
    private Client client;

    public Reservation(String identifiant, boolean status, ArrayList<Chambre> listechambres, Client client) {
        this.identifiant = identifiant;
        this.status = status;
        this.listechambres = listechambres;
        this.client = client;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<Chambre> getListechambres() {
        return listechambres;
    }

    public void setListechambres(ArrayList<Chambre> listechambres) {
        this.listechambres = listechambres;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    
}
