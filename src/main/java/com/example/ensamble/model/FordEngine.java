package com.example.ensamble.model;

public class FordEngine extends Engine {

    public FordEngine() {
        this.numeroDeParte = "F-EN-001";
        this.potenciaMaxima = 300;
        this.tecnologia = "Gasolina";
    }

    @Override
    public String getDetails() {
        return "Motor Ford [numeroDeParte=" + numeroDeParte + ", potenciaMaxima=" + potenciaMaxima + ", tecnologia=" + tecnologia + "]";
    }
}
