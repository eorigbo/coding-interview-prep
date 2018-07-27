package com.problems.interviewcake.code.sorting_searching;

public class FindIndexOfRotatedArray {
    public static int findIndexOfRotatedArray(String[] words){

        if (words.length <= 1)throw new IllegalArgumentException("The array needs at least 2 elements before it can be rotated.");

        final String firstWord = words[0];

        int floorIndex = 0;
        int ceilingIndex = words.length-1;

        //if ceilingIndex compared to floor index is greater than 0, the entire array is not rotated so return 0
        if(words[ceilingIndex].compareTo(firstWord) >= 0)return 0;

        while(floorIndex < ceilingIndex){
            int guessIndex = floorIndex + ((ceilingIndex - floorIndex)/2);
            //if the guessValue comparison to firstWord is >= 0, then
            //there is no rotation in first half of array
            //check the second half by moving floorIndex to guessIndex
            if(words[guessIndex].compareTo(firstWord) >= 0){
                floorIndex = guessIndex;
            }else{
                ceilingIndex = guessIndex;
            }

            if (floorIndex + 1 == ceilingIndex){
                break;
            }
        }
        return ceilingIndex;
    }
}
