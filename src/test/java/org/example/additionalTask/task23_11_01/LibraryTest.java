package org.example.additionalTask.task23_11_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class LibraryTest {
    private Library library;
    private Author author;
    private Book book;

    @BeforeEach
    void setUp() {
        library = new Library();
        author = new Author("Author1", 1984);
        book = new Book("Title1", author, "12345-AF16776", 1);
        library.addBook(book);
        library.removeBook(book);
    }

    @Test
    void addBookTest() {
        library.addBook(book);
        Assertions.assertTrue(library.getAllAuthors().contains(author));
        Assertions.assertEquals(book, library.findBookByISBN("12345-AF16776"));
    }

    @Test
    void addNullBookTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
    }

    @Test
    void removeBookTest() {
        library.addBook(book);
        library.removeBook(book);
        Assertions.assertNull(library.findBookByISBN("12345-AF16776"));
    }

    @Test
    void removeNullBookTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> library.removeBook(null));
    }

    @Test
    void getBooksByAuthorTest() {
        library.addBook(book);
        List<Book> bookByAuthor = library.getBooksByAuthor(author);
        Assertions.assertEquals(1, bookByAuthor.size());
        Assertions.assertEquals(book, bookByAuthor.get(0));
    }

    @Test
    void addCopiesTest() {
        library.addBook(book);
        library.addCopies(book, 3);
        Assertions.assertEquals(4, book.getCopies());
    }

    @Test
    void lendBookTest() {
        library.addBook(book);
        library.lendBook(book);
        Assertions.assertEquals(0,book.getCopies());
    }

    @Test
    void returnBookTest(){
        library.addBook(book);
        library.lendBook(book);
        library.returnBook(book);
        Assertions.assertEquals(1,book.getCopies());
    }
}