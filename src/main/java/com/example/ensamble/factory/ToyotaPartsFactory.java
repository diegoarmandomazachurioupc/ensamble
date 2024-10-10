package com.example.ensamble.factory;

import com.example.ensamble.model.ToyotaChassis;
import com.example.ensamble.model.ToyotaEngine;
import com.example.ensamble.model.ToyotaSeats;
import com.example.ensamble.model.Chassis;
import com.example.ensamble.model.Engine;
import com.example.ensamble.model.Seats;

public class ToyotaPartsFactory implements VehiclePartsFactory {
    @Override
    public Chassis createChassis() {
        return new ToyotaChassis();
    }

    @Override
    public Engine createEngine() {
        return new ToyotaEngine();
    }

    @Override
    public Seats createSeats() {
        return new ToyotaSeats();
    }
}
