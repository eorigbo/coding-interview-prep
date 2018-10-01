package com.problems.interviewcake.code.sorting_searching;

public class FindIndexOfRotatedArray_Attempt {

    public static int findIndexOfRotatedArray(String[] arr){
        if(arr.length < 2) throw new IllegalArgumentException("At least 2 elements are needed for rotation.");

        String firstWord = arr[0];

        if(arr[arr.length - 1].compareTo(firstWord) >= 0) return 0;
        int floor = 0;
        int ceiling = arr.length-1;

        while(floor < ceiling){
            //cal midpoint and compare to firstWord, if > 0 move floor to midpoint
            int mid = (ceiling - floor)/2 + floor;
            if(arr[mid].compareTo(firstWord) >= 0) floor = mid;
            else ceiling = mid;

            //if floor + 1 == ceiling return ceiling
            if(floor + 1 == ceiling) break;
        }
        return ceiling;
    }

}
