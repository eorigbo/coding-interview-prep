package com.problems.interviewcake.code.ch1_arrays.q2_reverse_words;

public class ReverseCharacterArray_Attempt {
    public static void reverseChars(char[] chars, int start, int end){
        while(start < end){
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
    }
}
