package org.example.additionalTask.task23_09_27;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        //Добавление книги в библиотеку
        Book book1 = new Book("Name1", "Author1", "Genr1", 2005, true);
        Book book2 = new Book("Name2", "Author2", "Genr2", 2010, true);

        //Регистрация пользователей
        LibraryUser user1 = new LibraryUser("user1", "user@gmx.com", "212312331");
        LibraryUser user2 = new LibraryUser("user2", "user2@gmx.com", "145234212");


        Set<String> userEmails = libraryManager.listUserEmailsWithReservedBooks();
        System.out.println("Пользователи с зарезервированными книгами:");
        for (String email : userEmails) {
            System.out.println("Email пользователя: " + email);
        }

        libraryManager.borrowBook(user1, book1);
        libraryManager.reserveBook(user2, book2);

        System.out.println("Книга взята в аренду:");
        System.out.println("Книга: " + book1.getBookTitle());
        System.out.println("Пользователь: " + user1.getUserName());


        System.out.println("Книга зарезервирована:");
        System.out.println("Книга: " + book2.getBookTitle());
        System.out.println("Пользователь: " + user2.getUserName());

        libraryManager.removeBookFromLibrary(book2);
        libraryManager.returnBook(user1, book1);

        System.out.println("Книга взята в аренду:");
        System.out.println("Книга: " + book1.getBookTitle());
        System.out.println("Пользователь: " + user1.getUserName());

        System.out.println("Книга зарезервирована:");
        System.out.println("Книга: " + book2.getBookTitle());
        System.out.println("Пользователь: " + user2.getUserName());

        libraryManager.removeBookFromLibrary(book2);
        libraryManager.returnBook(user1, book1);


    }
}