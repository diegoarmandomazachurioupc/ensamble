package com.example.ensamble.builder;

import com.example.ensamble.model.Chassis;
import com.example.ensamble.model.Engine;
import com.example.ensamble.model.Seats;
import com.example.ensamble.model.Vehicle;

public class VehicleBuilder {
    private String marca;
    private String color;
    private String fechaEnsamblaje;
    private String numeroEnsamblaje;
    private Chassis chasis;
    private Engine motor;
    private Seats asientos;

    public VehicleBuilder withBrand(String marca) {
        this.marca = marca;
        return this;
    }

    public VehicleBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public VehicleBuilder withAssemblyDate(String fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
        return this;
    }

    public VehicleBuilder withAssemblyNumber(String numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
        return this;
    }

    public VehicleBuilder withChassis(Chassis chasis) {
        this.chasis = chasis;
        return this;
    }

    public VehicleBuilder withEngine(Engine motor) {
        this.motor = motor;
        return this;
    }

    public VehicleBuilder withSeats(Seats asientos) {
        this.asientos = asientos;
        return this;
    }

    public Vehicle build() {
        return new Vehicle(marca, color, fechaEnsamblaje, numeroEnsamblaje, chasis, motor, asientos);
    }
}
