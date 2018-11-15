package com.problems.ctci.ch1_arrays_strings.q3_replace_spaces;

public class ReplaceSpacesAttempt {
    public static char[] replaceSpaces(char[] word){
        //get length and number of spaces
        int currLength = 0, numSpaces = 0;
        char endMarker = '\0';

        for(char currChar: word){
            currLength++;
            if(currChar == ' ') numSpaces++;
            if(currChar == endMarker){
                break;
            }

        }

        //get new length by multiplying spaces by 2 and adding to current length
        int newLength = currLength + (numSpaces * 2);

        //initialize j as new length - 1, i as current length, and do reverse loop
        int j = newLength - 1;
        for(int i = currLength - 1; i >= 0; i--){

            //when you meet a space replace with %20, else assign i to j
            if(word[i] == ' '){
                word[j] = '0';
                word[j-1] = '2';
                word[j-2] = '%';
                j = j-3;
            }else{
                word[j] = word[i];
                j--;
            }
        }

        //return word array.
        return word;
    }
}
