package com.problems.ctci.ch1_arrays_strings.q1_unique_char_strings;

public class UniqueCharStrings {
    public static boolean hasUniqueChars(String word){
        boolean[] wordChars = new boolean[128];
        for(char currChar: word.toCharArray()){
            if(wordChars[currChar]) return false;

            wordChars[currChar] = true;
        }
        return true;
    }
}
