package com.problems.ctci.ch4_trees_graphs.q3_list_of_node_depths;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import com.problems.interviewcake.code.trees_graphs.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.problems.ctci.ch4_trees_graphs.q3_list_of_node_depths.CreateLevelLinkedLists.createLevelLinkedLists;

public class CreateLevelLinkedListsTest {
    @Test
    public void smallNodeTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinaryTreeNode rootNode = createTreeFromArray(array);

        List<LinkedListNode> resultList = createLevelLinkedLists(rootNode);
        int expectedSize = 4;
        int actualSize = resultList.size();

        Assertions.assertEquals(expectedSize, actualSize);

        int expectedValue = 8;
        int actualValue = resultList.get(resultList.size()-1).value;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    public static BinaryTreeNode createTreeFromArray(int[] array) {
        if (array.length > 0) {
            BinaryTreeNode root = new BinaryTreeNode(array[0]);
            java.util.Queue<BinaryTreeNode> queue = new java.util.LinkedList<BinaryTreeNode>();
            queue.add(root);
            boolean done = false;
            int i = 1;
            while (!done) {
                BinaryTreeNode r = (BinaryTreeNode) queue.element();
                if (r.left == null) {
                    r.left = new BinaryTreeNode(array[i]);
                    i++;
                    queue.add(r.left);
                } else if (r.right == null) {
                    r.right = new BinaryTreeNode(array[i]);
                    i++;
                    queue.add(r.right);
                } else {
                    queue.remove();
                }
                if (i == array.length) {
                    done = true;
                }
            }
            return root;
        } else {
            return null;
        }
    }
}
