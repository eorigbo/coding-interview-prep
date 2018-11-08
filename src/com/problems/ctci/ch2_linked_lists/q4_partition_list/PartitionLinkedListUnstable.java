package com.problems.ctci.ch2_linked_lists.q4_partition_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class PartitionLinkedListUnstable {
    public static LinkedListNode partition(LinkedListNode rootNode, int x) {
        LinkedListNode headNode = rootNode;
        LinkedListNode tailNode = rootNode;
        LinkedListNode currNode = rootNode;
        //int count=0;
        /* Partition list */
        while (currNode != null) {
            LinkedListNode nextNode = currNode.next;
            if (currNode.value < x) {
                /* Insert node at leftmost part of headNode. */
                currNode.next = headNode;
                headNode = currNode;
            } else {
                /* Insert node at tail. */
                tailNode.next = currNode;
                tailNode = currNode;
            }
            currNode = nextNode;
            //count++;
            //System.out.println("Iteration" + count);
        }
        tailNode.next = null;

        return headNode;
    }
}
