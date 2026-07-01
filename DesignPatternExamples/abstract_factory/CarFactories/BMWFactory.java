package DesignPatternExamples.abstract_factory.CarFactories;

import DesignPatternExamples.abstract_factory.CarBrands.BMW;
import DesignPatternExamples.abstract_factory.CarBrands.Vehicle;

public class BMWFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
