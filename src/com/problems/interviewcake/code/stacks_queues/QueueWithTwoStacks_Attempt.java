package com.problems.interviewcake.code.stacks_queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueWithTwoStacks_Attempt{
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public QueueWithTwoStacks_Attempt(){
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void enqueue(int item){
        inStack.push(item);
    }

    public int dequeue(){
        if(!outStack.isEmpty()){
            return outStack.pop();
        }else{
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }

            if(outStack.isEmpty()){
                throw new RuntimeException("Nothing to dequeue from outStack.");
            }else{
                return outStack.pop();
            }
        }
    }
}