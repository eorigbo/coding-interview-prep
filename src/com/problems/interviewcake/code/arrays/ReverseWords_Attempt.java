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

    public static void reverseWords(char[] theWord){
        if(theWord.length < 2) throw new IllegalArgumentException("At least two characters are needed to do a reverse.");

        reverseChars(theWord,0,theWord.length-1);

        int start =0, end = 0;
        while(start < theWord.length){
            while(start < end || start < theWord.length && theWord[start] == ' ')start++;
            while(end < start || end < theWord.length && theWord[end] != ' ')end++;
            reverseChars(theWord,start,end-1);
        }
    }

}