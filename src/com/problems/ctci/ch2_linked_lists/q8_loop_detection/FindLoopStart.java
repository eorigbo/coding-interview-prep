package com.problems.ctci.ch2_linked_lists.q8_loop_detection;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class FindLoopStart {
    public static LinkedListNode findLoopStart(LinkedListNode rootNode) {
        LinkedListNode fastNode = rootNode;
        LinkedListNode slowNode = rootNode;

        //find the loop
        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if(slowNode == fastNode)break;
        }

        //check if there is no loop
        if(fastNode == null || fastNode.next == null) return null;

        //Move slow to head and keep fast at current position
        //Each are k steps from the loop start so if they move
        //at the same pace they must meet at loop start
        slowNode = rootNode;

        while(slowNode != fastNode){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        return slowNode;
    }
}
