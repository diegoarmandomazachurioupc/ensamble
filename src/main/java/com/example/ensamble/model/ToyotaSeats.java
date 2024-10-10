package com.example.ensamble.model;

public class ToyotaSeats extends Seats {

    public ToyotaSeats() {
        this.numeroDeParte = "T-SE-001";
        this.material = "Cuero";
    }

    @Override
    public String getDetails() {
        return "Asientos Toyota [numeroDeParte=" + numeroDeParte + ", material=" + material + "]";
    }
}
