package com.homework3.test;

import com.homework3.objects.Book;
import com.homework3.utill.UtilCollection;
import java.util.LinkedList;

import static com.homework3.utill.UtilCollection.printLinked;


public class MainTestLinkedLIst {
    public static void main(String[] args) {

        UtilCollection utill = new UtilCollection();
        //1 task

        System.out.println("Create LinkedList with n elements");
        LinkedList<Book> linkedBooks = utill.generationMethod(new LinkedList<Book>());

        printLinked(linkedBooks);
        linkedBooks.remove(6);
        System.out.println("After devided the book #7");

        printLinked(linkedBooks);
    }
}
