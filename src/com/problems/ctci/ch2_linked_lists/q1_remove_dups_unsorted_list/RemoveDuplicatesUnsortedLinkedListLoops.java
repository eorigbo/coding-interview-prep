package com.problems.ctci.ch2_linked_lists.q1_remove_dups_unsorted_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class RemoveDuplicatesUnsortedLinkedListLoops {
    public static void deleteDups(LinkedListNode headNode) {
        LinkedListNode currNode = headNode;
        while (currNode != null) {
            /* Remove all future nodes that have the same value */
            LinkedListNode runner = currNode;
            while (runner.next != null) {
                if (runner.next.value == currNode.value) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            currNode = currNode.next;
        }
    }
}
