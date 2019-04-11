package com.problems.interviewcake.ch9_misc_problems.q3_find_unique_integer;

public class FindUniqueInteger_Attempt {
    public static int findUnique(int[] arr){
        int result = 0;
        for(int currInt: arr){
            result ^= currInt;
        }
        return result;
    }
}
