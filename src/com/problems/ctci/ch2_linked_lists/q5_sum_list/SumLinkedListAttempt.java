package com.problems.ctci.ch2_linked_lists.q5_sum_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class SumLinkedListAttempt {
    public static LinkedListNode sum(LinkedListNode node1, LinkedListNode node2){
        //reverse both nodes
        LinkedListNode reversedNode1 = reverse(node1);
        LinkedListNode reversedNode2 = reverse(node2);

        //get reversed sum by call to addNodeValues
        LinkedListNode reversedSum = addNodeValues(reversedNode1, reversedNode2);

        //reverse sum and return
        LinkedListNode sum = reverse(reversedSum);
        return sum;

        //what is the big o notation
    }

    private static LinkedListNode reverse(LinkedListNode rootNode){
        LinkedListNode currNode = rootNode, prevNode = null, nextNode = null;
        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    private static LinkedListNode addNodeValues(LinkedListNode node1, LinkedListNode node2){
        //initialize PartialSum class containing sum and carry
        //Initialize HeadAndTailNodes class
        PartialSum partialSum = new PartialSum();
        HeadAndTail headAndTail = new HeadAndTail();

        //while either node is not null or carry > 0
        while(node1 != null || node2 != null || partialSum.carry > 0){
            //calculate sum via call to addValues. Return partialSum
            partialSum = addValues(node1, node2, partialSum.carry);

            //add to headAndTailNode. return head and tailNode
            headAndTail = addSumToList(partialSum.sum, headAndTail);

            //increment nodes if they are not null
            if(node1 != null) node1 = node1.next;
            if(node2 != null) node2 = node2.next;
        }

        //return headNode
        return headAndTail.headNode;
    }

    private static class PartialSum{
        int sum;
        int carry;
        PartialSum(){
            sum = 0;
            carry = 0;
        }
    }

    private static class HeadAndTail{
        LinkedListNode headNode, tailNode;
        HeadAndTail(){
            headNode = null;
            tailNode = null;
        }
    }

    private static PartialSum addValues(LinkedListNode node1, LinkedListNode node2, int carry){
        int firstNodeValue = node1 == null ? 0 : node1.value;
        int secondNodeValue = node2 == null ? 0 : node2.value;

        PartialSum partialSum = new PartialSum();
        partialSum.sum  = firstNodeValue + secondNodeValue + carry;

        if(partialSum.sum > 9){
            partialSum.sum = partialSum.sum - 10;
            partialSum.carry = 1;
        }else{
            partialSum.carry = 0;
        }
        return partialSum;

    }

    private static HeadAndTail addSumToList(int sum, HeadAndTail headAndTail){
        if(headAndTail.headNode == null){
            headAndTail.headNode = new LinkedListNode(sum);
            headAndTail.tailNode = headAndTail.headNode;
        }else{
            headAndTail.tailNode.next = new LinkedListNode(sum);
            headAndTail.tailNode = headAndTail.tailNode.next;
        }

        return headAndTail;
    }


}
