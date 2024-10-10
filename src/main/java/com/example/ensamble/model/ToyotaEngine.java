package com.example.ensamble.model;

public class ToyotaEngine extends Engine {

    public ToyotaEngine() {
        this.numeroDeParte = "T-EN-001";
        this.potenciaMaxima = 220;
        this.tecnologia = "Híbrido";
    }

    @Override
    public String getDetails() {
        return "Motor Toyota [numeroDeParte=" + numeroDeParte + ", potenciaMaxima=" + potenciaMaxima + ", tecnologia=" + tecnologia + "]";
    }
}
