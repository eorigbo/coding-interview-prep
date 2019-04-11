package com.problems.interviewcake.ch1_arrays.q2_reverse_words;

public class ReverseCharacterArray {

    public static void reverseChars(char[] array, int start, int end){
        while(start < end){
            char tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start++;
            end--;
        }
    }
}
