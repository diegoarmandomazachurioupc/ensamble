package com.example.ensamble.model;

public class MazdaSeats extends Seats {

    public MazdaSeats() {
        this.numeroDeParte = "M-SE-001";
        this.material = "Ante";
    }

    @Override
    public String getDetails() {
        return "Asientos Mazda [numeroDeParte=" + numeroDeParte + ", material=" + material + "]";
    }
}
