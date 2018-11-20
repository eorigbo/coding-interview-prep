package com.problems.ctci.ch2_linked_lists.q8_loop_detection;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class FindLoopStartAttempt {
    public static LinkedListNode findLoopStart(LinkedListNode rootNode){
        //find the middle using fastNode
        LinkedListNode fastNode = rootNode;
        LinkedListNode slowNode = rootNode;

        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if(fastNode == slowNode) break;
        }

        //check if there is a loop
        if(fastNode == null || fastNode.next == null) return null;

        //move slowNode to beginning and move until they meet and return start node
        slowNode = rootNode;

        while(fastNode != slowNode){
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        return slowNode;
    }
}
