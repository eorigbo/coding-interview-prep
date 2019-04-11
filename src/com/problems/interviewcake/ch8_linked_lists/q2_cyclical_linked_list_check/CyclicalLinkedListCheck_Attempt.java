package com.problems.interviewcake.ch8_linked_lists.q2_cyclical_linked_list_check;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;

public class CyclicalLinkedListCheck_Attempt {
    public static boolean containsCycle(LinkedListNode rootNode){
        LinkedListNode fastNode = rootNode;
        LinkedListNode slowNode = rootNode;

        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if(fastNode == slowNode) return true;
        }

        return false;
    }
}
