package com.problems.interviewcake.code.arrays;

public class SubarraySum_Attempt{

    public static boolean subArraySum(int[] theArray, int theSum){

        int currSum = theArray[0];
        int start = 0;

        for(int i = 1; i <= theArray.length; i++){

            while(currSum > theSum && start < i-1){
                currSum = currSum - theArray[start];
                start++;
            }

            if(currSum == theSum){
                int subarrayLastIndex = i - 1;
                return true;
            }

            if(i < theArray.length) currSum = currSum + theArray[i];
        }
        return false;
    }
}
