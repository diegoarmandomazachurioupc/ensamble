package com.example.ensamble.controller;

import com.example.ensamble.builder.VehicleBuilder;
import com.example.ensamble.factory.FordPartsFactory;
import com.example.ensamble.factory.MazdaPartsFactory;
import com.example.ensamble.factory.ToyotaPartsFactory;
import com.example.ensamble.factory.VehiclePartsFactory;
import com.example.ensamble.model.Vehicle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class VehicleController {

    @GetMapping
    public List<Vehicle> assemblePredefinedVehicles() {

        List<Vehicle> assembledVehicles = new ArrayList<>();

        // Definir el primer vehículo (Toyota)
        VehiclePartsFactory toyotaFactory = new ToyotaPartsFactory();
        Vehicle toyotaVehicle = new VehicleBuilder()
                .withBrand("Toyota")
                .withColor("Rojo")
                .withAssemblyDate("2024-09-01")
                .withAssemblyNumber("001")
                .withChassis(toyotaFactory.createChassis())
                .withEngine(toyotaFactory.createEngine())
                .withSeats(toyotaFactory.createSeats())
                .build();
        assembledVehicles.add(toyotaVehicle);

        // Definir el segundo vehículo (Ford)
        VehiclePartsFactory fordFactory = new FordPartsFactory();
        Vehicle fordVehicle = new VehicleBuilder()
                .withBrand("Ford")
                .withColor("Azul")
                .withAssemblyDate("2024-09-15")
                .withAssemblyNumber("002")
                .withChassis(fordFactory.createChassis())
                .withEngine(fordFactory.createEngine())
                .withSeats(fordFactory.createSeats())
                .build();
        assembledVehicles.add(fordVehicle);

        // Definir el tercer vehículo (Mazda)
        VehiclePartsFactory mazdaFactory = new MazdaPartsFactory();
        Vehicle mazdaVehicle = new VehicleBuilder()
                .withBrand("Mazda")
                .withColor("Negro")
                .withAssemblyDate("2024-09-20")
                .withAssemblyNumber("003")
                .withChassis(mazdaFactory.createChassis())
                .withEngine(mazdaFactory.createEngine())
                .withSeats(mazdaFactory.createSeats())
                .build();
        assembledVehicles.add(mazdaVehicle);

        // Retornar la lista de vehículos ensamblados
        return assembledVehicles;
    }
}
