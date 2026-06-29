package DesignPatternExamples.AbstractFactoryExample.CarBrands;


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
