package com.problems.interviewcake.ch8_linked_lists.q4_kth_to_last_node;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;

public class KthToLastNodeStick {
    public static LinkedListNode kthToLastNode(int k, LinkedListNode head){
        if(k < 1) throw new IllegalArgumentException("K has to be greater than 1.");

        LinkedListNode leftNode = head;
        LinkedListNode rightNode = head;

        //move rightNode k times to the end of the stick (kth node)
        for(int i = 0; i < k-1; i++){
            if(rightNode.next == null) throw new IllegalArgumentException("K is larger than the length of the linked list");
            rightNode = rightNode.next;
        }

        while(rightNode.next != null){
            rightNode = rightNode.next;
            leftNode = leftNode.next;
        }
        return leftNode;
    }
}
