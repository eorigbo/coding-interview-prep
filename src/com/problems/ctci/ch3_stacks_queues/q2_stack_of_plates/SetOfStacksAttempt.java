package com.problems.ctci.ch3_stacks_queues.q2_stack_of_plates;

import java.util.*;

public class SetOfStacksAttempt{
    //initialize property of arrayList<MyStack>
    List<MyStack> stackList;
    int stackCapacity;

    public SetOfStacksAttempt(int stackCapacity){
        stackList = new ArrayList<>();
        this.stackCapacity = stackCapacity;
    }

    public void push(int value){
        MyStack currStack = getCurrStack();
        if(currStack == null || currStack.isFull()){
            currStack = new MyStack(stackCapacity);
            currStack.push(value);
            stackList.add(currStack);
        }else{
            currStack.push(value);
        }
    }

    public int peek(){
        MyStack currStack = getCurrStack();
        if(currStack == null) throw new EmptyStackException();
        return currStack.peek();
    }

    public int pop(){
        MyStack currStack = getCurrStack();
        if(currStack == null) throw new EmptyStackException();
        int value = currStack.pop();
        if(currStack.isEmpty()){
            stackList.remove(currStack);
        }
        return value;
    }

    private MyStack getCurrStack(){
        if(stackList.size() == 0) return null;
        return stackList.get(stackList.size() - 1);
    }

    public int getNumStacks(){
        return stackList.size();
    }

    private class MyStack{
        Deque<Integer> stack;
        int currSize;
        int capacity;

        MyStack(int capacity){
            stack = new ArrayDeque<>();
            currSize = 0;
            this.capacity = capacity;
        }

        boolean isFull(){
            return currSize == capacity;
        }

        boolean isEmpty(){
            return currSize == 0;
        }

        void push(int value){
            stack.push(value);
            currSize++;
        }

        int peek(){
            return stack.peek();
        }

        int pop(){
            currSize--;
            return stack.pop();
        }
    }

}
