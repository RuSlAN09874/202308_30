package org.example.additional_task.task27_09_23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        List<Book> listAvailableBooksByGenre = libraryManager.listAvailableBooksByGenre("Детективы");
        System.out.println("Достоупная книга по жанру Детективы: ");
        for (Book book : listAvailableBooksByGenre) {
            System.out.println(book.getBookTitle());
        }

//        listUserEmailsWithReservedBooks()
        //Добавление книги
        Book newBook = new Book("Name2", "Author2", "Genre2", 1947, true);

        libraryManager.addBookToLibrary(newBook);

        // Удаление книги

        libraryManager.removeBookFromLibrary(newBook);

        LibraryUser user = new LibraryUser(45,"User1","user1@gmail.com",+2424123);

        Book reserveBook = new Book("Books3","Author","Детективы",1948,true);
        System.out.println("Книга зарезервирована: " + reserveBook);
        libraryManager.reserveBook(user,reserveBook);
    }
}
