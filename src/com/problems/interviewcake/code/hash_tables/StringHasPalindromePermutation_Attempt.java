package com.problems.interviewcake.code.hash_tables;

import java.util.HashSet;
import java.util.Set;

public class StringHasPalindromePermutation_Attempt{

    public static boolean stringHasPalindromePermutation(String theString){
        if(theString.length() < 2) return true;

        Set<Character> seenChars = new HashSet<>();

        for(char currChar: theString.toCharArray()){
            if(seenChars.contains(currChar)) seenChars.remove(currChar);
            else seenChars.add(currChar);
        }
        return seenChars.size() <= 1;
    }
}
