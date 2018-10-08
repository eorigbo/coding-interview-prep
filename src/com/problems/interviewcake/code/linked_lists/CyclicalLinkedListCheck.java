package com.problems.interviewcake.code.linked_lists;

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
