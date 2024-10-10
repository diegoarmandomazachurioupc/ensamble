package com.example.ensamble.model;

public abstract class Seats {
    protected String numeroDeParte;
    protected String material;

    public String getNumeroDeParte() {
        return numeroDeParte;
    }

    public String getMaterial() {
        return material;
    }

    public abstract String getDetails();
}
