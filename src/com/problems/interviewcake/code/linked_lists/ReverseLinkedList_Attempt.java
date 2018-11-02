package com.problems.interviewcake.code.linked_lists;

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
