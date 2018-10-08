package com.problems.interviewcake.code.linked_lists;

public class DuplicateInUnsortedArray_Attempt {
    public static int findDuplicate(int[] arr){
        //get inside cycle
        int positionInCycle = arr.length;
        int n = arr.length - 1;

        for(int i = 0; i < n; i++) positionInCycle = arr[positionInCycle - 1];

        //find length of cycle
        int rememberedPositionInCycle = positionInCycle;

        int currentPositionInCycle = arr[positionInCycle - 1];
        int cycleLength = 1;

        while(rememberedPositionInCycle != currentPositionInCycle){
            currentPositionInCycle = arr[currentPositionInCycle - 1];
            cycleLength ++;
        }

        //move pointerAhead to cycle length
        int pointerAhead = arr.length;
        int pointerBehind = arr.length;

        for(int i = 0; i < cycleLength; i++) pointerAhead = arr[pointerAhead - 1];

        //find start of cycle and return
        while(pointerAhead != pointerBehind){
            pointerAhead = arr[pointerAhead - 1];
            pointerBehind = arr[pointerBehind - 1];
        }

        return pointerBehind;
    }
}
