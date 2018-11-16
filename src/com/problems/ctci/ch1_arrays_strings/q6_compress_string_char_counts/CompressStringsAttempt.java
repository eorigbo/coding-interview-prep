package com.problems.ctci.ch1_arrays_strings.q6_compress_string_char_counts;

public class CompressStringsAttempt {
    public static String compress(String theString){
        //initialize compressedString and charCounter
        StringBuilder compressedString = new StringBuilder();
        int charCounter = 0;

        //loop through string chars
        for(int i = 0; i < theString.length(); i++){
            charCounter++;

            //if i+1 >= strLength, or charAt i != one in front
            if(i+1 >= theString.length() || theString.charAt(i) != theString.charAt(i+1)){
                //append char and charCounter to compressedString
                compressedString.append(theString.charAt(i));
                compressedString.append(charCounter);
                charCounter = 0;
            }
        }

        //if compressed string has lesser length than original return it.
        return compressedString.length() < theString.length() ? compressedString.toString() : theString;
    }
}
