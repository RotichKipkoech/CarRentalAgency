package src.main.java.car.rental;

import java.util.HashMap;
import java.util.Map;

public class RentalAgency {
    private Map<String, Car> cars = new HashMap<>();
    private Map<String, Customer> customers = new HashMap<>();
    private Map<Car, Customer> rentals = new HashMap<>();

    // Add a car to the agency
    public void addCar(Car car) {
        cars.put(car.getLicensePlate(), car);
    }

    // Add a customer to the agency
    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    // Rent a car to a customer
    public boolean rentCar(String customerId, String licensePlate) {
        Car car = cars.get(licensePlate);
        Customer customer = customers.get(customerId);
        if (car != null && customer != null && !rentals.containsKey(car)) {
            rentals.put(car, customer);
            return true;
        }
        return false;
    }

    // Return a car to the agency
    public boolean returnCar(String licensePlate) {
        Car car = cars.get(licensePlate);
        if (car != null && rentals.containsKey(car)) {
            rentals.remove(car);
            return true;
        }
        return false;
    }
}
