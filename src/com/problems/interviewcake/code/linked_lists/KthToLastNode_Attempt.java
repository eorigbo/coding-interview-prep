package com.problems.interviewcake.code.linked_lists;

public class KthToLastNode_Attempt {
    public static LinkedListNode kthToLastNode( int k, LinkedListNode head){
        LinkedListNode aheadNode = head;
        LinkedListNode behindNode = head;

        //move aheadNode k - 1 times
        for(int i = 1; i < k; i++){
            if(aheadNode.next != null){
                aheadNode = aheadNode.next;
            }else{
                throw new IllegalArgumentException("K is greater than array length");
            }
        }

        //keep moving until you get to the end of the list
        while(aheadNode.next != null){
            aheadNode = aheadNode.next;
            behindNode = behindNode.next;
        }
        return behindNode;
    }
}
