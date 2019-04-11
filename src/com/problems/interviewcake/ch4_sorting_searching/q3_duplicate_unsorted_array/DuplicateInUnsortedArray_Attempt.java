package com.problems.interviewcake.ch4_sorting_searching.q3_duplicate_unsorted_array;

public class DuplicateInUnsortedArray_Attempt {

    public static int findDuplicate(int[] theArray){
        //floor is 1, ceiling is arraylength -1
        int floor = 1, ceiling = theArray.length - 1;

        //if length < 2 through exception
        if (theArray.length < 2) throw  new IllegalArgumentException("At least 2 elements are needed to find duplicates");

        // while floor < ceiling create ranges
        while(floor < ceiling){
            int midpoint = ((ceiling - floor)/2) + floor;
            int lowerFloor = floor;
            int lowerCeiling = midpoint;
            int upperFloor = midpoint + 1;
            int upperCeiling = ceiling;

            int itemsLowRange = 0;
            int distinctLowRangeItems = lowerCeiling - lowerFloor + 1;

            for(int item: theArray){
                if (item >= lowerFloor && item <= lowerCeiling) itemsLowRange++;
            }

            if(itemsLowRange > distinctLowRangeItems){
                floor = lowerFloor;
                ceiling = lowerCeiling;
            } else{
                floor = upperFloor;
                ceiling = upperCeiling;
            }
        }

        //return ceiling index outside loop
        return ceiling;
    }
}
