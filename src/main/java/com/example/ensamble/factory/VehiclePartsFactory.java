package com.example.ensamble.factory;

import com.example.ensamble.model.Chassis;
import com.example.ensamble.model.Engine;
import com.example.ensamble.model.Seats;

public interface VehiclePartsFactory {
    Chassis createChassis();
    Engine createEngine();
    Seats createSeats();
}