package com.problems.interviewcake.ch7_stacks_queues.q2_queue_with_two_stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueWithTwoStacks {
    private Deque<Integer> inStack = new ArrayDeque<>();
    private Deque<Integer> outStack = new ArrayDeque<>();

    public void enqueue(int item){
        inStack.push(item);
    }

    public int dequeue(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                int item = inStack.pop();
                outStack.push(item);
            }

            if(outStack.isEmpty()) throw new NoSuchElementException("No items to dequeue.");
        }
        return outStack.pop();
    }
}
