package com.homework3.test;

import com.homework3.objects.Student;
import com.homework3.utill.UtillThreeSet;

import java.util.TreeSet;

import static com.homework3.utill.UtillThreeSet.TreePrint;
import static com.homework3.utill.UtillThreeSet.printAndRemove;

public class MainTestThreeSet {
    public static void main(String[] args) {
        // Task 4
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet = UtillThreeSet.generationSet();
        TreePrint(treeSet);
        TreePrint(printAndRemove(treeSet));

        //The mechanism generating random String
        System.out.println(UtillThreeSet.makeRandomStringLine());

    }
}