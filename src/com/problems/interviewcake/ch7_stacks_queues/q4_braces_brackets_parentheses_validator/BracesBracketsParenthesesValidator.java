package com.problems.interviewcake.ch7_stacks_queues.q4_braces_brackets_parentheses_validator;

import java.util.*;

public class BracesBracketsParenthesesValidator {
    public static boolean isValid(String code){
        Map<Character,Character> openClosePair = new HashMap<>();
        openClosePair.put('(',')');
        openClosePair.put('[',']');
        openClosePair.put('{','}');

        Set<Character> openers = new HashSet<>(openClosePair.keySet());
        Set<Character> closers = new HashSet<>(openClosePair.values());

        Deque<Character> openersStack = new ArrayDeque<>();

        for(char c: code.toCharArray()){
            if(openers.contains(c)){
                openersStack.push(c);
            }else if(closers.contains(c)){
                if(openersStack.isEmpty()){
                    return false; // this means we saw a closer before seeing any opener which is invalid
                }else{
                    char lastOpener = openersStack.pop();

                    if(openClosePair.get(lastOpener) != c) return false;
                }
            }
        }

        return openersStack.isEmpty();
    }
}
