package org.example.homeWork.algoritmLuna;


import static org.example.homeWork.algoritmLuna.GenereidCard.isValidCard;

public class AlgoritmLuna {
    public static void main(String[] args) {
        GenereidCard genereidCard = new GenereidCard();
        String getCard = genereidCard.getRandomCard();
        System.out.println("Carta: " + getCard);
        boolean validCard = isValidCard(getCard);
        System.out.println(validCard);

    }
}