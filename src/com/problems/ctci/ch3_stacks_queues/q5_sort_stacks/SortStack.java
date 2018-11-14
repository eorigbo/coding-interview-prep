package com.problems.ctci.ch3_stacks_queues.q5_sort_stacks;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class SortStack {
    public static void sort(Deque<Integer> stack) {
        //initialize helper stack
        Deque<Integer> helperStack = new ArrayDeque<>();

        //insert elements in sorted order into helper stack
        while(!stack.isEmpty()){
            int tmp = stack.pop();
            while(!helperStack.isEmpty() && helperStack.peek() > tmp){
                stack.push(helperStack.pop());
            }
            helperStack.push(tmp);
        }

        //insert sorted elements back to stack
        while(!helperStack.isEmpty()){
            stack.push(helperStack.pop());
        }
    }
}
