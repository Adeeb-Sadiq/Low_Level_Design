package DesignPatternExamples.abstract_factory;

import DesignPatternExamples.abstract_factory.CarBrands.Vehicle;
import DesignPatternExamples.abstract_factory.CarFactories.BMWFactory;
import DesignPatternExamples.abstract_factory.CarFactories.HyundaiFactory;
import DesignPatternExamples.abstract_factory.CarFactories.PaganiFactory;
import DesignPatternExamples.abstract_factory.CarFactories.VehicleFactory;

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
