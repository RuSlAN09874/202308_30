package org.example.summary_HW.task23_11_3;

public class Main {
    public static class WrongLoginException extends Exception {
        public WrongLoginException(String message) {
            super(message);
        }
    }

    public static class WrongPasswordException extends Exception {
        public WrongPasswordException(String messege) {
            super(messege);
        }

    }

    public static void main(String[] args) {
        try {
            System.out.println(checkLoginAndPassword("Jhon", "123", "123"));
            System.out.println(checkLoginAndPassword("Jhon", "123", "1234"));
            System.out.println(checkLoginAndPassword("Jhon", "123@", "123@"));
            System.out.println(checkLoginAndPassword("Jhon@", "123", "123"));

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }

        if (!login.matches("[A-Za-z0-9_]+") || login.length() >= 20) {
            throw new WrongLoginException("Incorrect login");
        }
        return true;
    }


}


