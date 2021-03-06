package com.problems.interviewcake.ch7_stacks_queues.q1_largest_element_in_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxStack_Attempt{
    Deque<Integer> stack;
    Deque<Integer> maxStack;

    public MaxStack_Attempt(){
        stack = new ArrayDeque<>();
        maxStack = new ArrayDeque<>();
    }

    public void push(int item){
        stack.push(item);
        if(maxStack.isEmpty() || item >= maxStack.peek()) maxStack.push(item);
    }

    public int pop(){
        int result = stack.pop();
        if(result == maxStack.peek()) maxStack.pop();
        return result;
    }

    public int getMax(){
        return maxStack.peek();
    }
}
