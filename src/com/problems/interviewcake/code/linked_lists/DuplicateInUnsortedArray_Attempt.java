package com.problems.interviewcake.code.linked_lists;

public class DuplicateInUnsortedArray_Attempt {
    public static int findDuplicate(int[] arr){
        int positionInCycle = arr.length;
        int n = arr.length - 1;

        //get into cycle
        for(int i = 0; i < n; i++) positionInCycle = arr[positionInCycle - 1];

        //find cycle length
        int pinPositionInCycle = positionInCycle;
        int currentPositionInCycle = arr[positionInCycle - 1];
        int cycleLength = 1;

        while(currentPositionInCycle != pinPositionInCycle){
            currentPositionInCycle = arr[currentPositionInCycle - 1];
            cycleLength++;
        }

        //move frontPointer ahead of backPointer by cycle length
        int frontPointer = arr.length;
        int backPointer = arr.length;

        for(int i = 0; i < cycleLength; i++) frontPointer = arr[frontPointer - 1];

        //find starting point of cycle by moving front and back pointers
        while(frontPointer != backPointer){
            frontPointer = arr[frontPointer - 1];
            backPointer = arr[backPointer - 1];
        }
        return backPointer;
    }
}
