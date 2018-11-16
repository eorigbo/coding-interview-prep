package com.problems.ctci.ch1_arrays_strings.q5_one_or_zero_edits;

public class OneOrZeroEditsAttempt {
    public static boolean hasOneOrZeroEdits(String string1, String string2){
        //initialize str1Exhausted, str2Exhausted, str1Idx, str2Idx, str1Length, str2Length, editCounter
        int str1Length = string1.length();
        int str2Length = string2.length();
        int str1Idx = 0;
        int str2Idx = 0;
        boolean str1NotExhausted = str1Idx < str1Length;
        boolean str2NotExhausted = str2Idx < str2Length;
        int editsCounter = 0;

        //if difference in length between both strings > 1 return false
        if(Math.abs(str1Length - str2Length) > 1) return false;

        //while both strings are not exhausted
        while(str1NotExhausted && str2NotExhausted){

            //if they are the same increment both indexes
            if(string1.charAt(str1Idx) == string2.charAt(str2Idx)){
                str1Idx++;
                str2Idx++;
                //else increment editCounter and if it is > 1 return false
            }else{
                editsCounter++;
                if(editsCounter > 1) return false;

                //if str1 has a greater length increment,
                //else do the same for str2, else increment both
                if(str1Length > str2Length){
                    str1Idx++;
                }else if(str2Length > str1Length){
                    str2Idx++;
                }else{
                    str1Idx++;
                    str2Idx++;
                }
            }
            str1NotExhausted = str1Idx < str1Length;
            str2NotExhausted = str2Idx < str2Length;
        }

        //while either is not exhausted, increment editCounter and return editCounter <= 1
        if(str1NotExhausted || str2NotExhausted){
            editsCounter++;
        }

        return editsCounter <= 1;
    }
}
