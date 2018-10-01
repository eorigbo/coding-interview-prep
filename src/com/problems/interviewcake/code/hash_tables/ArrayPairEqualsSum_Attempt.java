package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairEqualsSum_Attempt {

    public static boolean arrayPairEqualsSum(int[] arr, int sum){
        if(arr.length < 2) return false;

        Set<Integer> remainders = new HashSet<>();

        for(int currInt: arr){
            int remainder = sum -  currInt;
            if(remainders.contains(remainder)) return true;
            else remainders.add(currInt);
        }
        return false;
    }

}
