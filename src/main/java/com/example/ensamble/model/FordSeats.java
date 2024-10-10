package com.example.ensamble.model;

public class FordSeats extends Seats {

    public FordSeats() {
        this.numeroDeParte = "F-SE-001";
        this.material = "Tela";
    }

    @Override
    public String getDetails() {
        return "Asientos Ford [numeroDeParte=" + numeroDeParte + ", material=" + material + "]";
    }
}
