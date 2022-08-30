package com.homework2.utill;

import com.homework2.mycars.Car;
import com.homework2.service.BrandOfCars;
import java.util.Arrays;
import java.util.Random;

public class UtilClass {
    private static Car[] arrayOfCars;

    public static Car [] generateArray (int lenghtArray){
    arrayOfCars = new Car[lenghtArray];
    for(int i=0;i<lenghtArray;i++) {

        arrayOfCars[i]= new Car();
        arrayOfCars[i].setBrand(BrandOfCars.BRANDOFCARS[i]);
        arrayOfCars[i].setModel(BrandOfCars.MODELOFCARS[i]);
        arrayOfCars[i].setNumberOfGears(setNumberOfGears());
        arrayOfCars[i].setDoors(setNumberOfDoors());
        arrayOfCars[i].setEngineVolume(setEngineVolume());
        arrayOfCars[i].setTypeOfFuel(typeOfFuel());
        arrayOfCars[i].setAutopilot(autopilotSet());

    }
    return arrayOfCars;
    }

    public static int setNumberOfGears () {
        Random random = new Random();
        int randomOfGears;
        return  randomOfGears =  random.nextInt(5);
    }

    public static int setNumberOfDoors() {
        Random random = new Random();
        int randomOfDoors;
        return randomOfDoors = random.nextInt(4);
    }

    public static double setEngineVolume() {
        Random random = new Random();
        double randomOfEngineVolume;
        return randomOfEngineVolume = random.nextDouble()*6+1;
    }

    public static String typeOfFuel() {
        String randomTypeOfFuel;
        String [] firstType = {"petrol","diesel"};
        Random random = new Random();
        int intRandom = random.nextInt(1);
        return randomTypeOfFuel = firstType[intRandom];
    }

    public static boolean autopilotSet() {
        boolean isAutopilot;
        boolean [] booleans = {true,false};
        Random random = new Random();
        int intRandom = random.nextInt(1);
        return isAutopilot = booleans[intRandom];
    }

    public static void printArrayOfCars() {
        for (Car auto: arrayOfCars) {
            System.out.println(auto.toString());
        }
    }
    public static void sortComparable(){
        Arrays.sort(arrayOfCars);
    }

}
