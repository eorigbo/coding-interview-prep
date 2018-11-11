package com.problems.ctci.ch2_linked_lists.q7_intersection;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindIntersectionLinkedListsTest {
    @Test
    public void smallListTest(){
        LinkedListNode[] nodeList1 = LinkedListNode.valuesToLinkedListNodes(new int[]{1,2,3,4,5});
        LinkedListNode[] nodeList2 = LinkedListNode.valuesToLinkedListNodes(new int[]{6,7,8});

        nodeList2[2].next   = nodeList1[2];

        int expectedValue = 3;
        int actualValue = FindIntersectionLinkedLists.findIntersection(nodeList1[0],nodeList2[0]).value;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void noIntersectionTest(){
        LinkedListNode[] nodeList1 = LinkedListNode.valuesToLinkedListNodes(new int[]{1,2,3,4,5});
        LinkedListNode[] nodeList2 = LinkedListNode.valuesToLinkedListNodes(new int[]{6,7,8,3,8});

        LinkedListNode expectedNode = null;
        LinkedListNode actualNode = FindIntersectionLinkedLists.findIntersection(nodeList1[0],nodeList2[0]);

        Assertions.assertNull(actualNode);
    }

    @Test
    public void sameSizeListTest(){
        LinkedListNode[] nodeList1 = LinkedListNode.valuesToLinkedListNodes(new int[]{1,2,3,4,5});
        LinkedListNode[] nodeList2 = LinkedListNode.valuesToLinkedListNodes(new int[]{6,7,8});

        nodeList2[2].next   = nodeList1[3];

        int expectedValue = 4;
        int actualValue = FindIntersectionLinkedLists.findIntersection(nodeList1[0],nodeList2[0]).value;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void singleListsNoIntersectionTest(){
        LinkedListNode[] nodeList1 = LinkedListNode.valuesToLinkedListNodes(new int[]{1});
        LinkedListNode[] nodeList2 = LinkedListNode.valuesToLinkedListNodes(new int[]{6});

        LinkedListNode expectedNode = null;
        LinkedListNode actualNode = FindIntersectionLinkedLists.findIntersection(nodeList1[0],nodeList2[0]);

        Assertions.assertNull(actualNode);
    }

    @Test
    public void oneListNullTest(){
        LinkedListNode[] nodeList1 = LinkedListNode.valuesToLinkedListNodes(new int[]{1,2,4,5});
        LinkedListNode nodeList2 = null;

        LinkedListNode expectedNode = null;
        LinkedListNode actualNode = FindIntersectionLinkedLists.findIntersection(nodeList1[0],nodeList2);

        Assertions.assertNull(actualNode);
    }
}
