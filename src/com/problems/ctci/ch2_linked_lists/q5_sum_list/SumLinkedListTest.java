package com.problems.ctci.ch2_linked_lists.q5_sum_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumLinkedListTest {
    @Test
    public void smallList(){
        LinkedListNode[] firstNodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{2,5,3});
        LinkedListNode[] secondNodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{9,6});

        String expectedSum = "3->4->9";
        String actualSum = SumLinkedList.sum(firstNodeList[0], secondNodeList[0]).printForward();

        Assertions.assertTrue(expectedSum.equals(actualSum));
    }

    /**@Test
    public void reverseTest(){
        LinkedListNode[] nodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{2,5,3});
        String expectedList = "3->5->2";
        String actualList = SumLinkedList.reverse(nodeList[0]).printForward();

        Assertions.assertTrue(expectedList.equals(actualList));
    }**/
}
