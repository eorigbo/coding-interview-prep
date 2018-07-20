package com.problems.interviewcake.code.sorting_searching;

public class BinarySearch {
    public static boolean binarySearch(int [] sortedArray, int target){

        int floorIndex = -1;
        int ceilingIndex = sortedArray.length;

        while(floorIndex + 1  < ceilingIndex){
            int halfDistance = (ceilingIndex - floorIndex)/2;
            int guessIndex = floorIndex + halfDistance;
            int guessValue = sortedArray[guessIndex];

            if(guessValue == target){
                return true;
            }

            if (guessValue > target){
                ceilingIndex = guessIndex;
            }else{
                floorIndex = guessIndex;
            }

        }

        return false;
    }

}
