package com.problems.ctci.ch3_stacks_queues.q5_sort_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class SortStackAttempt {
    public static void sort(Deque<Integer> stack){
        //initialize new helperStack
        Deque<Integer> helperStack = new ArrayDeque<>();

        //loop through stack items and while stack is not empty
        while(!stack.isEmpty()){
            //assign element to tmp and while helperstack is not null and tmp > helperstack.peek
            int tmp = stack.pop();
            while(!helperStack.isEmpty() && helperStack.peek() > tmp){
                //push helperstack.pop into original stack
                stack.push(helperStack.pop());
            }
            //push tmp to helperStack
            helperStack.push(tmp);
        }
        //while helperstack is not null push into original stack
        while(!helperStack.isEmpty()){
            stack.push(helperStack.pop());
        }
    }
}
