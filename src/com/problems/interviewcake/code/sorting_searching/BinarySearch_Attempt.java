package com.problems.interviewcake.code.sorting_searching;

public class BinarySearch_Attempt {
        public static boolean binarySearch(int[] theArray, int target){
            int floorIndex = -1;
            int ceilingIndex = theArray.length;

            while(floorIndex + 1 < ceilingIndex){
                //get guessValue
                int halfDistance = (ceilingIndex - floorIndex)/2;
                int guessIndex = floorIndex + halfDistance;
                int guessValue = theArray[guessIndex];

                if(guessValue == target){
                    return true;
                }

                //if guessValue > target assign guessIndex to ceiling index, else assign to floor index
                if(guessValue > target){
                    ceilingIndex = guessIndex;
                }else{
                    floorIndex = guessIndex;
                }


            }

            return false;

        }


}
