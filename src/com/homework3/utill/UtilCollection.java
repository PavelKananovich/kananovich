package com.homework3.utill;

import com.homework3.objects.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class UtilCollection {

    public <T extends Collection> T generationMethod(T param) {

        System.out.println("Set number of objects Book for creating");
        Scanner scanner = new Scanner(System.in);
        int numberOfObjects = scanner.nextInt();
        try {
            File myFile = new File("MyText.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            String[] splitLine;
            for (int i = 0; i < numberOfObjects; i++) {
                line = reader.readLine();
                splitLine = line.split(" ");
                Book book = new Book();
                book.setCommonString(line);
                book.setAuthorName(splitLine[0]);
                book.setAuthorPatronymic(splitLine[1]);
                book.setAuthorSurname(splitLine[2]);
                book.setBookTitle(joinBookTittle(splitLine));
                param.add(book);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return param;
    }

    public static String joinBookTittle(String[] editionLine) {
        String result = "";
        for (int i = 3; i < editionLine.length; i++) {
            String title = editionLine[i];
            if (i != editionLine.length - 1) {
                result += title + " ";
            } else result += title;
        }
        return result;
    }

    public static void printLinked(LinkedList<Book> list) {
        for (Book book : list) {
            System.out.println(book.toString());
        }
    }

}



