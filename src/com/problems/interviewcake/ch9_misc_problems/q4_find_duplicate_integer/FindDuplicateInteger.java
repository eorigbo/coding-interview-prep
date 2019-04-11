package com.problems.interviewcake.ch9_misc_problems.q4_find_duplicate_integer;

public class FindDuplicateInteger {
    public static int findDuplicate(int[] arr){
        if(arr.length < 2) throw new IllegalArgumentException("At least 2 integers are required to have a duplicate.");

        //Insight here is that if we have unique integers from 1 to n
        // the sum of those ints can be calculated by ((n*n)+n)/2
        int n = arr.length - 1;
        int expectedSum = (n * n + n)/2;
        int actualSum = 0;

        for(int currInt: arr){
            actualSum += currInt;
        }

        return actualSum - expectedSum;
    }
}
