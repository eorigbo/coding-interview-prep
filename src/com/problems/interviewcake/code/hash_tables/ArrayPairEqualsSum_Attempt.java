package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairEqualsSum_Attempt {

    public static boolean arrayPairEqualsSum(int[] theArray, int theSum){

        if(theArray.length < 2) return false;

        Set<Integer> matchingNums = new HashSet<>();

        for(int currNum: theArray){
            int matchingNum = theSum - currNum;
            if(matchingNums.contains(matchingNum)){
                return true;
            }else{
                matchingNums.add(currNum);
            }
        }
        return false;
    }


}
