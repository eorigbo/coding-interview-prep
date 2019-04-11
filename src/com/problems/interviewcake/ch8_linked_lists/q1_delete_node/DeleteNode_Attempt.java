package com.problems.interviewcake.ch8_linked_lists.q1_delete_node;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;

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
