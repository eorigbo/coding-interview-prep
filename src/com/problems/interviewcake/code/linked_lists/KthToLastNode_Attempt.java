package com.problems.interviewcake.code.linked_lists;

public class KthToLastNode_Attempt {
    public static LinkedListNode kthToLastNode(int k, LinkedListNode node){
        if(k < 1) throw new IllegalArgumentException("K cannot be less than 1.");
        //move nodeAhead k times from beginning
        LinkedListNode nodeAhead = node;
        LinkedListNode nodeBehind = node;

        for(int i = 0; i < k - 1; i++){
            if(nodeAhead.next == null) throw new IllegalArgumentException("K cannot be greater than the list length.");
            nodeAhead = nodeAhead.next;
        }

        while(nodeAhead.next != null){
            nodeAhead = nodeAhead.next;
            nodeBehind = nodeBehind.next;
        }

        return nodeBehind;
    }
}
