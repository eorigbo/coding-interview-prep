package com.problems.interviewcake.code.sorting_searching;

public class BinarySearch_Attempt {
    public static boolean binarySearch(int[] theArray, int target){
        int floor = -1;
        int ceiling = theArray.length;

        while(floor+1 < ceiling){
            int midpoint = ((ceiling - floor)/2) + floor;
            int guessValue = theArray[midpoint];

            if(guessValue == target) return true;

            if(guessValue > target){
                ceiling = midpoint;
            }else{
                floor = midpoint;
            }
        }
        return false;
    }


}
