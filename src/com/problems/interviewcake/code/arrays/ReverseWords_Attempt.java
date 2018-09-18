package com.problems.interviewcake.code.arrays;

public class ReverseWords_Attempt{

    public static void reverseWords(char[] sentence){
        //initialize start and end
        int start = 0, end = 0;

        //reverse entire sentence
        reverseChars(sentence, 0, sentence.length-1);

        //reverse each word
        while(start < sentence.length){
            while(start < end || start < sentence.length && sentence[start] == ' ') start++;

            while(end < start || end < sentence.length && sentence[end] != ' ') end++;

            reverseChars(sentence, start, end-1);
        }
    }

    private static void reverseChars(char[] theChar, int start, int end){
        while(start < end){
            char tmp = theChar[start];
            theChar[start] = theChar[end];
            theChar[end] = tmp;
            start++;
            end--;
        }
    }

}