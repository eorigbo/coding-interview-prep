package com.problems.interviewcake.code.sorting_searching;

public class DuplicateInUnsortedArray_Attempt {

    public static int findDuplicate(int[] unsortedArray){
        if(unsortedArray.length < 2) throw new IllegalArgumentException("Duplicates cannot exist in array with less than 2 elements.");

        //floor is 1, ceiling is arraylength
        int floor = 1, ceiling = unsortedArray.length - 1;

        //while floor < ceiling
        while(floor < ceiling){
            int midpoint = ((ceiling - floor)/2) + floor;
            int lowerFloor = floor;
            int lowerCeiling = midpoint;
            int upperFloor = midpoint + 1;
            int upperCeiling = ceiling;

            //populate distinct lower items and items in lower range
            int distinctLowerItems = lowerCeiling - lowerFloor + 1;
            int itemsLowerRange = 0;

            for(int i=0; i< unsortedArray.length; i++){
                if(unsortedArray[i] >= lowerFloor && unsortedArray[i] <= lowerCeiling) itemsLowerRange++;
            }

            //do a sort of binary test
            if(itemsLowerRange > distinctLowerItems){
                ceiling = lowerCeiling;
                floor = lowerFloor;
            }else{
                ceiling = upperCeiling;
                floor = upperFloor;
            }

        }

        //outside loop return ceiling
        return ceiling;
    }
}
