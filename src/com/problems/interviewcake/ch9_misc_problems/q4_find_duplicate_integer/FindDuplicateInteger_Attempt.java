package com.problems.interviewcake.ch9_misc_problems.q4_find_duplicate_integer;

public class FindDuplicateInteger_Attempt {
    public static int findDuplicate(int[] arr){
        int n = arr.length - 1;
        int arraySum = 0;

        for(int currInt: arr) arraySum += currInt;

        int formSum = ((n * n) + n)/2;

        int result = arraySum - formSum;

        return result;
    }
}
