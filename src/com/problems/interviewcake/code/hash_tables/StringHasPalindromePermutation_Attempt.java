package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class StringHasPalindromePermutation_Attempt{

    public static boolean stringHasPalindromePermutation(String theString){
        if(theString.length() < 2) return true;

        Set<Character> oddChars = new HashSet<>();
        for(char currChar: theString.toCharArray()){
            if(oddChars.contains(currChar)){
                oddChars.remove(currChar);
            }else{
                oddChars.add(currChar);
            }
        }
        return oddChars.size() <= 1;
    }
}
