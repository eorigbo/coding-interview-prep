package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairEqualsSum {

    public static boolean arrayPairEqualsSum(int[] arrayNumbers, int sumArrayPair){

        Set<Integer> arrayNumbersSeen = new HashSet<>();

        for (int firstArrayNum: arrayNumbers){
            int matchingSecondNum = sumArrayPair - firstArrayNum;
            if(arrayNumbersSeen.contains(matchingSecondNum)){
                return true;
            }
            arrayNumbersSeen.add(firstArrayNum);
        }

        return false;
    }
}
