package com.problems.ctci.ch2_linked_lists.q7_intersection;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class FindIntersectionLinkedLists {
    private static class TailAndLength{
        LinkedListNode tailNode;
        int listLength;

        TailAndLength(){
            tailNode = null;
            listLength = 0;
        }
    }

    public static LinkedListNode findIntersection(LinkedListNode node1, LinkedListNode node2) {
        //if either node is null return null as no intersection
        if(node1 == null || node2 == null) return null;

        //find tail and length
        TailAndLength tailAndLength1 = getTailAndLength(node1);
        TailAndLength tailAndLength2 = getTailAndLength(node2);

        //if tails are not equal, there is no intersection so return null
        if(tailAndLength1.tailNode != tailAndLength2.tailNode) return null;

        //Initialize longer and shorter nodes based on which list is longer
        LinkedListNode longNode = tailAndLength1.listLength > tailAndLength2.listLength ? node1 : node2;
        LinkedListNode shortNode = tailAndLength1.listLength > tailAndLength2.listLength ? node2 : node1;

        //Move the longer node the difference in length between nodes
        // so both nodes start the same distance away from the intersection
        longNode = getKthNode(longNode,Math.abs(tailAndLength1.listLength - tailAndLength2.listLength));

        //keep moving both nodes until they are equal then return either one
        while(longNode != shortNode){
            longNode = longNode.next;
            shortNode = shortNode.next;
        }
        return shortNode;

    }

    private static LinkedListNode getKthNode(LinkedListNode rootNode, int k) {
        if(rootNode == null) return rootNode;

        for(int i=0; i < k; i++) rootNode = rootNode.next;

        return rootNode;
    }

    private static TailAndLength getTailAndLength(LinkedListNode rootNode) {
        TailAndLength tailAndLength = new TailAndLength();
        if(rootNode == null) return tailAndLength;

        while(rootNode != null){
            rootNode = rootNode.next;
            tailAndLength.listLength++;
        }
        tailAndLength.tailNode = rootNode;
        return tailAndLength;
    }
}

