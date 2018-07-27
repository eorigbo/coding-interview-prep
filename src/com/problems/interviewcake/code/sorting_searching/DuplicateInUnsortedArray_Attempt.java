package com.problems.interviewcake.code.sorting_searching;

public class DuplicateInUnsortedArray_Attempt {

    public static int findDuplicate(int[] theArray){

        if(theArray.length < 2){
            throw new IllegalArgumentException("The input array should have at least 2 elements.");
        }

        int floor = 1;
        int ceiling = theArray.length-1;

        while(floor < ceiling){
            int midpoint = floor + ((ceiling-floor)/2);
            int lowerFloor = floor;
            int lowerCeiling = midpoint;
            int upperFloor = midpoint + 1;
            int upperCeiling = ceiling;

            int itemsInLower = 0;
            int distinctItemsInLower = lowerCeiling - lowerFloor + 1;

            for(int item: theArray){
                if(item >= lowerFloor && item <= lowerCeiling)itemsInLower++;
            }

            if(itemsInLower > distinctItemsInLower){
                ceiling = lowerCeiling;
                floor = lowerFloor;
            }else{
                ceiling = upperCeiling;
                floor = upperFloor;
            }
        }

        return ceiling;

    }
}
