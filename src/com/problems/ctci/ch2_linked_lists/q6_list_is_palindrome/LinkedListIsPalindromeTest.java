package com.problems.ctci.ch2_linked_lists.q6_list_is_palindrome;


import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListIsPalindromeTest {
    @Test
    public void smallListTest(){
        LinkedListNode[] nodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{1,2,2,1});
        boolean expectedResult = true;
        boolean actualResult = LinkedListIsPalindrome.isPalindrome(nodeList[0]);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void smallListNoPalindromeTest(){
        LinkedListNode[] nodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{1,3,2,1});
        boolean expectedResult = false;
        boolean actualResult = LinkedListIsPalindrome.isPalindrome(nodeList[0]);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
