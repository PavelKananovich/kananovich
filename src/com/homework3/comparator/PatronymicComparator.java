package com.homework3.comparator;

import com.homework3.objects.Book;

import java.util.Comparator;

public class PatronymicComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorPatronymic().compareTo(o2.getAuthorPatronymic());
    }
}
