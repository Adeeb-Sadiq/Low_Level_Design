package DesignPatternExamples.AbstractFactoryExample.CarFactories;

import DesignPatternExamples.AbstractFactoryExample.CarBrands.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle();
}
