package com.problems.interviewcake.code.arrays;

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
