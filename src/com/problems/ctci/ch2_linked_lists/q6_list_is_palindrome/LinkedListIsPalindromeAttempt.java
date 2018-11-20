package com.problems.ctci.ch2_linked_lists.q6_list_is_palindrome;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

public class LinkedListIsPalindromeAttempt {
    public static boolean isPalindrome(LinkedListNode rootNode){
        //initialize currNode
        LinkedListNode currNode = rootNode, fastNode = rootNode, slowNode = rootNode;

        //find middle of list using slow and fast nodes
        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        //account for when list is odd
        if(fastNode != null) slowNode = slowNode.next;

        //reverse second half
        slowNode = reverse(slowNode);

        //compare both halves
        while(slowNode != null){
            if(currNode.value != slowNode.value) return false;
            currNode = currNode.next;
            slowNode = slowNode.next;
        }
        return true;
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
}
