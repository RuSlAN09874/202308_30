package org.example.Task;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("AAAA", "MayBook1", 1980, 90);
        Book book2 = new Book("VVVV", "MayBook2", 1995, 80);
        Book book3 = new Book("TTTT", "MayBook3", 2001, 100);
        LinkedList<Book> books = new LinkedList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        int sumPage = 90;
        books.removeIf(book -> book.getPage() < sumPage);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}



