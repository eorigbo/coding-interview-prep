package com.problems.interviewcake.ch2_hash_tables.q2_permutation_palindrome;

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
