package com.problems.interviewcake.code.sorting_searching;

public class FindIndexOfRotatedArray_Attempt {

    public static int findIndexOfRotatedArray(String[] words){

        if(words.length < 2){
            throw new IllegalArgumentException("The array needs at most 2 elements before it can be a rotated array.");
        }

        int floor = 0;
        int ceiling = words.length - 1;
        String firstWord = words[0];

        if(words[ceiling].compareTo(firstWord) >= 0) return 0;

        while(floor < ceiling){
            int midpoint = floor + ((ceiling - floor)/2);

            if(words[midpoint].compareTo(firstWord) >= 0){
                floor = midpoint;
            }else{
                ceiling = midpoint;
            }

            if(floor + 1 == ceiling){
                break;
            }
        }
        return ceiling;
    }
}
