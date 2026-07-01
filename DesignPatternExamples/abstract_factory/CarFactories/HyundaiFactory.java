package DesignPatternExamples.abstract_factory.CarFactories;

import DesignPatternExamples.abstract_factory.CarBrands.Hyundai;
import DesignPatternExamples.abstract_factory.CarBrands.Vehicle;

public class HyundaiFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Hyundai();
    }
}
