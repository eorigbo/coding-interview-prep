package com.problems.interviewcake.code.linked_lists;

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
