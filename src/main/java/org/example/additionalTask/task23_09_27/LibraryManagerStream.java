package org.example.additionalTask.task23_09_27;

import java.util.List;
import java.util.stream.Collectors;

public class LibraryManagerStream {
    private List<Book> books;

    public LibraryManagerStream(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getBookAutgorBay(String author) {
        return books.stream()
                .filter(book -> book.getBookAuthor().equals(author))
                .collect(Collectors.toList());
    }
    public List<Book> getBookByTitle(String title){
        return books.stream()
                .filter(book -> book.getBookTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }
    public List<Book> getBooksPublishAfter(int year){
        return books.stream()
                .filter(book -> book.getBookYear() > year)
                .collect(Collectors.toList());
    }
    public List<Book> getBooksPublishBefor(int year){
        return books.stream()
                .filter(book -> book.getBookYear() < year)
                .collect(Collectors.toList());
    }

}
