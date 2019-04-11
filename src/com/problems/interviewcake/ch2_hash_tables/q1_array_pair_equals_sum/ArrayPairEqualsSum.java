package com.problems.interviewcake.ch2_hash_tables.q1_array_pair_equals_sum;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairEqualsSum {

    public static boolean arrayPairEqualsSum(int[] arrayNumbers, int sumArrayPair){
        if(arrayNumbers.length < 2) return false;

        Set<Integer> arrayNumbersSeen = new HashSet<>();

        for (int currArrayNum: arrayNumbers){
            int matchingSecondNum = sumArrayPair - currArrayNum;
            if(arrayNumbersSeen.contains(matchingSecondNum)){
                return true;
            }
            arrayNumbersSeen.add(currArrayNum);
        }

        return false;
    }
}
