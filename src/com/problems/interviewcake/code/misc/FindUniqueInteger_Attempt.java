package com.problems.interviewcake.code.misc;

public class FindUniqueInteger_Attempt {
    public static int findUnique(int[] arr){
        int result = 0;
        for(int currInt: arr){
            result ^= currInt;
        }
        return result;
    }
}
