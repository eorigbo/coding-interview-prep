package com.problems.interviewcake.code.arrays;

import static com.problems.interviewcake.code.arrays.ReverseCharacterArray.reverseChars;

public class ReverseWords {

    public static void reverseWords(char[] input){
        int arrayLength = input.length;
        //first reverse the whole string.
        reverseChars( input, 0, arrayLength-1);

        //second, reverse each word in the string
        int start = 0, end = 0;
        while(start < arrayLength){
            while(start < end || start < arrayLength && input[start] == ' '){
                start++; //skip spaces chars
            }

            while(end < start || end < arrayLength && input[end] != ' '){
                end++; //skip non-spaces chars.
            }

            reverseChars(input, start,end -1);
        }
    }

}










