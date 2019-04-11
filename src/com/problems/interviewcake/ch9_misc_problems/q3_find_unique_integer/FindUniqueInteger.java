package com.problems.interviewcake.ch9_misc_problems.q3_find_unique_integer;

public class FindUniqueInteger {
    public static int findUnique(int[] arr){
        int uniqueId = 0;

        for(int currId: arr) {
            uniqueId ^= currId;
        }

        return uniqueId;
    }
}
