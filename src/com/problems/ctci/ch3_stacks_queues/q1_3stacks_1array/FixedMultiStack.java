package com.problems.ctci.ch3_stacks_queues.q1_3stacks_1array;

import java.util.EmptyStackException;

public class FixedMultiStack {
    public final int numStacks = 3;
    private int stackCapacity;
    private int[] stacksCurrSize; //number of elements in that stack
    private int[] stacksData; // actual array containing the 3 stacks

    public FixedMultiStack(int stackCapacity){
        this.stackCapacity = stackCapacity;
        stacksData = new int[stackCapacity * numStacks];
        stacksCurrSize = new int[numStacks];
    }

    public void push(int stackNum, int value) throws FullStackException{
        validateStackNum( stackNum);

        if(stacksCurrSize[stackNum] == stackCapacity ) {
            throw new FullStackException(String.format("Stack number %d is full.", stackNum));
        }

        stacksCurrSize[stackNum]++;
        stacksData[getNextIndex(stackNum)] = value;
    }

    public int pop(int stackNum){
        validateStackNum( stackNum);

        if(stacksCurrSize[stackNum] == 0) throw new EmptyStackException();
        int topIndex = getNextIndex(stackNum);
        int stackValue = stacksData[topIndex];//get value at top of stack
        stacksData[topIndex] = 0; //clear top of stack
        stacksCurrSize[stackNum]--; //shrink stack
        return stackValue;
    }

    public int peek(int stackNum){
        validateStackNum( stackNum);

        if(stacksCurrSize[stackNum] == 0) throw new EmptyStackException();
        int topIndex = getNextIndex(stackNum);
        return stacksData[topIndex];
    }

    private int getNextIndex(int stackNum) {
        validateStackNum( stackNum);
        int offset = stackNum * stackCapacity;
        int currSize = stacksCurrSize[stackNum];
        return offset + currSize - 1;
    }

    private void validateStackNum(int stackNum){
        if(stackNum >= numStacks) throw new IllegalArgumentException(String.format("stackNum can only be between 0 and %d.",numStacks - 1));
    }

    public int[] getStackValues(){
        return stacksData;
    }
}
