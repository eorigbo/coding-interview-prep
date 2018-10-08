package com.problems.interviewcake.code.linked_lists;

public class CyclicalLinkedListCheck_Attempt {
    public static boolean containsCycle(LinkedListNode node){

        LinkedListNode fastRunner = node;
        LinkedListNode slowRunner = node;

        while(fastRunner != null && fastRunner.next!= null){
            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;

            if(fastRunner == slowRunner) return true;
        }
        return false;
    }
}
