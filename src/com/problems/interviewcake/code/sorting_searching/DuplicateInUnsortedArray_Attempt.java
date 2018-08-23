package com.problems.interviewcake.code.sorting_searching;

public class DuplicateInUnsortedArray_Attempt {

    public static int findDuplicate(int[] theArray){
        //initialize floor as 1, ceiling as arraylength
        int floor = 1, ceiling = theArray.length-1;

        // if arraylength is less than 2 no duplicates so throw exception
        if (theArray.length < 2) throw new IllegalArgumentException("At least two ints are required.");

        // while floor < ceiling
        while(floor < ceiling){
            int midpoint = ((ceiling - floor)/2) + floor;
            int lowerFloor = floor;
            int lowerCeiling = midpoint;
            int upperFloor = midpoint + 1;
            int upperCeiling = ceiling;

            int itemsLowerRange = 0;
            int distinctLowerItems = lowerCeiling - lowerFloor + 1;

            for(int currInt: theArray){
                if(currInt >= lowerFloor && currInt <= lowerCeiling)itemsLowerRange++;
            }

            if(itemsLowerRange > distinctLowerItems){
                floor = lowerFloor;
                ceiling = lowerCeiling;
            }else{
                floor = upperFloor;
                ceiling = upperCeiling;
            }
        }
        return ceiling;
    }
}
