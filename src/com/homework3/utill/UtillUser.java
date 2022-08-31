package com.homework3.utill;


import com.homework3.objects.User;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class UtillUser {
    static int recursionVariable = 0;

    public static List<User> userGeneration() {

        System.out.println("Set number of objects User for creating");
        Scanner scanner = new Scanner(System.in);
        int numberOfObjects = scanner.nextInt();
        List<User> list = new ArrayList<>();
        List<User> frendsList = new ArrayList<>();
        try {
            File myFile = new File("Friends.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            String[] splitLine = null;
            for (int i = 0; i < numberOfObjects; i++) {
                line = reader.readLine();
                splitLine = line.split(" ");
                User user = new User();
                user.setName(splitLine[1]);
                user.setSurname(splitLine[0]);
                user.setId(makeIdRandom());
                user.setFriends(frendsList);
                list.add(user);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static long makeIdRandom() {
        Random random = new Random();
        long lng = 3463443L;
        int intRandom = random.nextInt(101);
        long result = lng * intRandom;
        return result;
    }

    public static int listFriendsGeneration(List<User> listGeneration) {
        System.out.println("which number of friends need set user");
        Scanner scanner = new Scanner(System.in);
        int numberOfUser = scanner.nextInt();
        for (int i = 0; i < numberOfUser; i++) {
            if (i == 0) {
                listGeneration.get(i).setFriends(setFriendsForFirstUser(listGeneration));
                System.out.println(listGeneration.get(i).toString());
            } else {
                int multiplier = 4;
                int skipMultiplier = 4 * i;
                listGeneration.get(i).setFriends(setFriendsForOtherUsers(listGeneration, skipMultiplier));
            }

        }
        return numberOfUser;

    }

    public static List<User> setFriendsForFirstUser(List<User> listGeneration) {
        List<User> list = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            list.add(listGeneration.get(i));
        }
        return list;
    }

    public static List<User> setFriendsForOtherUsers(List<User> listGeneration, int a) {
        int startIncrmt = a;
        int finishIncrmt = startIncrmt + 3;
        List<User> listAnother = new ArrayList<>();
        for (int i = startIncrmt; i < finishIncrmt; i++) {
            listAnother.add(listGeneration.get(i));
        }
        return listAnother;
    }


    public static void recursionMethod(List<User> list) {
        List<User> userFriends = new ArrayList<>();
        List<String> listOfNames = new ArrayList<>();
        int size = list.size();
        int sizeArrayFriends;
        for (int i = 0; i < size; i++) {
            sizeArrayFriends = list.get(i).getFriends().size();
            listOfNames.add(list.get(i).getName());
        }
        System.out.println("Friends for : ");
        for (String strng : listOfNames) {
            System.out.print(" " + strng);
        }
        System.out.println(" is : ");
        List<String> listOfFriends = new ArrayList<>();
        for (User user : list) {
            List<User> friends = user.getFriends();
            int friendsSize = friends.size();
            for (int i = 0; i < friendsSize; i++) {
                listOfFriends.add(friends.get(i).getName());
                userFriends.add(friends.get(i));
            }
            for (String frends : listOfFriends) {
                System.out.println(" : " + frends);
            }
        }
        recursionVariable++;
        if (recursionVariable < 5) {
            recursionMethod(userFriends);
        }

    }

    public static void printMethod(List<User> listUser) {
        for (User user : listUser) {
            System.out.println(user.toString());
        }
    }

    public static List<User> takeWithNotNullFriends(List<User> listUser, int numberOfUsers) {
        List<User> listSettedFriends = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            listSettedFriends.add(listUser.get(i));
        }
        return listSettedFriends;
    }
}


