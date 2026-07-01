package DesignPatternExamples.abstract_factory.CarFactories;

import DesignPatternExamples.abstract_factory.CarBrands.Pagani;
import DesignPatternExamples.abstract_factory.CarBrands.Vehicle;

public class PaganiFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Pagani();
    }
}
