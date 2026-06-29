package DesignPatternExamples.AbstractFactoryExample.CarFactories;

import DesignPatternExamples.AbstractFactoryExample.CarBrands.Hyundai;
import DesignPatternExamples.AbstractFactoryExample.CarBrands.Vehicle;

public class HyundaiFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Hyundai();
    }
}
