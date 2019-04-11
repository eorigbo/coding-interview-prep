package com.problems.interviewcake.ch8_linked_lists.q5_duplicate_unsorted_array;

public class DuplicateInUnsortedArray {
    public static int findDuplicate(int[] intArray){
        //Step 1: Get inside a cycle
        //start at position n+1 and walk n steps to be in cycle
        int n = intArray.length - 1;
        int positionInCycle = intArray.length;

        for(int i = 0; i < n; i++) positionInCycle = intArray[positionInCycle - 1];

        //Step 2: Find the length of the cycle
        //remember a position and count the steps it takes to get back there
        int rememberedPositionInCycle = positionInCycle;

        //move one step ahead
        int currentPositionInCycle = intArray[positionInCycle - 1];
        int cycleStepCount = 1;

        //find cycle length
        while(currentPositionInCycle != rememberedPositionInCycle){
            currentPositionInCycle = intArray[currentPositionInCycle - 1];
            cycleStepCount += 1;
        }

        //find first node of the cycle using stick method
        //start 2 pointers at n+1 and ahead of n+1 as many steps as the cycle's length
        int pointerStart = intArray.length;
        int pointerAhead = intArray.length;

        for(int i = 0; i < cycleStepCount; i++) pointerAhead = intArray[pointerAhead - 1];

        //advance until pointers are in the same position
        while(pointerStart != pointerAhead){
            pointerAhead = intArray[pointerAhead - 1];
            pointerStart = intArray[pointerStart - 1];
        }

        return pointerStart;
    }
}
