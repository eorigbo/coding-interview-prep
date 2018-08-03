package com.problems.interviewcake.code.sorting_searching;

public class DuplicateInUnsortedArray_Attempt {

    public static int findDuplicate(int[] theArray){
        if(theArray.length < 2) throw new IllegalArgumentException("At least two integers are required in the array.");

        int floor = 1;
        int ceiling = theArray.length - 1;

        while(floor < ceiling){
            int midpoint = ((ceiling - floor)/2) + floor;
            int lowerFloor = floor;
            int lowerCeiling = midpoint;
            int upperFloor = midpoint + 1;
            int upperCeiling = ceiling;

            int itemsInLower = 0;
            int DistinctIntsInLower = lowerCeiling - lowerFloor + 1;

            for(int item: theArray){
                if(item >= lowerFloor && item <= lowerCeiling) itemsInLower++;
            }

            if(itemsInLower > DistinctIntsInLower){
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
