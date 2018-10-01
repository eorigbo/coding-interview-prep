package com.problems.interviewcake.code.linked_lists;

public class DeleteNode {
    public static void deleteNode(LinkedListNode nodeToDelete){
        LinkedListNode nextNode = nodeToDelete.next;
        if(nextNode != null){
            nodeToDelete.value = nextNode.value;
            nodeToDelete.next = nextNode.next;
        }else{
            throw new IllegalArgumentException("Can't delete last node with this technique.");
        }
    }
}
