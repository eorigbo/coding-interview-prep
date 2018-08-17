package com.problems.interviewcake.code.arrays;

public class ReverseWords_Attempt{

    private static void reverseChars(char[] theCharArray, int start, int end){

        while(start < end){
            char tmp = theCharArray[start];
            theCharArray[start] = theCharArray[end];
            theCharArray[end] = tmp;
            start++;
            end--;
        }
    }

    public static void reverseWords(char[] word){
        //if(word.length < 2) throw new IllegalArgumentException("The word needs at least 2 characters to be reversed.");

        int start = 0, end = 0;
        reverseChars(word,start,word.length - 1);

        while(start < word.length){
            while(start < end || start < word.length && word[start] == ' ') start++;
            while(end < start || end < word.length && word[end] != ' ') end++;
            reverseChars(word,start,end-1);
        }
    }

}