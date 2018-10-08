package com.problems.interviewcake.code.linked_lists;

public class DeleteNode_Attempt {
    public static void deleteNode(LinkedListNode node){
        LinkedListNode currentNode = node;

        if(currentNode.next == null){
            throw new IllegalArgumentException("Cannot delete the last node.");
        }else{
            currentNode.value = currentNode.next.value;
            currentNode.next = currentNode.next.next;
        }
    }
}
