package DesignPatternExamples.BuilderExample;

public class Car {
    private String engine;
    private int seats;
    private String colour;
    private boolean sunRoof;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.colour = builder.colour;
        this.sunRoof = builder.sunroof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seats=" + seats +
                ", colour='" + colour + '\'' +
                ", sunRoof=" + sunRoof +
                '}';
    }

    public static class CarBuilder {
        private String engine = "v6";
        private int seats = 5;
        private String colour = "Grey";
        private boolean sunroof = false;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
