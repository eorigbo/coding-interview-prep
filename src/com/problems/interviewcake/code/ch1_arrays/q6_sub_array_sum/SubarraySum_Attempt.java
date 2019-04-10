package com.problems.interviewcake.code.ch1_arrays.q6_sub_array_sum;

public class SubarraySum_Attempt{

    public static boolean subArraySum(int[] arr, int sum){
        int start = 0, currSum = arr[0];

        for(int i = 1; i <= arr.length; i++){
            while(currSum > sum && start < i-1){
                currSum = currSum = arr[start];
                start++;
            }

            if(currSum == sum) return true;

            if(i < arr.length) currSum += arr[i];
        }
        return false;
    }
}
