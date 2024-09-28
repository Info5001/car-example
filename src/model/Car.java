package model;

public class Car {
  String color;
  String manufacturer;
  String modelName;
  int year;

  Engine engine;
  Wheel frontRight;
  Wheel frontLeft;
  Wheel rearRight;
  Wheel rearLeft;

  Logo logo;

  Headlight leftHeadlight;
  Headlight rightHeadlight;

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Wheel getFrontRight() {
    return frontRight;
  }

  public void setFrontRight(Wheel frontRight) {
    this.frontRight = frontRight;
  }

  public Wheel getFrontLeft() {
    return frontLeft;
  }

  public void setFrontLeft(Wheel frontLeft) {
    this.frontLeft = frontLeft;
  }

  public Wheel getRearRight() {
    return rearRight;
  }

  public void setRearRight(Wheel rearRight) {
    this.rearRight = rearRight;
  }

  public Wheel getRearLeft() {
    return rearLeft;
  }

  public void setRearLeft(Wheel rearLeft) {
    this.rearLeft = rearLeft;
  }

  public Logo getLogo() {
    return logo;
  }

  public void setLogo(Logo logo) {
    this.logo = logo;
  }

  public Headlight getLeftHeadlight() {
    return leftHeadlight;
  }

  public void setLeftHeadlight(Headlight leftHeadlight) {
    this.leftHeadlight = leftHeadlight;
  }

  public Headlight getRightHeadlight() {
    return rightHeadlight;
  }

  public void setRightHeadlight(Headlight rightHeadlight) {
    this.rightHeadlight = rightHeadlight;
  }

  public void drive() {
    System.out.println("Im driving...");
    if (frontLeft != null) {
      frontLeft.spin();
    }
    if (frontRight != null) {
      frontRight.spin();
    }
    if (rearLeft != null) {
      rearLeft.spin();
    }
    if (rearRight != null) {
      rearRight.spin();
    }

  }

  public void makeATurn(String leftOrRight) {
    if (leftOrRight.equals("left"))
      System.out.println("Im turning left...");
    else if (leftOrRight.equals("right"))
      System.out.println("Im turning right...");
  }

  public void carryItems() {
    System.out.println("Im carring items...");
  }

  public void setColor(String c) {
    // we take the value c and set color to c;
    color = c;
  }

  public String getColor() {
    return color;
  }

  public void printColor() {
    System.out.println("The color of " + manufacturer + " " + modelName + " is " + color);
  }

}
