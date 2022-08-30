package com.homework2.mycars;

import com.homework2.service.BrandOfCars;
import com.homework2.service.CarsActions;
import java.util.Objects;

public class Car implements CarsActions, BrandOfCars,Comparable<Car>{
    private String brand;
    private String model;
    private String typeOfFuel;
    private double engineVolume;
    private int doors;
    private int numberOfGears;
    private boolean autopilot;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model,
               String typeOfFuel, double engineVolume,
               int doors, int numberOfGears,
               boolean autopilot) {
        this.brand = brand;
        this.model = model;
        this.typeOfFuel = typeOfFuel;
        this.engineVolume = engineVolume;
        this.doors = doors;
        this.numberOfGears = numberOfGears;
        this.autopilot = autopilot;
    }


    public void setBrand(String brand) {this.brand = brand;}

    public void setModel(String model) {
        this.model = model;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setNumberOfGears(int numberOfSeats) {
        this.numberOfGears = numberOfSeats;
    }

    public void setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
    }

    public String getBrand() {return brand;}

    public String getModel() {
        return model;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getDoors() {
        return doors;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0
                && doors == car.doors && numberOfGears == car.numberOfGears
                && autopilot == car.autopilot && brand.equals(car.brand)
                && model.equals(car.model) && typeOfFuel.equals(car.typeOfFuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model,
                            typeOfFuel, engineVolume,
                            doors, numberOfGears, autopilot);
    }

    @Override
    public String toString() {
        return "myGarage.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", typeOfFuel='" + typeOfFuel + '\'' +
                ", engineVolume=" + engineVolume +
                ", doors=" + doors +
                ", numberOfGears=" + numberOfGears +
                ", autopilot=" + autopilot +
                '}';
    }

    @Override
    public void drive() {
        System.out.println(Car.this.brand + " The car starts moving");
    }

    @Override
    public void stopDrive() {
        System.out.println(Car.this.brand + " The car stops moving");
    }

    @Override
    public void drift() {
        System.out.println(Car.this.brand + " The car goes to drift");
    }

    @Override
    public void increaseSpeed() {
        System.out.println(Car.this.brand + " The car begins increase speed");
    }

    @Override
    public int compareTo(Car obj) {
        return  (this.numberOfGears- obj.numberOfGears);
    }
}
