package com.problems.interviewcake.ch2_hash_tables.q2_permutation_palindrome;

import java.util.HashSet;
import java.util.Set;

public class StringHasPalindromePermutation {
    public static boolean stringHasPalindromePermutation(String theString){
        //track characters we've seen an odd number of times
        Set<Character> unpairedChars = new HashSet<>();
        for (char currentChar: theString.toCharArray()){
            if (unpairedChars.contains(currentChar)){
                unpairedChars.remove(currentChar);
            }else{
                unpairedChars.add(currentChar);
            }
        }
        return unpairedChars.size() <= 1;
    }
}
