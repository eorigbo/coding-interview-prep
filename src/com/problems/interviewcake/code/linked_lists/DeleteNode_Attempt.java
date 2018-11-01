package com.problems.interviewcake.code.linked_lists;

public class DeleteNode_Attempt {
    public static void deleteNode(LinkedListNode midNode){
        LinkedListNode currNode = midNode;
        if(currNode.next != null){
            currNode.value = currNode.next.value;
            currNode.next = currNode.next.next;
        }else{
            throw new IllegalArgumentException("Cannot delete the last element in a node.");
        }
    }
}
