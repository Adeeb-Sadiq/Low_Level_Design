package DesignPatternExamples.AbstractFactoryExample;

import DesignPatternExamples.AbstractFactoryExample.CarBrands.Vehicle;
import DesignPatternExamples.AbstractFactoryExample.CarFactories.BMWFactory;
import DesignPatternExamples.AbstractFactoryExample.CarFactories.HyundaiFactory;
import DesignPatternExamples.AbstractFactoryExample.CarFactories.PaganiFactory;
import DesignPatternExamples.AbstractFactoryExample.CarFactories.VehicleFactory;

public class Main {
    static void main() {
        VehicleFactory hyundaiFactory = new HyundaiFactory();
        Vehicle hyundai = hyundaiFactory.createVehicle();
        hyundai.start();

        VehicleFactory bmwFactory = new BMWFactory();
        Vehicle bmw = bmwFactory.createVehicle();
        bmw.start();

        VehicleFactory paganiFactory = new PaganiFactory();
        Vehicle pagani = paganiFactory.createVehicle();
        pagani.start();

        hyundai.stop();
        bmw.stop();
        pagani.stop();
    }
}
