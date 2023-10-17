package org.example.homeWork.casino;

import java.util.Random;

public class Ruletka {
    private double minBet = 200;

    public boolean play(User user, double betAmount, int userGuess, String color) {
        if (betAmount >= minBet) {
            Random random = new Random();
            int randomNumber = random.nextInt(36) + 1;
            String randomColor = random.nextBoolean() ? "red" : "black";

            if (userGuess == randomNumber && color.equals(randomColor)) {
                user.deposit(betAmount * 8);
            } else {
                user.withdraw(betAmount * 0.08);
            }
            return true;
        } else {
            return false;
        }
    }
}
