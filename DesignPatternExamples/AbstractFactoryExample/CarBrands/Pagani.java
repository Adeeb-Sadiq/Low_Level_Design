package DesignPatternExamples.AbstractFactoryExample.CarBrands;

import DesignPatternExamples.FactoryExample.Vehicle;

public class Pagani implements Vehicle {

    @Override
    public void start() {
        System.out.println("Pagani is staring");
    }

    @Override
    public void stop() {
        System.out.println("Pagani is stopping");
    }
}
