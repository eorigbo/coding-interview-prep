package com.problems.interviewcake.code.arrays;

public class CheckSingleRiffle {

    public static boolean isSingleRiffle(int[] firstHalf, int[] secondHalf, int[] shuffleDeck){
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;
        for (int currentCard: shuffleDeck){
            boolean isFirstExhausted =  firstHalfIndex >= firstHalf.length;
            boolean isSecondExhausted = secondHalfIndex >= secondHalf.length;
            //check if first half is not exhausted, and if it contains the current card
            if (!isFirstExhausted && currentCard == firstHalf[firstHalfIndex]){
                firstHalfIndex++;
            //check if second half is not exhausted, and if it contains teh current card
            }else if (!isSecondExhausted && currentCard == secondHalf[secondHalfIndex]){
                secondHalfIndex++;
            }else{
                return false; //if none of the cards contain the current card, then the shuffled deck is not a riffle
            }
        }
        return true; //all the cards are found, the shuffled deck is a riffle
    }
}
