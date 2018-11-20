package com.problems.ctci.ch2_linked_lists.q7_intersection;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class FindIntersectionLinkedListsAttempt {
    public static LinkedListNode findIntersection(LinkedListNode node1, LinkedListNode node2){
        //initialize tailAndLength and get for each node
        TailAndLength tailAndLength1 = getTailAndLength(node1);
        TailAndLength tailAndLength2 = getTailAndLength(node2);

        //if tails are not equal return null as there is no intersection
        if(node1 == null || node2 == null || tailAndLength1.tail != tailAndLength2.tail) return null;

        //find difference in lengths and move longer node the difference in length
        int lengthDiff = Math.abs(tailAndLength1.length - tailAndLength2.length);
        LinkedListNode longNode = tailAndLength1.length > tailAndLength2.length ? node1 : node2;
        LinkedListNode shortNode = tailAndLength1.length > tailAndLength2.length ? node2: node1;

        for(int i = 0; i < lengthDiff; i++) longNode = longNode.next;

        //move both nodes until they are the same then return
        while(longNode != shortNode){
            longNode = longNode.next;
            shortNode = shortNode.next;
        }
        return shortNode;
    }

    private static class TailAndLength{
        LinkedListNode tail;
        int length;
        TailAndLength(LinkedListNode tail, int length){
            this.tail = tail;
            this.length = length;
        }
    }

    private static TailAndLength getTailAndLength(LinkedListNode rootNode){
        if(rootNode == null) return null;

        int length = 1;
        while(rootNode != null){
            rootNode = rootNode.next;
            length++;
        }
        return new TailAndLength(rootNode, length);
    }
}
