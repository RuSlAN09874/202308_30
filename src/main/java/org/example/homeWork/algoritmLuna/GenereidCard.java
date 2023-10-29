package org.example.homeWork.algoritmLuna;

import java.time.LocalDate;
import java.util.Random;

public class GenereidCard {
    private static final int cardNum = 16;
    private static final int cvvCard = 3;

    public static String getRandomCard() {
        StringBuilder cardNumber = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < cardNum; i++) {
            cardNumber.append(random.nextInt(10));
        }
        StringBuilder cvv = new StringBuilder();
        for (int i = 0; i < cvvCard; i++) {
            cvv.append(random.nextInt(10));
        }
        LocalDate expirationDate = LocalDate.now().plusYears(4);

        return cardNumber.toString() + cvv.toString() + " "  + expirationDate;
    }


    public static boolean isValidCard(String value) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            int digit = Character.getNumericValue(value.charAt(i));
            if (i % 2 == 0) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
        }
        return sum % 10 == 0;
    }


}
