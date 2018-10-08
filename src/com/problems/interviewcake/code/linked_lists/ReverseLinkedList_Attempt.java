package com.problems.interviewcake.code.linked_lists;

public class ReverseLinkedList_Attempt {

    public static LinkedListNode reverse(LinkedListNode node){
        LinkedListNode currentNode = node;
        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.next;

            currentNode.next = previousNode;

            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }
}
