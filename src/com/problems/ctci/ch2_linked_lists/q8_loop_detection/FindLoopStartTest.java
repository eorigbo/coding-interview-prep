package com.problems.ctci.ch2_linked_lists.q8_loop_detection;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch2_linked_lists.q8_loop_detection.FindLoopStartAttempt.findLoopStart;

public class FindLoopStartTest {
    @Test
    public void smallListTest(){
        LinkedListNode[] nodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{2,4,6,8,9,7,5});
        nodeList[6].next = nodeList[3];

        int expectedLoopStart = 8;
        int actualLoopStart = findLoopStart(nodeList[0]).value;

        Assertions.assertEquals(expectedLoopStart, actualLoopStart);
    }

    @Test
    public void noLoopTest(){
        LinkedListNode[] nodeList = LinkedListNode.valuesToLinkedListNodes(new int[]{6,12,18,24,35,78});

        LinkedListNode loopStart = findLoopStart(nodeList[0]);

        Assertions.assertNull(loopStart);
    }


}
