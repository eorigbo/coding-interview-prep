package com.problems.ctci.ch2_linked_lists.q5_sum_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class SumLinkedList {
    public static LinkedListNode sum(LinkedListNode firstNodeList, LinkedListNode secondNodeList) {
        //reverse both LinkedLists
        LinkedListNode reversedFirstNodeList = reverse(firstNodeList);
        LinkedListNode reversedSecondNodeList = reverse(secondNodeList);

        //check lengths and add padding where necessary
        int firstListLength = getListLength(reversedFirstNodeList);
        int secondListLength = getListLength(reversedSecondNodeList);

        if(firstListLength > secondListLength){
            padList(reversedSecondNodeList, firstListLength - secondListLength);
        }else if (secondListLength > firstListLength){
            padList(reversedFirstNodeList, secondListLength - firstListLength);
        }

        //initialize sumList
        LinkedListNode reversedSumList = sumLists(reversedFirstNodeList, reversedSecondNodeList);

        //sum nodes in each list and add to sumList,
        LinkedListNode sumList = reverse(reversedSumList);

        return sumList;
    }

    //TODO: make private
    public static int getListLength(LinkedListNode rootNode) {
        LinkedListNode currNode = rootNode;
        if(currNode == null) return 0;

        int listLength = 1;
        while(currNode.next != null){
            currNode = currNode.next;
            listLength++;
        }
        return listLength;
    }
    //TODO: make private
    public static LinkedListNode reverse(LinkedListNode rootNode){
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
    //TODO: make private
    public static void padList(LinkedListNode rootNode, int numPads){
        //get to end of Node
        while(rootNode.next != null){
            rootNode = rootNode.next;
        }

        //add pads
        for(int i = 0; i < numPads; i++){
            LinkedListNode padNode = new LinkedListNode(0);
            rootNode.next = padNode;
            rootNode = rootNode.next;
        }
    }

    private static HeadAndTailNodes addToLinkedList(LinkedListNode headNode, LinkedListNode tailNode, int sum){
        if(headNode == null){
            headNode = new LinkedListNode(sum);
            tailNode = headNode;
        }else {
            LinkedListNode sumNode = new LinkedListNode(sum);
            tailNode.next = sumNode;
            tailNode = sumNode;
        }
        HeadAndTailNodes headAndTailNodes = new HeadAndTailNodes();
        headAndTailNodes.headNode = headNode;
        headAndTailNodes.tailNode = tailNode;

        return headAndTailNodes;
    }

    private static PartialSum addValues(LinkedListNode firstNode, LinkedListNode secondNode, int carry){
        PartialSum partialSum = new PartialSum();
        partialSum.sum = carry + firstNode.value + secondNode.value;
        if(partialSum.sum > 9){
            partialSum.sum = partialSum.sum - 10;
            partialSum.carry = 1;
        }else{
            partialSum.carry = 0;
        }
        return partialSum;
    }

    //TODO: make private
    public static LinkedListNode sumLists(LinkedListNode firstNode, LinkedListNode secondNode){
        int carry = 0;
        int sum = 0;
        LinkedListNode sumHeadNode = null;
        LinkedListNode sumTailNode = null;

        //loop through both nodes as they should have the same length
        while(firstNode != null && secondNode != null){
            //Add values of first and second node
            //Pay attention to if there was a carry from the previous addition
            //Update your sum and carry
            PartialSum partialSum = addValues(firstNode, secondNode, carry);
            sum = partialSum.sum;
            carry = partialSum.carry;

            //add to Linked List
            HeadAndTailNodes headAndTailNodes = addToLinkedList(sumHeadNode, sumTailNode, sum);
            sumHeadNode = headAndTailNodes.headNode;
            sumTailNode = headAndTailNodes.tailNode;

            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }

        //handle case of where nodes are null but carry isn't
        if(firstNode == null && secondNode == null && carry > 0){
            sum = carry;
            //Add to sum linked list and update headNode
            HeadAndTailNodes headAndTailNodes = addToLinkedList(sumHeadNode, sumTailNode, sum);
            sumHeadNode = headAndTailNodes.headNode;
        }

        return sumHeadNode;
    }
}
