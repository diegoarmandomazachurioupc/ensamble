package com.example.ensamble.model;

public abstract class Chassis {
    protected String numeroDeParte;
    protected int numeroDeEjes;
    protected String tipoDeTransmision;

    public String getNumeroDeParte() {
        return numeroDeParte;
    }

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public String getTipoDeTransmision() {
        return tipoDeTransmision;
    }

    public abstract String getDetails();
}
