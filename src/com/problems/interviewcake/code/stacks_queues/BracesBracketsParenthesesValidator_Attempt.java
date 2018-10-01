package com.problems.interviewcake.code.stacks_queues;

import java.util.*;

public class BracesBracketsParenthesesValidator_Attempt {

    public static boolean isValid(String inputString){
        if(inputString.length() == 1) throw new IllegalArgumentException("At least 2 elements are needed to make a pair.");
        if(inputString.length() == 0) return true;
        
        Deque<Character> latestOpener = new ArrayDeque<>();


        return latestOpener.isEmpty();
    }
}
