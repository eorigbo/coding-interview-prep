package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class StringHasPalindromePermutation_Attempt{

    public static boolean stringHasPalindromePermutation(String theString){


        char[] theCharArray = theString.toCharArray();
        if(theCharArray.length < 2) throw new IllegalArgumentException("The string needs at least 2 characters to be a palindrome.");

        Set<Character> charPairs = new HashSet<>();

        for(char currChar: theCharArray){
            if(charPairs.contains(currChar)){
                charPairs.remove(currChar);
            }else{
                charPairs.add(currChar);
            }
        }
        return charPairs.size() <= 1;


    }
}
