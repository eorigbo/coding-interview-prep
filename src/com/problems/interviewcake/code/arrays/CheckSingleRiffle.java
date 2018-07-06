package com.problems.interviewcake.code.arrays;

public class CheckSingleRiffle {

    public static boolean isSingleRiffle(int[] firstHalf, int[] secondHalf, int[] shuffleDeck){
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;
        for (int currentCard: shuffleDeck){
            boolean isFirstExhausted =  firstHalfIndex >= firstHalf.length;
            boolean isSecondExhausted = secondHalfIndex >= secondHalf.length;

            if (!isFirstExhausted && currentCard == firstHalf[firstHalfIndex]){
                firstHalfIndex++;
            }else if (!isSecondExhausted && currentCard == secondHalf[secondHalfIndex]){
                secondHalfIndex++;
            }else{
                return false;
            }
        }
        return true;
    }
}
