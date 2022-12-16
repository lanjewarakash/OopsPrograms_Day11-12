package com.blz;

import java.util.Random;

public class DeckOfCards {
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] cards = new String[4][13];
    Random random = new Random();

    public void getCardCombination() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[i][j] = suits[i] + "  " + ranks[j];
            }
        }
    }

    public void shuffleCard() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                int a = random.nextInt(i + 1);
                int b = random.nextInt(j + 1);
                String temp = cards[i][j];
                cards[i][j] = cards[a][b];
                cards[a][b] = temp;
            }
        }
    }

    public void distribute() {
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            System.out.println("Cards Received By Player " + (i + 1) + " are.....");
            for (int j = 0; j < 9; j++) {
                System.out.println("  " + cards[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        DeckOfCards obj = new DeckOfCards();
        obj.getCardCombination();
        obj.shuffleCard();
        obj.distribute();
    }
}