package com.problems.ctci.ch2_linked_lists.q5_sum_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch2_linked_lists.q5_sum_list.SumLinkedListAttempt.sum;

public class SumLinkedListTest {
    @Test
    public void smallListTest(){
        LinkedListNode[] firstNodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{2,5,3});
        LinkedListNode[] secondNodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{9,6});

        String expectedSum = "3->4->9";
        String actualSum = sum(firstNodeList[0], secondNodeList[0]).printForward();

        Assertions.assertTrue(expectedSum.equals(actualSum));
    }

    @Test
    public void largeListTest(){
        LinkedListNode[] firstNodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{2,5,3,4,2});
        LinkedListNode[] secondNodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{9,6,2,3,7});

        String expectedSum = "1->2->1->5->7->9";
        String actualSum = sum(firstNodeList[0], secondNodeList[0]).printForward();

        Assertions.assertTrue(expectedSum.equals(actualSum));
    }
}
