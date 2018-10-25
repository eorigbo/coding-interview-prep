package com.problems.interviewcake.code.misc;

public class FindDuplicateInteger {
    public static int findDuplicate(int[] arr){
        if(arr.length < 2) throw new IllegalArgumentException("At least 2 integers are required to have a duplicate.");

        int n = arr.length - 1;
        int expectedSum = (n * n + n)/2;
        int actualSum = 0;

        for(int currInt: arr){
            actualSum += currInt;
        }

        return actualSum - expectedSum;
    }
}
