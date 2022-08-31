package com.homework3.objects;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparator {
    private String commonString;
    private String authorPatronymic;
    private String authorName;
    private String authorSurname;
    private String bookTitle;

    public Book() {
    }

    public Book(String commonString, String authorPatronymic, String authorName, String authorSurname, String bookTitle) {
        this.commonString = commonString;
        this.authorPatronymic = authorPatronymic;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.bookTitle = bookTitle;
    }

    public String getCommonString() {
        return commonString;
    }

    public void setCommonString(String commonString) {
        this.commonString = commonString;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return commonString.equals(book.commonString) && authorPatronymic.equals(book.authorPatronymic) && authorName.equals(book.authorName) && authorSurname.equals(book.authorSurname) && bookTitle.equals(book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonString, authorPatronymic, authorName, authorSurname, bookTitle);
    }

    @Override
    public String toString() {
        return "Book{" +
                "commonString='" + commonString + '\'' +
                ", authorPatronymic='" + authorPatronymic + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }

}