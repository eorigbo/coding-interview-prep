package com.problems.interviewcake.code.arrays;

public class SubarraySum_Attempt{

    public static boolean subArraySum(int[] theArray, int theSum){
        if(theArray.length < 2) throw new IllegalArgumentException("Array needs at least one element.");

        //initialize start as 0, currSum as first element of array
        int start = 0, currSum = theArray[0];

        //for i = 1, i <= arraylength, i++
        for(int i = 1; i <= theArray.length; i++){
            //while curr sum > sum, remove earliest element and increment start
            while(currSum > theSum && start < i-1){
                currSum = currSum - theArray[start];
                start++;
            }

            //if currsum == sum return true (index is i - 1)
            if(currSum == theSum) return true;

            //if i < arraylength, add to currSum
            if(i < theArray.length) currSum += theArray[i];

        }
        return false;

    }
}
