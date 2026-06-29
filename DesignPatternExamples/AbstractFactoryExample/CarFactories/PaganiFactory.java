package DesignPatternExamples.AbstractFactoryExample.CarFactories;

import DesignPatternExamples.AbstractFactoryExample.CarBrands.Pagani;
import DesignPatternExamples.AbstractFactoryExample.CarBrands.Vehicle;

public class PaganiFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Pagani();
    }
}
