package com.problems.ctci.ch1_arrays_strings.q5_one_or_zero_edits;

public class OneOrZeroEditsTwoPointer {
    public static boolean hasOneOrZeroEdits(String string1, String string2){
        int str1Length = string1.length();
        int str2Length = string2.length();

        //if absolute difference in length between both strings is > 1, return false
        if(Math.abs(str1Length - str2Length) > 1) return false;

        int editsCounter = 0;

        int str1Idx = 0, str2Idx = 0;

        //while both strings are not exhausted
        while(str1Idx < str1Length && str2Idx < str2Length){
            //check if character for both strings is the same, if not increment editsCounter
            if(string1.charAt(str1Idx) != string2.charAt(str2Idx)){
                editsCounter++;
                //check if edits are now more than 1
                if(editsCounter > 1) return false;

                //if string1 is longer, increment its index because it may be behind
                if(str1Length > str2Length){
                    str1Idx++;
                //if string2 is longer increment its index
                }else if(str2Length > str1Length){
                    str2Idx++;
                }else{
                    str1Idx++;
                    str2Idx++;
                }
            }else{
                str1Idx++;
                str2Idx++;
            }
        }

        //for one extra character in either string
        if(str1Idx < str1Length || str2Idx < str2Length) editsCounter++;

        return editsCounter <= 1;
    }
}
