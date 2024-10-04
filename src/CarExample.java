import java.util.*;
import model.Car;
import model.ParkingLot;

public class CarExample {

    public static void main(String[] args) throws Exception {

        ParkingLot northeasternParking = new ParkingLot();
        northeasternParking.setCapacity(100);

        // Car #1
        Car hondaAccord = new Car();
        hondaAccord.setColor("red");
        hondaAccord.setModelName("Accord");
        // Car #2
        Car toyotaCorolla = new Car();
        toyotaCorolla.setColor("blue");
        toyotaCorolla.setModelName("Corolla");

        // Car #3
        Car bmw = new Car();
        bmw.setColor("yellow");
        bmw.setModelName("3 Series");

        northeasternParking.addACar(hondaAccord);
        northeasternParking.addACar(bmw);
        northeasternParking.addACar(toyotaCorolla);

        // northeasternParking.removeACar(0);

        Car carFound = northeasternParking.findCarByColor("red");
        if (carFound != null) {
            System.out.println("We found " + carFound.getModelName() + " and it is " + carFound.getColor());
        } else {
            System.out.println("Car not found");
        }

        // northeasternParking.printNumberOfCars();
        // northeasternParking.howManyEmptySpots();

        // Parking Lot should asnwer these questions
        // How many cars are on the parking lot? +
        // Search for a car +
        // Add car +
        // Remove +
        // Method -> isEmpty()? +
        // Capacity?? +
        //

    }
}
