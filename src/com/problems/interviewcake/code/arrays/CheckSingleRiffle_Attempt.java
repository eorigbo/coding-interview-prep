package com.problems.interviewcake.code.arrays;

public class CheckSingleRiffle_Attempt{

    public static boolean isSingleRiffle( int[] first, int[] second, int[] deck){

        //initialize firstindex and secondindex
        int firstIndex = 0, secondIndex = 0;

        //loop through deck array
        for(int card: deck){
            boolean firstExhausted = firstIndex >= first.length;
            boolean secondExhausted = secondIndex >= second.length;

            if(!firstExhausted && first[firstIndex] == card){
                firstIndex++;
            }else if(!secondExhausted && second[secondIndex] == card){
                secondIndex++;
            }else{
                return false;
            }
        }
        return true;

    }
}
