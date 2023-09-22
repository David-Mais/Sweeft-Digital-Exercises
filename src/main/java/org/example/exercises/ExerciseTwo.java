package org.example.exercises;

public class ExerciseTwo {
    public static int minSplit(int amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("numbers below zero is not allowed");
        }
        int numberOfCoins = 0;
        int[] coinTypes = {50, 20, 10, 5, 1};
        for(int coin : coinTypes) {
            while(amount >= coin) {
                amount -= coin;
                numberOfCoins++;
            }
        }
        return numberOfCoins;
    }
}
