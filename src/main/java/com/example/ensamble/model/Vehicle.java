package com.example.ensamble.model;

public class Vehicle {
    private String marca;
    private String color;
    private String fechaEnsamblaje;
    private String numeroEnsamblaje;
    private Chassis chasis;
    private Engine motor;
    private Seats asientos;

    public Vehicle(String marca, String color, String fechaEnsamblaje, String numeroEnsamblaje, Chassis chasis, Engine motor, Seats asientos) {
        this.marca = marca;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
        this.chasis = chasis;
        this.motor = motor;
        this.asientos = asientos;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public Chassis getChasis() {
        return chasis;
    }

    public Engine getMotor() {
        return motor;
    }

    public Seats getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        return "Vehicle [marca=" + marca + ", color=" + color + ", fechaEnsamblaje=" + fechaEnsamblaje +
                ", numeroEnsamblaje=" + numeroEnsamblaje + ", chasis=" + chasis.getDetails() +
                ", motor=" + motor.getDetails() + ", asientos=" + asientos.getDetails() + "]";
    }
}
