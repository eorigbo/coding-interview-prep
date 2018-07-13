package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class StringHasPalindromePermutation_Attempt{

    public static boolean stringHasPalindromePermutation(String theString){

        Set<Character> unpairedChars = new HashSet<>();

        for(char currChar: theString.toCharArray()){
            if(unpairedChars.contains(currChar)){
                unpairedChars.remove(currChar);
            }else{
                unpairedChars.add(currChar);
            }

        }
        return unpairedChars.size() <= 1;

    }
}
