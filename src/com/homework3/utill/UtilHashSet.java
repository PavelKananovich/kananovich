package com.homework3.utill;


import com.homework3.objects.Book;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilHashSet {

    public static void printHashSetBook(HashSet<Book> hashSet) {
        for (Book book : hashSet) {
            System.out.println(book.toString());
        }
    }

    public static HashSet<Book> addRepeatElements() {
        UtilCollection utillRepeat = new UtilCollection();
        HashSet<Book> hashSetRepeat = utillRepeat.generationMethod(new HashSet<>());
        Stream<Book> stream = hashSetRepeat.stream();
        Book book = stream.findAny().get();
        for (int i = 0; i < 6; i++) {
            hashSetRepeat.add(book);
        }
        return hashSetRepeat;
    }

    public static HashSet<Book> titleWithVowel(HashSet<Book> set) {
        HashSet<Book> setWithVowelTitle = new HashSet<>();
        Stream<Book> stream = set.stream();
        List<Book> listStream;
        listStream = stream.collect(Collectors.toList());
        String title = "";
        String[] splitTitle = null;
        String[] Albhabet = {"А", "E", "Ë", "И", "О", "У", "Ы", "Э", "Ю", "Я"};
        int sizeSet = listStream.size();
        for (int i = 0; i < sizeSet; i++) {
            title = listStream.get(i).getBookTitle();
            splitTitle = title.split("");
            for (String string : Albhabet) {
                if (string.equals(splitTitle[1])) {
                    setWithVowelTitle.add(listStream.get(i));
                }
            }

        }
        return setWithVowelTitle;
    }

    public static void hashSetStream(HashSet<Book> hashSet) {
        hashSet.stream()
                .peek(System.out::print)
                .forEach(s -> System.out.println(" " + s.hashCode()));
    }

}
