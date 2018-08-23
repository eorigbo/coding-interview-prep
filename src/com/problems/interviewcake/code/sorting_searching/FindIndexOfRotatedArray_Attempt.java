package com.problems.interviewcake.code.sorting_searching;

public class FindIndexOfRotatedArray_Attempt {

    public static int findIndexOfRotatedArray(String[] theArray){
        //initialize floor and firstword as 0, ceiling as arraylength - 1 (TEST)
        if(theArray.length < 2) throw new IllegalArgumentException("At least two strings are required for rotation.");

        int floor = 0, ceiling = theArray.length - 1;
        String firstWord = theArray[0];

        //if the last string compared to the first is >= 0, or array has only one string return index 0
        if(theArray[theArray.length-1].compareTo(firstWord) >= 0) return 0;

        //while floor < ceiling
        while(floor < ceiling){
            //calculate midpoint and compare string at midpoint to firstword
            int midpoint = ((ceiling - floor)/2) + floor;

            //if >= 0, we are fine to that point so move floor to midpoint, else move ceiling
            if(theArray[midpoint].compareTo(firstWord) >= 0){
                floor = midpoint;
            }else{
                ceiling = midpoint;
            }
            if(floor + 1 == ceiling) break;
        }

        return ceiling;
    }
}
