package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairEqualsSum_Attempt {

    public static boolean arrayPairEqualsSum(int[] theArray, int theSum){

        Set<Integer> matchingNumbers = new HashSet<>();

        for(int currInt: theArray){
            int secondNumber = theSum - currInt;
            if(matchingNumbers.contains(secondNumber)){
                return true;
            }else{
                matchingNumbers.add(currInt);
            }
        }
        return false;
    }


}
