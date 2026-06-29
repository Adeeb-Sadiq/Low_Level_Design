package DesignPatternExamples.AbstractFactoryExample.CarBrands;

import DesignPatternExamples.FactoryExample.Vehicle;

public class BMW implements Vehicle {
    @Override
    public void start() {
        System.out.println("BMW is starting");
    }

    @Override
    public void stop() {
        System.out.println("BMW is stopping");
    }
}
