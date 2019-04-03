package com.problems.interviewcake.code.linked_lists;

public class KthToLastNode_Attempt {
    public static LinkedListNode kthToLastNode(int k, LinkedListNode head){
        LinkedListNode currNode = head;

        if(k < 1) throw new IllegalArgumentException("K cannot be less than 1.");

        //get listLength and subtract k
        int cycleLength = 0;

        while(currNode != null){
            currNode = currNode.next;
            cycleLength++;
        }

        if(k > cycleLength) throw new IllegalArgumentException("K cannot be greater than list length.");

        int stepsToMove = cycleLength - k;

        //move to that position
        currNode = head;
        for(int i = 1; i <= stepsToMove; i++) currNode = currNode.next;

        return currNode;
    }
}
