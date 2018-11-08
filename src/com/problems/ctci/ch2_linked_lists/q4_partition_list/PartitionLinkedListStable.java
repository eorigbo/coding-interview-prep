package com.problems.ctci.ch2_linked_lists.q4_partition_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class PartitionLinkedListStable {
    public static LinkedListNode partition(LinkedListNode rootNode, int x) {
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;
        LinkedListNode currNode = rootNode;

        /* Partition list */
        while (currNode != null) {
            LinkedListNode nextNode = currNode.next;
            //clear out next value for currNode so we work on one at a time
            currNode.next = null;
            if (currNode.value < x) {
                if (beforeStart == null) {
                    //we now have a beforeStart, so subsequent additions should be added to beforeEnd
                    beforeStart = currNode;
                    //add beforeStart to beforeEnd, so we now have the same node in beforeEnd that we can keep extending
                    beforeEnd = beforeStart;
                } else {
                    //insert currNode in the upper tail called beforeEnd
                    beforeEnd.next = currNode;
                    beforeEnd = currNode;
                }
            } else {
                if (afterStart == null) {
                    //we now have an afterStart, so subsequent additions should be added to afterEnd
                    afterStart = currNode;
                    //add afterStart to afterEnd, so we now have the same node in afterEnd that we can keep extending
                    afterEnd = afterStart;
                } else {
                    //insert currNode in the lower tail called afterEnd
                    afterEnd.next = currNode;
                    afterEnd = currNode;
                }
            }
            currNode = nextNode;
        }

        /* Merge before list and after list */
        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
