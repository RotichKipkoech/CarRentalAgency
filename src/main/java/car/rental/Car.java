package src.main.java.car.rental;

public class Car {
    private String licensePlate;
    private String make;
    private String model;

    public Car(String licensePlate, String make, String model) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
               "licensePlate='" + licensePlate + '\'' +
               ", make='" + make + '\'' +
               ", model='" + model + '\'' +
               '}';
    }
}
