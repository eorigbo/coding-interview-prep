package com.problems.ctci.ch1_arrays_strings.q2_is_string_permutation;

import java.util.HashSet;
import java.util.Set;

public class StringPermutationAttempt {
    public static boolean isPermutation(String string1, String string2){
        //initialize hashset of chars
        Set<Character> seenChars = new HashSet<>();

        //add string 1 chars to the hashset
        for(char currChar: string1.toCharArray()){
            seenChars.add(currChar);
        }

        //use string 2 chars to remove chars from hashset
        for(char currChar: string2.toCharArray()){
            if(seenChars.contains(currChar)) seenChars.remove(currChar);
        }

        //return hashset size == 0
        return seenChars.size() == 0;
    }
}
