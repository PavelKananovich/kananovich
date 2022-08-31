package com.homework3.test;

import com.homework3.comparator.NameComparator;
import com.homework3.utill.UtilCollection;
import com.homework3.utill.UtilHashSet;
import com.homework3.comparator.PatronymicComparator;
import com.homework3.comparator.SurnameComparator;
import com.homework3.objects.Book;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

import static com.homework3.utill.UtilCollection.printLinked;
import static com.homework3.utill.UtilHashSet.printHashSetBook;

public class MainTestHashSet {
    public static void main(String[] args) {
        //2 task
        UtilCollection util = new UtilCollection();
        System.out.println("Create HashSet with n element");
        HashSet<Book> hashSetBook = util.generationMethod(new HashSet<Book>());
        // Desplay on the screen the HashSet was generated
        printHashSetBook(hashSetBook);
        // try to add in HashSet similar elements with addRepeatElements() method
        HashSet<Book> hashSet = UtilHashSet.addRepeatElements();
        // printing after addRepeatElements() method
        printHashSetBook(hashSet);
        System.out.println("THE titleWithVowel METHOD");
        UtilHashSet utilHashSet = new UtilHashSet();
        HashSet<Book> hashSetWithVowel;
        hashSetWithVowel = utilHashSet.titleWithVowel(hashSetBook);
        printHashSetBook(hashSetWithVowel);


        //3 task
        System.out.println("Create List ant sort it with name, patronymic , surname");
        LinkedList<Book> linkedSortedList = util.generationMethod(new LinkedList<Book>());
        printLinked(linkedSortedList);
        Collections.sort(linkedSortedList, new NameComparator());
        System.out.println("After sort method with name");
        printLinked(linkedSortedList);
        Collections.sort(linkedSortedList, new PatronymicComparator());
        System.out.println("After sort method with patronymic");
        printLinked(linkedSortedList);
        Collections.sort(linkedSortedList, new SurnameComparator());
        System.out.println("After sort method with surname");
        printLinked(linkedSortedList);

    }
}
