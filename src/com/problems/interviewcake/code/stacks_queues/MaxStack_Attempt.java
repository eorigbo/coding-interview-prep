package com.problems.interviewcake.code.stacks_queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxStack_Attempt{

        Deque<Integer> stack;
        Deque<Integer> maxStack;

        public MaxStack_Attempt(){
            stack = new ArrayDeque<>();
            maxStack = new ArrayDeque<>();
        }

        public void push(int n){
            if(maxStack.isEmpty() || maxStack.peek() <= n) maxStack.push(n);
            stack.push(n);
        }

        public int pop(){
            int popped = stack.pop();
            if(popped == maxStack.peek()) maxStack.pop();
            return popped;
        }

        public int getMax(){
            return maxStack.peek();
        }

}
