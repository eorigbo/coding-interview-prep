package com.problems.interviewcake.code.arrays;

public class CheckSingleRiffle_Attempt{

    public static boolean isSingleRiffle(int[] firstHalf, int[] secondHalf, int[] deck){

        int firstIdx = 0, secondIdx = 0;

        //loop through deck
        for(int card: deck){
            boolean firstExh = firstIdx >= firstHalf.length;
            boolean secondExh = secondIdx >= secondHalf.length;

            if(!firstExh && firstHalf[firstIdx] == card) firstIdx++;

            else if(!secondExh && secondHalf[secondIdx] == card) secondIdx++;

            else return false;
        }

        return true;
    }

}
