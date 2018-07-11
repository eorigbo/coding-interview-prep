package com.problems.interviewcake.code.arrays;

public class ReverseWords_Attempt{

    public static void reverseWords(char[] sentence){

        //reverse the entire array
        reverseChars(sentence, 0, sentence.length - 1);

        //reverse each word in the array by determining start and end and then call to reverseChars helper function
        int start = 0, end = 0;

        while(start < sentence.length){
            while(start < end || start < sentence.length && sentence[start] == ' '){
                start++;
            }

            while(end < start || end < sentence.length && sentence[end] != ' '){
                end++;
            }

            reverseChars(sentence,start,end-1);
        }

    }

    public static void reverseChars(char[] sentence, int start, int end){
        while(start < end){
            char tmp = sentence[start];
            sentence[start] = sentence[end];
            sentence[end] = tmp;
            start++;
            end--;
        }

    }

}