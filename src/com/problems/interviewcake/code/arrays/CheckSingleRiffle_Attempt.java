package com.problems.interviewcake.code.arrays;

public class CheckSingleRiffle_Attempt{

    public static boolean isSingleRiffle(int[] firstHalf, int[] secondHalf, int[] shuffledDeck){

        //create indexes for both halves
        int firstHalfIndex = 0, secondHalfIndex = 0;

        boolean isFirstExhausted, isSecondExhausted;

        for(int currentCard: shuffledDeck){
            isFirstExhausted = firstHalfIndex >= firstHalf.length;
            isSecondExhausted = secondHalfIndex >= secondHalf.length;

            //increment first half index if first half is not exhausted and array index equal to shuffle deck index
            if(!isFirstExhausted && firstHalf[firstHalfIndex] == currentCard){
                firstHalfIndex++;
                //increment second half just like first
            }else if(!isSecondExhausted && secondHalf[secondHalfIndex] == currentCard){
                secondHalfIndex++;
                //else return false as the card wasn't found
            }else{
                return false;
            }

        }

        //return true at end of loop as all cards have been found
        return true;

    }
}
