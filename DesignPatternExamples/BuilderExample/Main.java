package DesignPatternExamples.BuilderExample;

public class Main {
    static void main() {
        Car.CarBuilder builder = new Car.CarBuilder();

        Car c1 = builder.setEngine("v8")
                .setColour("Red")
                .setSeats(4)
                .setSunroof(true)
                .build();

        System.out.println(c1);


        Car c2 = new Car.CarBuilder().setColour("Blue")
                .build();

        System.out.println(c2);
    }
}
