package com.problems.interviewcake.code.linked_lists;

public class KthToLastNode_Attempt {
    public static LinkedListNode kthToLastNode(int k, LinkedListNode node){

        //List length approach
        if(k < 1) throw new IllegalArgumentException("K cannot be less than 1.");

        int listLength = 1;
        LinkedListNode currentNode = node;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
            listLength ++;
        }
        if(k > listLength) throw new IllegalArgumentException("K cannot be greater than list length");

        int waysToGo = listLength - k;
        currentNode = node;

        for(int i = 0; i < waysToGo; i++) currentNode = currentNode.next;

        return currentNode;

    }
}
