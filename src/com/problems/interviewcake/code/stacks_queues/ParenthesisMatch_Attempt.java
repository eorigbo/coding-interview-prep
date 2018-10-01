package com.problems.interviewcake.code.stacks_queues;

public class ParenthesisMatch_Attempt {

    public static int getClosingParen(String brackets, int openingPosition){
        int openingBrackets = 0;
        for(int i = openingPosition+1; i < brackets.length(); i++){
            char currChar = brackets.charAt(i);
            //if "(" increment brackets
            if(currChar == '('){
                openingBrackets++;
            } else if(currChar == ')'){
                if(openingBrackets == 0) return i;
                else openingBrackets--;
            }else throw new IllegalArgumentException("Input is not a bracket.");
        }

        throw new IllegalArgumentException("Closing bracket not found.");
    }
}
