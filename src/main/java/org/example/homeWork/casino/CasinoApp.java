package org.example.homeWork.casino;

import java.util.Scanner;

public class CasinoApp {
    public static void main(String[] args) {
        Casino casino = new Casino();
        Scanner scanner = new Scanner(System.in);

        User currentUser = null;

        while (true) {
            System.out.println("Добро пожаловать в онлайн казино!");

            if (currentUser == null) {
                System.out.println("1. Регистрация");
                System.out.println("2. Вход");
                System.out.println("3. Выход");
                System.out.print("Выберите действие: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print("Введите имя пользователя: ");
                    String username = scanner.next();
                    System.out.print("Введите пароль: ");
                    String password = scanner.next();

                    boolean registered = casino.register(username, password);
                    if (registered) {
                        System.out.println("Регистрация успешна!");
                    } else {
                        System.out.println("Пользователь с таким именем уже существует.");
                    }
                } else if (choice == 2) {
                    System.out.print("Введите имя пользователя: ");
                    String username = scanner.next();
                    System.out.print("Введите пароль: ");
                    String password = scanner.next();

                    currentUser = casino.login(username, password);
                    if (currentUser != null) {
                        System.out.println("Аутентификация успешна. Ваш баланс: $" + currentUser.getBalance());
                    } else {
                        System.out.println("Неверное имя пользователя или пароль.");
                    }
                } else if (choice == 3) {
                    System.out.println("До свидания!");
                    break;
                }
            } else {
                System.out.println("1. Играть в автоматы");
                System.out.println("2. Играть в рулетку");
                System.out.println("3. Просмотр баланса");
                System.out.println("4. Пополнить баланс");
                System.out.println("5. Выйти из аккаунта");
                System.out.print("Выберите действие: ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                } else if (choice == 2) {
                } else if (choice == 3) {
                    System.out.println("Ваш баланс: $" + currentUser.getBalance());
                } else if (choice == 4) {
                    System.out.print("Введите сумму для пополнения: ");
                    double depositAmount = scanner.nextDouble();
                    boolean deposited = currentUser.deposit(depositAmount);
                    if (deposited) {
                        System.out.println("Баланс успешно пополнен. Новый баланс: $" + currentUser.getBalance());
                    } else {
                        System.out.println("Минимальная сумма для пополнения - $100.");
                    }
                } else if (choice == 5) {
                    currentUser = null;
                    System.out.println("Выход из аккаунта.");
                }
            }
        }
    }
}
