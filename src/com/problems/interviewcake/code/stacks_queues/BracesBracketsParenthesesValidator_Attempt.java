package com.problems.interviewcake.code.stacks_queues;

import java.util.*;

public class BracesBracketsParenthesesValidator_Attempt {

    public static boolean isValid(String code){
        //initialize openClosePair HashMap and populate
        /**Map<Character, Character> openClosePair = new HashMap<>();
        openClosePair.put('(', ')');
        openClosePair.put('{','}');
        openClosePair.put('[', ']');**/

        //initialize openersStack stack
        Deque<Character> openersStack = new ArrayDeque<>();

        //initialize openers and closers Sets
        //Set<Character> openers = new HashSet<>(openClosePair.keySet());
        //Set<Character> closers = new HashSet<>(openClosePair.values());

        //loop through character array of code
        for(char c: code.toCharArray()){

            //if character is an opener (contained in opener set), push to openersStack stack
            if(c == '(' || c == '{' || c == '['){
                openersStack.push(c);
            }else if(c == ')' || c == '}' || c == ']'){
                if(openersStack.isEmpty()){
                    return false;
                }else{
                    char opener = openersStack.pop();
                    if(opener == '(' && c != ')'
                            || opener == '{' && c != '}'
                            || opener == '[' && c != ']') return false;
                }
            }

        }
        //outside loop return openersStack.isEmpty
        return openersStack.isEmpty();
    }
}
