package com.problems.interviewcake.ch8_linked_lists.q2_cyclical_linked_list_check;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;

public class CyclicalLinkedListCheck {
    public static boolean containsCycle(LinkedListNode node){
        LinkedListNode slowRunner = node;
        LinkedListNode fastRunner = node;

        while(fastRunner != null && fastRunner.next != null){
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
            if(slowRunner  == fastRunner) return true;
        }

        return false;
    }
}
