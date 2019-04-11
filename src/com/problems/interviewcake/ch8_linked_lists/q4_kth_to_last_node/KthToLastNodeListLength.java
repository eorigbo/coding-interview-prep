package com.problems.interviewcake.ch8_linked_lists.q4_kth_to_last_node;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;

public class KthToLastNodeListLength {
    public static LinkedListNode kthToLastNode(int k, LinkedListNode head){
        if(k < 1) throw new IllegalArgumentException("K needs to be greater than or equal to 1.");

        //get the length of the list
        int listLength = 1;
        LinkedListNode currentNode = head;

        while(currentNode.next != null){
            currentNode = currentNode.next;
            listLength += 1;
        }

        if(k > listLength) throw new IllegalArgumentException("K has to be less than the length of the linked list.");

        int howFarToGo = listLength - k;
        currentNode = head;

        for(int i=0; i < howFarToGo; i++) currentNode = currentNode.next;

        return currentNode;

    }
}
