package model;

public class Wheel {
  int width;
  int tireSize;
  int numberOfBolts;

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getTireSize() {
    return tireSize;
  }

  public void setTireSize(int tireSize) {
    this.tireSize = tireSize;
  }

  public int getNumberOfBolts() {
    return numberOfBolts;
  }

  public void setNumberOfBolts(int numberOfBolts) {
    this.numberOfBolts = numberOfBolts;
  }

  public void spin() {
    System.out.println("Spin");
  }

}
