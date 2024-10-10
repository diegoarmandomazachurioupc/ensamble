package com.example.ensamble.factory;

import com.example.ensamble.model.MazdaChassis;
import com.example.ensamble.model.MazdaEngine;
import com.example.ensamble.model.MazdaSeats;
import com.example.ensamble.model.Chassis;
import com.example.ensamble.model.Engine;
import com.example.ensamble.model.Seats;

public class MazdaPartsFactory implements VehiclePartsFactory {
    @Override
    public Chassis createChassis() {
        return new MazdaChassis();
    }

    @Override
    public Engine createEngine() {
        return new MazdaEngine();
    }

    @Override
    public Seats createSeats() {
        return new MazdaSeats();
    }
}
