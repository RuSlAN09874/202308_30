package org.example.additionalTask.task23_09_27;

import java.util.*;

public class LibraryUser {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private List<Book> userBooksBorrowed;
    private Set<Book> userBooksReserved;

    public LibraryUser(String userName, String userEmail, String userPhone) {
        Random random = new Random();
        this.userId = random.nextInt(1000);
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userBooksBorrowed = new ArrayList<>();
        this.userBooksReserved = new HashSet<>();
    }


    public List<Book> getUserBooksBorrowed() {
        return userBooksBorrowed;
    }

    public void setUserBooksBorrowed(List<Book> userBooksBorrowed) {
        this.userBooksBorrowed = userBooksBorrowed;
    }

    public Set<Book> getUserBooksReserved() {
        return userBooksReserved;
    }

    public void setUserBooksReserved(Set<Book> userBooksReserved) {
        this.userBooksReserved = userBooksReserved;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
