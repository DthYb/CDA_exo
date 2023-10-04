package org.example.exercices.hotel;

import java.util.ArrayList;

public class Hotel<T> {
    private ArrayList<Client> listeclients = new ArrayList<Client>();
    private ArrayList<Chambre> listechambres = new ArrayList<Chambre>();
    private ArrayList<Reservation> listereservations = new ArrayList<Reservation>();
    
    public Hotel(ArrayList<Client> listeclients, ArrayList<Chambre> listechambres,
            ArrayList<Reservation> listereservations) {
        this.listeclients = listeclients;
        this.listechambres = listechambres;
        this.listereservations = listereservations;
    }
    public ArrayList<Client> getListeclients() {
        return listeclients;
    }
    public void setListeclients(ArrayList<Client> listeclients) {
        this.listeclients = listeclients;
    }
    public ArrayList<Chambre> getListechambres() {
        return listechambres;
    }
    public void setListechambres(ArrayList<Chambre> listechambres) {
        this.listechambres = listechambres;
    }
    public ArrayList<Reservation> getListereservations() {
        return listereservations;
    }
    public void setListereservations(ArrayList<Reservation> listereservations) {
        this.listereservations = listereservations;
    }

    public void addclient() {
        // Boolean main = true;
        // while (main ==true) {
        //     System.out.println("Indiquer le nom du client");
        // }
        // listeclients.add
    }

    
}