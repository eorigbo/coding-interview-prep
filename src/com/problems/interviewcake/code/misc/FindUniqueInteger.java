package com.problems.interviewcake.code.misc;

public class FindUniqueInteger {
    public static int findUnique(int[] arr){
        int uniqueId = 0;

        for(int currId: arr) {
            uniqueId ^= currId;
        }

        return uniqueId;
    }
}
