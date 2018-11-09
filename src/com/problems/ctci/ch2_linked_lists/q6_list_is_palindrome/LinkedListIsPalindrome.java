package com.problems.ctci.ch2_linked_lists.q6_list_is_palindrome;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LinkedListIsPalindrome {
    public static boolean isPalindrome(LinkedListNode linkedListNode){

        //add first half to stack
        Deque<LinkedListNode> reversedFirstHalf = new ArrayDeque<>();
        LinkedListNode fastNode = linkedListNode;
        LinkedListNode slowNode = linkedListNode;
        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            reversedFirstHalf.push(slowNode);
            slowNode = slowNode.next;
        }

        //check if list length is odd or even and adjust accordingly
        if(fastNode != null) slowNode = slowNode.next;

        //compare nodes
        while(slowNode != null){
            if(reversedFirstHalf.pop().value != slowNode.value) return false;
            slowNode = slowNode.next;
        }

        //All nodes matched so we have a palindrome!
        return true;
    }
}
