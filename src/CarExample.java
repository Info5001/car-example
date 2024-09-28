import model.Car;
import model.Wheel;

public class CarExample {

    // + 1. Prepare this project and create some folder(s) and files (empty). Also
    // rename the main file.
    // + (almost) 2. Implement Car class. maybe some other classes.
    // 3. Use the Car class and create instances of cars.
    // 4. Implemented drive() method inside Car class that calls methods from other
    // classes

    public static void main(String[] args) throws Exception {

        // create a new instance of a car (Honda Accord)
        Car hondaAccord = new Car(); // red

        // We made Honda red
        hondaAccord.setColor("red");
        hondaAccord.setManufacturer("Honda");
        hondaAccord.setModelName("Accord");
        hondaAccord.printColor();

        // Add wheels to my Honda
        Wheel wheelOne = new Wheel();
        Wheel wheelTwo = new Wheel();
        Wheel wheelThree = new Wheel();
        Wheel fourthWheel = new Wheel();
        wheelOne.setNumberOfBolts(5);
        wheelTwo.setNumberOfBolts(5);

        hondaAccord.setFrontLeft(wheelOne);
        hondaAccord.setFrontRight(wheelTwo);
        hondaAccord.setRearLeft(fourthWheel);
        hondaAccord.setRearRight(wheelThree);

        hondaAccord.drive();
        // hondaAccord.makeATurn("left");

        // Car bmw = new Car(); // black
        // bmw.setColor("Black");
        // bmw.setModelName("740");
        // bmw.setManufacturer("BMW");
        // bmw.carryItems();

        // Car toyota = new Car();
        // toyota.makeATurn("right");

    }
}
