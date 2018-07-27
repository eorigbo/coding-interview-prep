package com.problems.interviewcake.code.sorting_searching;

public class DuplicateInUnsortedArray {
    public static int findDuplicate(int[] theArray){
        int floor = 1;
        int ceiling = theArray.length - 1;

        while(floor < ceiling){
            int midpoint = floor + ((ceiling - floor)/2);
            int lowerRangeFloor = floor;
            int lowerRangeCeiling = midpoint;
            int upperRangeFloor = midpoint + 1;
            int upperRangeCeiling = ceiling;

            int itemsInLowerRange = 0;
            for (int item:theArray){
                if (item >= lowerRangeFloor && item <= lowerRangeCeiling){
                    itemsInLowerRange++;
                }
            }

            int distinctPossibleIntsInLowerRange = lowerRangeCeiling - lowerRangeFloor + 1;


            if (itemsInLowerRange > distinctPossibleIntsInLowerRange){
                floor = lowerRangeFloor;
                ceiling = lowerRangeCeiling;
            }else{
                floor = upperRangeFloor;
                ceiling = upperRangeCeiling;
            }
        }
        return ceiling;
    }
}
