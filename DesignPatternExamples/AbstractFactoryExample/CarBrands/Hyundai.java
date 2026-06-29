package DesignPatternExamples.AbstractFactoryExample.CarBrands;

import DesignPatternExamples.FactoryExample.Vehicle;

public class Hyundai implements Vehicle {
    @Override
    public void start() {
        System.out.println("Hyundai is starting");
    }

    @Override
    public void stop() {
        System.out.println("Hyundai is stopping");
    }
}
