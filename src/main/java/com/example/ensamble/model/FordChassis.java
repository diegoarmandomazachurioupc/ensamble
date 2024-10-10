package com.example.ensamble.model;

public class FordChassis extends Chassis {

    public FordChassis() {
        this.numeroDeParte = "F-CH-001";
        this.numeroDeEjes = 2;
        this.tipoDeTransmision = "Manual";
    }

    @Override
    public String getDetails() {
        return "Chasis Ford [numeroDeParte=" + numeroDeParte + ", ejes=" + numeroDeEjes + ", transmision=" + tipoDeTransmision + "]";
    }
}
