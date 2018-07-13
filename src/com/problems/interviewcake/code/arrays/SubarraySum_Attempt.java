package com.problems.interviewcake.code.arrays;

public class SubarraySum_Attempt{

    public static boolean subArraySum(int[] theArray,int theSum){
        //initialize start at 0, currSum at array 0
        int start = 0, currSum = theArray[0], arrayLength = theArray.length;

        //loop through the array starting at element one. Include instance when i = arrayLength
        for(int i = 1; i <= arrayLength; i++){

            //while currsum > sum && we won't have out of bounds exception (start < i-1), remove array[start] from currSum and increment
            while(currSum > theSum && start < i-1){
                currSum = currSum - theArray[start];
                start++;
            }
            //if currsum == sum return true. get subarray last index as well
            if(currSum == theSum){
                int subarrayLastIndex = i - 1;
                System.out.println("The subarray is between " + start + " and " + subarrayLastIndex);
                return true;
            }

            //if i < arrayLength add array[i] to currSum
            if(i < arrayLength){
                currSum = currSum + theArray[i];
            }
        }
        //outside loop return false as no subarray was found
        System.out.println("No subarray found.");
        return false;

    }
}
