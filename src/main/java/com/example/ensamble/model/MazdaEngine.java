package com.example.ensamble.model;

public class MazdaEngine extends Engine {

    public MazdaEngine() {
        this.numeroDeParte = "M-EN-001";
        this.potenciaMaxima = 250;
        this.tecnologia = "Eléctrico";
    }

    @Override
    public String getDetails() {
        return "Motor Mazda [numeroDeParte=" + numeroDeParte + ", potenciaMaxima=" + potenciaMaxima + ", tecnologia=" + tecnologia + "]";
    }
}
