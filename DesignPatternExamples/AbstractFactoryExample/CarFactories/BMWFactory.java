package DesignPatternExamples.AbstractFactoryExample.CarFactories;

import DesignPatternExamples.AbstractFactoryExample.CarBrands.BMW;
import DesignPatternExamples.AbstractFactoryExample.CarBrands.Vehicle;

public class BMWFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
