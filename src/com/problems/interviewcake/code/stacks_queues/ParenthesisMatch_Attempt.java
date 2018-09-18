package com.problems.interviewcake.code.stacks_queues;

public class ParenthesisMatch_Attempt {

    public static int getClosingParen(String code, int openPosition){

        //loop through starting at openPosition+1
        int openParenCounter = 0;
        for(int position = openPosition+1; position < code.length(); position++){
            //if char is '(', increment openCounter,
            char c = code.charAt(position);
            if(c == '('){
                openParenCounter++;
            }else if(c == ')'){
                if(openParenCounter == 0){
                    return position;
                } else{
                    openParenCounter--;
                }
            }else{
                throw new IllegalArgumentException("code contains unexpected characters.");
            }

        }
        throw new IllegalArgumentException("Matching parenthesis was not found.");

    }
}
