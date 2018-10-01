package com.problems.interviewcake.code.stacks_queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueWithTwoStacks_Attempt{

        private Deque<Integer> inStack = new ArrayDeque<>();
        private Deque<Integer> outStack = new ArrayDeque<>();

        public void enqueue(int item){
            inStack.push(item);
        }

        public int dequeue(){
            if(outStack.isEmpty()){
                while(!inStack.isEmpty()) outStack.push(inStack.pop());
                if(outStack.isEmpty()) throw new RuntimeException("No element to dequeue.");
            }
            return outStack.pop();
        }


}
