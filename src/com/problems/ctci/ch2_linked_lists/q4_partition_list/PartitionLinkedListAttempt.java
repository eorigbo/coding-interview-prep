package com.problems.ctci.ch2_linked_lists.q4_partition_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class PartitionLinkedListAttempt {
    public static LinkedListNode partition(LinkedListNode rootNode, int target){
        //initialize beforeStart, beforeEnd, afterStart, afterEnd, currNode
        LinkedListNode currNode = rootNode, beforeStart = null, beforeEnd = null, afterStart = null, afterEnd = null, nextNode = null;

        //while currNode is not null
        while(currNode != null){
            //store nextNode and clear currNode.next
            nextNode = currNode.next;
            currNode.next = null;

            //if currNode value < target
            if(currNode.value < target){
                //if beforeStart is null assign to it, else assign to beforeEnd
                if(beforeStart == null){
                    beforeStart = currNode;
                    beforeEnd = beforeStart;
                }else{
                    beforeEnd.next = currNode;
                    beforeEnd = currNode;
                }
                //else
            }else{
                //if afterStart is null assign to it, else assign to afterEnd
                if(afterStart == null){
                    afterStart = currNode;
                    afterEnd = afterStart;
                }else{
                    afterEnd.next = currNode;
                    afterEnd = currNode;
                }

            }

            //increment currNode
            currNode = nextNode;
        }

        //if beforeEnd is null return afterStart, else tie two halves together and return
        if(beforeEnd == null){
            return afterStart;
        }else{
            beforeEnd.next = afterStart;
            return beforeStart;
        }
    }
}
