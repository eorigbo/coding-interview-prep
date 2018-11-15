package com.problems.ctci.ch1_arrays_strings.q1_unique_char_strings;

public class UniqueCharStringsAttempt {
    public static boolean hasUniqueChars(String theString){
        //initialize seenChar array of booleans
        boolean[] seenChars = new boolean[128];

        //loop through string chars
        for(char currChar: theString.toCharArray()) {
            //if the index of that char is true, return false
            if(seenChars[currChar]) return false;
            // else update to true
            else seenChars[currChar] = true;
        }
        //outside loop return true
        return true;
    }



}
