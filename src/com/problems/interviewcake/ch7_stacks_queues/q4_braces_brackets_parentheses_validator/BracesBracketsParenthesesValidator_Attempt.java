package com.problems.interviewcake.ch7_stacks_queues.q4_braces_brackets_parentheses_validator;

import java.util.*;

public class BracesBracketsParenthesesValidator_Attempt {

    public static boolean isValid(String code){
        Map<Character, Character> openClosePair = new HashMap<>();
        openClosePair.put('(',')');
        openClosePair.put('{','}');
        openClosePair.put('[',']');

        Set<Character> openers = new HashSet<>(openClosePair.keySet());
        Set<Character> closers = new HashSet<>(openClosePair.values());

        Deque<Character> openStack = new ArrayDeque<>();

        for(char currChar: code.toCharArray()){
            //if opener push to stack
            if(openers.contains(currChar)){
                openStack.push(currChar);
            }

            //if closer pop the last element from stack and get the associated closer from map. if it doesn't match currChar return false
            if(closers.contains(currChar)){
                if(!openStack.isEmpty()){
                    char opener = openStack.pop();
                    if(currChar != openClosePair.get(opener)) return false;
                }else{
                    return false;
                }
            }
        }
        return openStack.isEmpty();
    }
}
