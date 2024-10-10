package com.example.ensamble.model;

public abstract class Engine {
    protected String numeroDeParte;
    protected int potenciaMaxima;
    protected String tecnologia;

    public String getNumeroDeParte() {
        return numeroDeParte;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public abstract String getDetails();
}
