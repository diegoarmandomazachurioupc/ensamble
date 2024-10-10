package com.example.ensamble.factory;

import com.example.ensamble.model.FordChassis;
import com.example.ensamble.model.FordEngine;
import com.example.ensamble.model.FordSeats;
import com.example.ensamble.model.Chassis;
import com.example.ensamble.model.Engine;
import com.example.ensamble.model.Seats;

public class FordPartsFactory implements VehiclePartsFactory {
    @Override
    public Chassis createChassis() {
        return new FordChassis();
    }

    @Override
    public Engine createEngine() {
        return new FordEngine();
    }

    @Override
    public Seats createSeats() {
        return new FordSeats();
    }
}
