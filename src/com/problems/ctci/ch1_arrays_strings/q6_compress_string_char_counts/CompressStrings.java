package com.problems.ctci.ch1_arrays_strings.q6_compress_string_char_counts;

public class CompressStrings {
    public static String compress(String theString){
        //if string length < 2 return string
        if(theString.length() < 2) return theString;

        //initialize prevChar and charCounter and compressedString. loop through chars of string
        int charCounter = 1;
        char currChar = theString.charAt(0);
        char prevChar = currChar;

        StringBuilder compressedString = new StringBuilder();

        for(int i = 1; i < theString.length(); i++){
            //if currChar == prevChar, increment charCounter
            currChar = theString.charAt(i);

            if(currChar == prevChar){
                charCounter++;

            //else append currentChar + charCounter to compressedString. charCounter = 1
            }else{
                compressedString.append(prevChar+Integer.toString(charCounter));
                charCounter = 1;
            }
            //assign currChar to prevChar
            prevChar = currChar;
        }

        //append the last char and charCounter to string
        compressedString.append(currChar + Integer.toString(charCounter));
        return new String(compressedString);
    }
}
