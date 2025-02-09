import java.util.ArrayList;
import java.util.Random;

import model.Car;
import model.CarCatalog;

public class CarExample {

    // 1. Keep track of cars listed for sale
    // 2. Add a new car
    // 3. Remove a car
    // 4. List all cars
    // 5. Search for a car

    public static void main(String[] args) throws Exception {

        // Using CarCatalog

        CarCatalog carsForSale = new CarCatalog();

        carsForSale.newCar("Red", "Toyota", "Camry", 2025);
        carsForSale.newCar("Blue", "Honda", "Accord", 2026);

        Car newestCar = carsForSale.findByYear(2026);
        System.out.println("Car found:");
        System.out.println(newestCar.getModelName() + " " + newestCar.getYear());

        carsForSale.remove(0);

        carsForSale.printAllCars();

        // We dont need the code below - keeping it for reference

        // Car toyota = new Car("Red", "Toyota", "Camry", 2025);
        // Car honda = new Car("Blue", "Honda", "Accord", 2026);

        // // ArrayList (not an array)

        // ArrayList<Car> listedForSale = new ArrayList<Car>();

        // System.out.println("Let's see how many elements are stored in the ArrayList
        // (before adding cars)");
        // System.out.println("List contains " + listedForSale.size() + " cars");

        // // listedForSale.add(toyota);
        // // listedForSale.add(honda);

        // Random r = new Random();

        // int howManyCarsToAdd = 30;

        // // Loop #1
        // for (int index = 0; index < howManyCarsToAdd; index = index + 1) {
        // Car someNewCar = new Car("Red", "Toyota", "Camry", 2015 + r.nextInt(11));

        // listedForSale.add(someNewCar);
        // // System.out.println("Car number " + index + " added");
        // }

        // System.out.println("Let's see how many elements are stored in the ArrayList
        // (after adding cars)");
        // System.out.println("List contains " + listedForSale.size() + " cars");

        // listedForSale.add(honda);

        // // Loop #2
        // for (int index = 0; index < listedForSale.size(); index = index + 1) {
        // Car storedCar = listedForSale.get(index);

        // if (storedCar.getYear() >= 2025 && storedCar.getColor().equals("Red")) {
        // System.out.println("Stored car # " + index + " is a " +
        // storedCar.getModelName() + " from year "
        // + storedCar.getYear());
        // }
        // }

        // loop - for-loop - while-loop

        // if statement (conditional statement)

    }
}
