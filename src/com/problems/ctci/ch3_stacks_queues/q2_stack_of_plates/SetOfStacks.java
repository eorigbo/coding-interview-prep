package com.problems.ctci.ch3_stacks_queues.q2_stack_of_plates;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SetOfStacks {
    List<MyStack> stackList;
    int stackCapacity;

    public SetOfStacks(int stackCapacity){
        stackList = new ArrayList<>();
        this.stackCapacity = stackCapacity;
    }

    public void push(int value){
        MyStack currStack = getCurrentStack();
        if(currStack != null && !currStack.isFull()){
            currStack.push(value);
        }else{
            MyStack newStack = new MyStack(stackCapacity);
            newStack.push(value);
            stackList.add(newStack);
        }
    }

    private MyStack getCurrentStack() {
        int stackListSize = stackList.size();
        if(stackListSize == 0){
            return null;
        }else{
            return stackList.get(stackListSize - 1);
        }
    }


    public int getNumStacks() {
        return stackList.size();
    }

    public int pop() {
        MyStack currStack = getCurrentStack();
        if(currStack == null){
            throw new EmptyStackException();
        }

        int value = currStack.pop();
        if(currStack.isEmpty()){
            stackList.remove(currStack);
        }
        return value;
    }

    public int peek() {
        MyStack currStack = getCurrentStack();
        if(currStack == null){
            throw new EmptyStackException();
        }
        return currStack.peek();
    }
}
