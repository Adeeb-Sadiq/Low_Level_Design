package DesignPatternExamples.AbstractFactoryExample;

import DesignPatternExamples.AbstractFactoryExample.CarBrands.Vehicle;
import DesignPatternExamples.AbstractFactoryExample.CarFactories.HyundaiFactory;
import DesignPatternExamples.AbstractFactoryExample.CarFactories.VehicleFactory;

public class Main {
    static void main() {
        VehicleFactory hyundaiFactory = new HyundaiFactory();
        Vehicle hyundai = hyundaiFactory.createVehicle();
    }
}
