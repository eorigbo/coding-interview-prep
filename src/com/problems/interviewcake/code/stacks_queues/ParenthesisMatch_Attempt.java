package com.problems.interviewcake.code.stacks_queues;

import java.util.NoSuchElementException;

public class ParenthesisMatch_Attempt {

    public static int getClosingParen(String word, int openingIndex){
        int openParenCnt = 0;
        for(int i = openingIndex + 1; i < word.length(); i++){
            char currChar = word.charAt(i);
            if(currChar == '('){
                openParenCnt++;
            }else if(currChar == ')'){
                if(openParenCnt == 0){
                    return i;
                }else{
                    openParenCnt--;
                }
            }else{
                throw new IllegalArgumentException("Character is not a parenthesis.");
            }
        }
        throw new IllegalArgumentException("Closing parenthesis not found.");
    }
}
