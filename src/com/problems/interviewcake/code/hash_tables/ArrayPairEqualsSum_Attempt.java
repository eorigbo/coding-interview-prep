package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairEqualsSum_Attempt {


    public static boolean arrayPairEqualsSum(int[] arrayNumbers, int arraySum){
        Set<Integer> numbersSeen = new HashSet<>();

        for(int currentNumber: arrayNumbers){
            int matchingSecondNumber = arraySum - currentNumber;

            if(numbersSeen.contains(matchingSecondNumber)){
                return true;
            }

            numbersSeen.add(currentNumber);
        }
        return false;

    }

}
