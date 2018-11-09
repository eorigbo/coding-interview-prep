package com.problems.ctci.ch2_linked_lists.q5_sum_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class SumLinkedList {
    public static LinkedListNode sum(LinkedListNode firstNodeList, LinkedListNode secondNodeList) {
        //reverse both LinkedLists
        LinkedListNode reversedFirstNodeList = reverse(firstNodeList);
        LinkedListNode reversedSecondNodeList = reverse(secondNodeList);

        //sum the values in the LinkedList
        LinkedListNode reversedSumList = sumLists(reversedFirstNodeList, reversedSecondNodeList);

        //reverse the list to get the actual sum
        LinkedListNode sumList = reverse(reversedSumList);

        return sumList;
    }

    private static LinkedListNode reverse(LinkedListNode rootNode){
        LinkedListNode currNode = rootNode;
        LinkedListNode previousNode = null;
        LinkedListNode nextNode = null;

        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = previousNode;
            previousNode = currNode;
            currNode = nextNode;
        }
        return previousNode;
    }

    private static LinkedListNode sumLists(LinkedListNode firstNode, LinkedListNode secondNode){
        PartialSum partialSum = new PartialSum();
        HeadAndTailNodes headAndTailNodes = new HeadAndTailNodes();

        //loop through both nodes as they should have the same length
        while(firstNode != null || secondNode != null || partialSum.carry > 0){
            //Add values of first and second node, and carry
            partialSum = addValues(firstNode, secondNode, partialSum.carry);

            //add to Linked List
            headAndTailNodes = addToLinkedList(headAndTailNodes, partialSum.sum);

            if(firstNode != null) firstNode = firstNode.next;
            if(secondNode != null) secondNode = secondNode.next;
        }
        return headAndTailNodes.headNode;
    }

    private static HeadAndTailNodes addToLinkedList(HeadAndTailNodes headAndTailNodes, int sum){
        if(headAndTailNodes.headNode == null){
            headAndTailNodes.headNode = new LinkedListNode(sum);
            headAndTailNodes.tailNode = headAndTailNodes.headNode;
        }else {
            LinkedListNode sumNode = new LinkedListNode(sum);
            headAndTailNodes.tailNode.next = sumNode;
            headAndTailNodes.tailNode = sumNode;
        }
        return headAndTailNodes;
    }

    private static PartialSum addValues(LinkedListNode firstNode, LinkedListNode secondNode, int carry){
        PartialSum partialSum = new PartialSum();
        int firstNodeValue;
        int secondNodeValue;

        if(firstNode == null) firstNodeValue = 0;
        else firstNodeValue = firstNode.value;

        if(secondNode == null) secondNodeValue = 0;
        else secondNodeValue = secondNode.value;

        partialSum.sum = carry + firstNodeValue + secondNodeValue;

        if(partialSum.sum > 9){
            partialSum.sum = partialSum.sum - 10;
            partialSum.carry = 1;
        }else{
            partialSum.carry = 0;
        }

        return partialSum;
    }
}
