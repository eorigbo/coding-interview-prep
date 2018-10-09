package com.problems.interviewcake.code.linked_lists;

public class DuplicateInUnsortedArray_Attempt {
    public static int findDuplicate(int[] arr){
        //Get inside cycle by moving n steps
        int positionInCycle = arr.length;
        int n = arr.length - 1;

        for(int i = 0; i < n; i++) positionInCycle = arr[positionInCycle - 1];

        //Find Cycle length by picking a spot and moving until you get back to it
        int rememberedPositionInCycle = positionInCycle;

        int currentPositionInCycle = arr[positionInCycle - 1];
        int cycleLength = 1;

        while(rememberedPositionInCycle != currentPositionInCycle){
            currentPositionInCycle = arr[currentPositionInCycle - 1];
            cycleLength++;
        }

        //Find beginning of cycle which is your duplicate by moving first pointer cycle length steps, and then continuing until first pointer == second
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
