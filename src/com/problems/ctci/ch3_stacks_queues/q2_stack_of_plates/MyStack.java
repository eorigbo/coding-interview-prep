package com.problems.ctci.ch3_stacks_queues.q2_stack_of_plates;

import com.problems.ctci.ch3_stacks_queues.q1_3stacks_1array.FullStackException;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {
    private Deque<Integer> stack;
    private int stackCapacity;
    private int stackSize;

    public MyStack(int stackCapacity){
        stack = new ArrayDeque<>();
        stackSize = 0;
        this.stackCapacity = stackCapacity;
    }

    public boolean push(int value){
        if(!isFull()){
            stack.push(value);
            stackSize++;
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull() {
        return stackSize == stackCapacity;
    }

    public boolean isEmpty(){
        return stackSize == 0;
    }

    public int pop() {
        int value = stack.pop();
        stackSize--;
        return value;
    }

    public int peek() {
        return stack.peek();
    }
}
