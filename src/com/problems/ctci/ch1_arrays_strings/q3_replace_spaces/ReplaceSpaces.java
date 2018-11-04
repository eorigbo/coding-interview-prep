package com.problems.ctci.ch1_arrays_strings.q3_replace_spaces;

public class ReplaceSpaces {
    public static char[] replaceSpaces(char[] inputChar){
        //find char length and number of spaces
        //char length identified by meeting an endMarker
        char endMarker = '\0';
        int spaceCounter = 0;
        int charLength = 0;
        for(char currChar: inputChar){
            charLength++;
            if(currChar == ' ') spaceCounter++;
            if(currChar == endMarker) break;
        }

        //calculate length of the new array
        int trueLength = charLength + (spaceCounter * 2);

        //loop through existing array
        //move the last element to the end of the new array and work backwards
        //when a space is encountered, replace with %20
        //careful though it has to be done backwards
        int j=trueLength - 1;
        for(int i = charLength - 1; i >= 0; i--){
            if(inputChar[i] == ' '){
                inputChar[j] = '0';
                inputChar[j-1] = '2';
                inputChar[j-2] = '%';
                j = j - 3;
            }else{
                inputChar[j] = inputChar[i];
                j--;
            }
        }
        return inputChar;
    }
}
