package com.homework2;

import com.homework2.mycars.Car;
import com.homework2.service.CarsActions;
import static com.homework2.utill.UtilClass.*;

public class Main {
    public static void main(String[] args) {
        generateArray(10);
        printArrayOfCars();
        sortComparable();
        System.out.println("****Sorted****");
        printArrayOfCars();
        System.out.println("**** WITH INTERFACE's REFERENSE****");
        CarsActions carSecond = new Car("car","car");
        carSecond.drive();
        carSecond.drift();
        carSecond.increaseSpeed();
        carSecond.stopDrive();
    }}
