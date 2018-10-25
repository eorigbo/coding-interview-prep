package com.problems.interviewcake.code.linked_lists;

public class DuplicateInUnsortedArray_Attempt {
    public static int findDuplicate(int[] arr){
        //step 1: get inside the cycle by moving n steps from the head
        int positionInCycle = arr.length;
        int n = arr.length - 1;

        for(int i = 0; i < n; i++) positionInCycle = arr[positionInCycle - 1];

        //step 2: find the length of the cycle by setting a marker and moving until you return back to it.
        int rememberedPositionInCycle = positionInCycle;
        int currentPositionInCycle = arr[positionInCycle - 1];
        int cycleLength = 1;

        while(rememberedPositionInCycle != currentPositionInCycle){
            currentPositionInCycle = arr[currentPositionInCycle - 1];
            cycleLength++;
        }


        //step 3: find the beginning of the cycle by setting pointerAhead cycle length steps in front of pointerBehind, move both until they're equal
        int pointerAhead = arr.length;
        int pointerBehind = arr.length;

        for(int i = 0; i < cycleLength; i++) pointerAhead = arr[pointerAhead - 1];

        while(pointerAhead != pointerBehind){
            pointerAhead = arr[pointerAhead - 1];
            pointerBehind = arr[pointerBehind - 1];
        }

        return pointerBehind;
    }
}
