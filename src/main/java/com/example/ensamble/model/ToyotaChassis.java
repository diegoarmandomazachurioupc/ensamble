package com.example.ensamble.model;

public class ToyotaChassis extends Chassis {

    public ToyotaChassis() {
        this.numeroDeParte = "T-CH-001";
        this.numeroDeEjes = 2;
        this.tipoDeTransmision = "Automática";
    }

    @Override
    public String getDetails() {
        return "Chasis Toyota [numeroDeParte=" + numeroDeParte + ", ejes=" + numeroDeEjes + ", transmision=" + tipoDeTransmision + "]";
    }
}
