package com.homework3.utill;

import com.homework3.objects.Student;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.lang.String;
import java.util.stream.Collectors;

//import java.util.*;

public class UtillThreeSet {

    public static TreeSet<Student> generationSet() {
        System.out.println("Set number of objects Students for creating");
        Scanner scanner = new Scanner(System.in);
        int numberOfObjects = scanner.nextInt();
        TreeSet<Student> treeSet = new TreeSet<>();
        TreeSet<Student> returnStudents = new TreeSet<>();
        try {
            File myFile = new File("Students.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            for (int i = 0; i < numberOfObjects; i++) {
                line = reader.readLine();
                Student student = new Student();
                student.setName(line);
                treeSet.add(student);
            }
            returnStudents = createIdRandom(treeSet);

            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return returnStudents;
    }

    public static TreeSet<Student> createIdRandom(TreeSet<Student> stud) {
        int sizeTree = stud.size();
        long random = new Random().nextLong();
        TreeSet<Student> student = new TreeSet<>();
        List<Student> list = new ArrayList<>();
        list = stud.stream().collect(Collectors.toList());
        for (int i = 0; i < sizeTree; i++) {
            list.get(i).setID(random);
            student.add(list.get(i));
        }
        return student;
    }

    public static TreeSet<Student> printAndRemove(TreeSet<Student> student) {
        Student object;
        TreeSet<Student> evenStudent = new TreeSet<>();
        int sizeStudent = student.size();
        for (int i = 1; i < sizeStudent; i++) {
            if (i % 2 != 0) {
                object = student.first();
                student.remove(object);
            } else {
                object = student.first();
                evenStudent.add(object);
                student.remove(object);
            }
        }
        return evenStudent;
    }

    public static void TreePrint(TreeSet<Student> s) {
        List<Student> listStudents;
        listStudents = s.stream().collect(Collectors.toList());
        for (Student studik : listStudents) {
            System.out.println(studik.toString());
        }

    }

    public static String makeRandomStringLine() {
        System.out.println("Set the lenght of the String");
        Scanner scanner = new Scanner(System.in);
        int neededSize = scanner.nextInt();
        String randomStringUtils = new String();
        String generatedString = RandomStringUtils.random(neededSize);
        return generatedString;
    }

}

