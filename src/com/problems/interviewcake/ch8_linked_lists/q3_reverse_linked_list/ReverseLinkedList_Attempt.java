package com.problems.interviewcake.ch8_linked_lists.q3_reverse_linked_list;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;

public class ReverseLinkedList_Attempt {

    public static LinkedListNode reverse(LinkedListNode rootNode){
        LinkedListNode currNode = rootNode;
        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;

        while(currNode != null){
            nextNode = currNode.next;

            currNode.next = previousNode;

            previousNode = currNode;
            currNode = nextNode;
        }
        return previousNode;
    }
}
