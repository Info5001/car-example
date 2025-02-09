package model;

import java.util.ArrayList;

public class CarCatalog {
  ArrayList<Car> carList;

  public CarCatalog() {
    carList = new ArrayList<Car>();
  }

  public Car newCar(String c, String mn, String m, int y) {
    Car carToAdd = new Car(c, mn, m, y);
    carList.add(carToAdd);
    return carToAdd;
  }

  public void addExisting(Car c) {
    carList.add(c);
  }

  public void remove(int index) {
    carList.remove(index);
  }

  public Car findByYear(int year) {
    for (Car eachCar : carList) {
      if (eachCar.getYear() == year) {
        return eachCar;
      }
    }
    // If the code got this far, it means no car matching the year was found
    return null;
  }

  public void printAllCars() {
    for (Car eachCar : carList) {
      System.out.println(eachCar.getManufacturer() + " " + eachCar.getModelName() + " - " + eachCar.getYear());
    }
  }

}
