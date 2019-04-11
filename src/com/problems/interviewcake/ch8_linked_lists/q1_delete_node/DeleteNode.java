package com.problems.interviewcake.ch8_linked_lists.q1_delete_node;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;

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
