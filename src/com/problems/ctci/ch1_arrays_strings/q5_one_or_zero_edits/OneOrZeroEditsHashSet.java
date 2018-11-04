package com.problems.ctci.ch1_arrays_strings.q5_one_or_zero_edits;

import java.util.HashSet;
import java.util.Set;

public class OneOrZeroEditsHashSet {
    public static boolean hasOneOrZeroEdits(String inputString, String modifiedString) {
        Set<Character> uniqueChars = new HashSet<>();
        for(char currChar: inputString.toCharArray()){
            uniqueChars.add(currChar);
        }

        for(char currChar: modifiedString.toCharArray()){
            if(uniqueChars.contains(currChar)){
                uniqueChars.remove(currChar);
            }else{
                uniqueChars.add(currChar);
            }
        }

        return uniqueChars.size() <= 2;
    }
}
