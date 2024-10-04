package model;

import java.util.*;

public class ParkingLot {
  ArrayList<Car> carsInTheParkingLot;
  int capacity;

  public ParkingLot() { // Constructor
    carsInTheParkingLot = new ArrayList<Car>();
    capacity = 0;
  }

  public void setCapacity(int c) {
    capacity = c;
  }

  public void addACar(Car car) {
    carsInTheParkingLot.add(car);
  }

  public void removeACar(int index) {
    carsInTheParkingLot.remove(index);
  }

  public boolean isEmpty() {
    return (carsInTheParkingLot.size() == 0);
  }

  public void howManyEmptySpots() {
    System.out.println("There are " + (capacity - carsInTheParkingLot.size()) + " empty spots");
    ;
  }

  public Car findCarByColor(String color) {
    for (Car eachCar : carsInTheParkingLot) {
      if (eachCar.getColor() == color) {
        return eachCar;
      }
    }
    return null;

  }

  public void printNumberOfCars() {
    if (isEmpty()) {
      System.out.println("The parking lot is empty");
    } else {
      System.out.println("There are " + carsInTheParkingLot.size() + " in the parking lot");
    }
  }

}
