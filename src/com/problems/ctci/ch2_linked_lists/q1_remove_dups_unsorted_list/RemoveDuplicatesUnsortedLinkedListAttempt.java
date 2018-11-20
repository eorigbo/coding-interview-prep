package com.problems.ctci.ch2_linked_lists.q1_remove_dups_unsorted_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnsortedLinkedListAttempt {
    public static void deleteDups(LinkedListNode rootNode){
        //initialize currNode
        LinkedListNode currNode = rootNode;

        //loop through currNode
        while(currNode != null){
            //initialize runnerNode and loop through while runnerNode.next != null
            LinkedListNode runnerNode = currNode;
            while(runnerNode.next != null){
                //if runnerNode.next is same as currNode skip runnerNode.next
                if(runnerNode.next.value == currNode.value){//double check this comparison
                    runnerNode.next = runnerNode.next.next;
                }else{
                    //else runnerNode = runnerNode.next
                    runnerNode = runnerNode.next;
                }

            }
            //currNode = currNode.nxt
            currNode = currNode.next;
        }
    }
}
