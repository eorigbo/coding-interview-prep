package com.problems.ctci.ch4_trees_graphs.q3_list_of_node_depths;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.problems.ctci.ch4_trees_graphs.q3_list_of_node_depths.CreateLevelLinkedListsAttempt.createLevelLinkedLists;

public class CreateLevelLinkedListsTest {
    @Test
    public void smallNodeTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTreeNode rootNode = BinaryTreeNode.createTreeFromArray(array);

        List<LinkedListNode> resultList = createLevelLinkedLists(rootNode);
        int expectedSize = 4;
        int actualSize = resultList.size();

        Assertions.assertEquals(expectedSize, actualSize);

        int expectedValue = 8;
        int actualValue = resultList.get(resultList.size()-1).value;

        Assertions.assertEquals(expectedValue, actualValue);

        expectedValue = 10;
        actualValue = resultList.get(resultList.size()-1).next.next.value;

        Assertions.assertEquals(expectedValue, actualValue);
    }

}
