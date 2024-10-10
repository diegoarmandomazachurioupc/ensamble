package com.example.ensamble.model;

public class MazdaChassis extends Chassis {

    public MazdaChassis() {
        this.numeroDeParte = "M-CH-001";
        this.numeroDeEjes = 2;
        this.tipoDeTransmision = "Automática";
    }

    @Override
    public String getDetails() {
        return "Chasis Mazda [numeroDeParte=" + numeroDeParte + ", ejes=" + numeroDeEjes + ", transmision=" + tipoDeTransmision + "]";
    }
}
