package com.problems.interviewcake.code.stacks_queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxStack {
    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> maxesStack = new ArrayDeque<>();

    public void push(int item){
        stack.push(item);
        if(maxesStack.isEmpty() || item >= maxesStack.peek()) maxesStack.push(item);
    }

    public int pop(){
        int item = stack.pop();
        if(item == maxesStack.peek()) maxesStack.pop();
        return item;
    }

    public int getMax(){
        return maxesStack.peek();
    }

}
