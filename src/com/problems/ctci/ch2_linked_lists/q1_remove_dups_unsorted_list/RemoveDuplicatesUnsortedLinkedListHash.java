package com.problems.ctci.ch2_linked_lists.q1_remove_dups_unsorted_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

import java.util.HashSet;

public class RemoveDuplicatesUnsortedLinkedListHash {
    public static void deleteDups(LinkedListNode headNode) {
        HashSet<Integer> uniqueNodes = new HashSet<>();
        LinkedListNode currNode = headNode;
        LinkedListNode previousNode = null;
        while (currNode != null) {
            if (uniqueNodes.contains(currNode.value)) {
                //skip the current node
                previousNode.next = currNode.next;
            } else {
                uniqueNodes.add(currNode.value);
                previousNode = currNode;
            }
            currNode = currNode.next;
        }
    }
}
