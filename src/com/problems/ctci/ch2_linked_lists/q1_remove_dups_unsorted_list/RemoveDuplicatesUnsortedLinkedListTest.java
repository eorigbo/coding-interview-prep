package com.problems.ctci.ch2_linked_lists.q1_remove_dups_unsorted_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch2_linked_lists.LinkedListNode.valuesToLinkedListNodes;
import static com.problems.ctci.ch2_linked_lists.q1_remove_dups_unsorted_list.RemoveDuplicatesUnsortedLinkedListAttempt.deleteDups;

public class RemoveDuplicatesUnsortedLinkedListTest {
    @Test
    public void smallListTest(){
        LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[]{2,4,2});
        String expectedResult = "2->4";
        deleteDups(listNodes[0]);
        String actualResult = listNodes[0].printForward();
        Assertions.assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    public void largeListTest(){
        LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[]{12,11,12,21,41,43,21,43});
        String expectedResult = "12->11->21->41->43";
        deleteDups(listNodes[0]);
        String actualResult = listNodes[0].printForward();
        Assertions.assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    public void midListTest(){
        LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[]{2,3,4,2,4});
        String expectedResult = "2->3->4";
        deleteDups(listNodes[0]);
        String actualResult = listNodes[0].printForward();
        Assertions.assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    public void singleItemListTest(){
        LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[]{2});
        String expectedResult = "2";
        deleteDups(listNodes[0]);
        String actualResult = listNodes[0].printForward();
        Assertions.assertTrue(expectedResult.equals(actualResult));
    }
}
