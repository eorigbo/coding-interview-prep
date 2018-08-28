package com.problems.interviewcake.code.sorting_searching;

public class FindIndexOfRotatedArray_Attempt {

    public static int findIndexOfRotatedArray(String[] inputString){
        if(inputString.length < 2) throw new IllegalArgumentException("At least two strings are needed to rotate array.");

        int floor = 0;
        int ceiling = inputString.length - 1;

        String firstWord = inputString[0];

        if(inputString[ceiling].compareTo(firstWord) >= 0) return 0;

        while(floor < ceiling){
            int midpoint = ((ceiling - floor)/2) + floor;
            if(inputString[midpoint].compareTo(firstWord) >= 0){
                floor = midpoint;
            }else{
                ceiling = midpoint;
            }
            if(floor + 1 == ceiling) break;
        }
        return ceiling;
    }

}
