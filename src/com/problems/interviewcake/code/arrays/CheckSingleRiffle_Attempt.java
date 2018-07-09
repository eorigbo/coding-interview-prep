package com.problems.interviewcake.code.arrays;

public class CheckSingleRiffle_Attempt{

    public static boolean isSingleRiffle(int[] firstHalf, int[] secondHalf, int[] shuffleDeck){

        //create indexes for firstHalf and secondHalf
        int firstHalfIndex = 0;
        int secondHalfIndex = 0;

        //loop through shuffleDeck
        for(int currentCard: shuffleDeck){

            //create isFirstExhausted & isSecondExhausted variables
            boolean isFirstExhausted = firstHalfIndex >= firstHalf.length;
            boolean isSecondExhausted = secondHalfIndex >= secondHalf.length;

            //increment first is first is not exhausted and is equal to shuffleDeck
            if(!isFirstExhausted && firstHalf[firstHalfIndex] == currentCard){
                firstHalfIndex++;
            }else if(!isSecondExhausted && secondHalf[secondHalfIndex] == currentCard){
                secondHalfIndex++;
            }else{
                return false;
            }

        }

        return true;

    }
}
