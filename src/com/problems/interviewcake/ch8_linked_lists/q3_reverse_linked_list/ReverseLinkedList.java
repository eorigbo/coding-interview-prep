package com.problems.interviewcake.ch8_linked_lists.q3_reverse_linked_list;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;

public class ReverseLinkedList {
    public static LinkedListNode reverse(LinkedListNode node){
        LinkedListNode currentNode = node;
        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;

        while(currentNode != null){
            //save the next node before swapping
            nextNode = currentNode.next;

            //Point next node backwards
            currentNode.next = previousNode;

            //move forward
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
