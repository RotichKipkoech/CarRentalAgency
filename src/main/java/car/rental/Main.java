package src.main.java.car.rental;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        
        // Create car and customer instances
        Car car1 = new Car("KAB123Z", "Toyota", "Corolla");
        Customer customer1 = new Customer("KR001", "Kennedy Rotich", "0725761234");

        // Add car and customer to the agency
        agency.addCar(car1);
        agency.addCustomer(customer1);

        // Attempt to rent the car
        boolean rentalResult = agency.rentCar("KR001", "KAB123Z");
        if (rentalResult) {
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car rental failed.");
        }

        // Attempt to return the car
        boolean returnResult = agency.returnCar("KAB123Z");
        if (returnResult) {
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car return failed.");
        }
    }
}
