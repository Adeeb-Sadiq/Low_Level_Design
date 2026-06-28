package DesignPatternExamples.FactoryExample;

public class Main {
    static void main() {
        Vehicle car = VehicleFactory.getVehicle("Car");
        car.start();
        car.stop();
        System.out.println();

        Vehicle truck = VehicleFactory.getVehicle("Truck");
        truck.start();
        truck.stop();
        System.out.println();

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.start();
        bike.stop();
        System.out.println();
    }
}
