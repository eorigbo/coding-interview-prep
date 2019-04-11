package com.problems.interviewcake.ch1_arrays.q2_reverse_words;

public class ReverseWords {

    public static void reverseWords(char[] input){
        int arrayLength = input.length;
        //first reverse the whole string.
        ReverseCharacterArray.reverseChars( input, 0, arrayLength-1);

        //second, reverse each word in the string
        int start = 0, end = 0;
        while(start < arrayLength){
            while(start < end || start < arrayLength && input[start] == ' '){
                start++; //skip spaces chars
            }

            while(end < start || end < arrayLength && input[end] != ' '){
                end++; //skip non-spaces chars.
            }

            ReverseCharacterArray.reverseChars(input, start,end -1);
        }
    }

}










