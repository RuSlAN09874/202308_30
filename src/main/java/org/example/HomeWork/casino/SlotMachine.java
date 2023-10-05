package org.example.HomeWork.casino;

import java.util.Random;

class SlotMachine {
    private double minBet = 200;

    public boolean play(User user, double betAmount, int userGuess) {
        if (betAmount >= minBet) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            if (userGuess == randomNumber) {
                user.deposit(betAmount * 50);
            } else {
                user.withdraw(betAmount * 0.05);
            }
            return true;
        } else {
            return false;
        }
    }
}

