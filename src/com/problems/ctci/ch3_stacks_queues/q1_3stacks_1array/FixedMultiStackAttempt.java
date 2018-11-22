package com.problems.ctci.ch3_stacks_queues.q1_3stacks_1array;

import java.util.EmptyStackException;

public class FixedMultiStackAttempt {
    int[] stacksCurrIndex;
    int[] stacksData;
    final int numStacks = 3;
    int stackCapacity;

    public FixedMultiStackAttempt(int stackCapacity){
        this.stackCapacity = stackCapacity;
        stacksData = new int[stackCapacity * numStacks];
        stacksCurrIndex = new int[numStacks];
    }

    public int pop(int stackNum){
        int value = peek(stackNum);
        int nextIndex = getNextIndex(stackNum, stacksCurrIndex[stackNum]);
        stacksData[nextIndex] = 0;
        stacksCurrIndex[stackNum]--;
        return value;
    }

    public int peek(int stackNum){
        validateStackNum(stackNum);
        if(stacksCurrIndex[stackNum] == 0) throw new EmptyStackException();
        int nextIndex = getNextIndex(stackNum, stacksCurrIndex[stackNum]);
        int value = stacksData[nextIndex];
        return value;
    }

    public void push(int stackNum, int value) throws FullStackException{
        validateStackNum(stackNum);
        if(stacksCurrIndex[stackNum] >= stackCapacity) throw new FullStackException(String.format("Stack %d is full.",stackNum));
        stacksCurrIndex[stackNum]++;
        int nextIndex = getNextIndex(stackNum, stacksCurrIndex[stackNum]);
        stacksData[nextIndex] = value;
    }

    public void validateStackNum(int stackNum){
        if(stackNum >= numStacks) throw new IllegalArgumentException(String.format("stackNum must be a number between 0 and %d.", numStacks - 1));
    }

    public int getNextIndex(int stackNum, int stacksCurrIndex){
        int offset = stackNum * stackCapacity;
        int index = offset + stacksCurrIndex - 1;
        return index;
    }

    public static class FullStackException extends Exception{
        FullStackException(){
            super();
        }

        FullStackException(String message){
            super(message);
        }
    }

    public int[] getStackValues(){
        return stacksData;
    }

}

