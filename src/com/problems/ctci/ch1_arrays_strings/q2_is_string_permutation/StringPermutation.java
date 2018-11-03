package com.problems.ctci.ch1_arrays_strings.q2_is_string_permutation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {
    public static boolean isPermutation(String string1, String string2){
        Set<Character> charSet = new HashSet<>();

        for(char currChar: string1.toCharArray()){
           charSet.add(currChar);
        }

        for(char currChar: string2.toCharArray()){
            if(charSet.contains(currChar)){
                charSet.remove(currChar);
            }else{
                charSet.add(currChar);
            }
        }
        return charSet.size() == 0;
    }
}
