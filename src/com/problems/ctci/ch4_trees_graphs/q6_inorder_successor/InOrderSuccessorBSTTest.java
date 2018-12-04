package com.problems.ctci.ch4_trees_graphs.q6_inorder_successor;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch4_trees_graphs.q2_create_bst.CreateMinHeightBST.createMinimalBST;
import static com.problems.ctci.ch4_trees_graphs.q6_inorder_successor.InOrderSuccessorBST.inOrderSuccessor;

public class InOrderSuccessorBSTTest {
    @Test
    public void smallBSTTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = createMinimalBST(array);
        int expectedValue = 6;
        int actualValue = inOrderSuccessor(rootNode, 5).value;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void noTargetValueTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = createMinimalBST(array);
        BinaryTreeNode actualValue = inOrderSuccessor(rootNode, 17);

        Assertions.assertNull(actualValue);
    }

    @Test
    public void lastNodeFromWhichWeMovedLeftTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = createMinimalBST(array);
        int expectedValue = 8;
        int actualValue = inOrderSuccessor(rootNode, 7).value;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void leafNodeSuccessorTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = createMinimalBST(array);
        int expectedValue = 5;
        int actualValue = inOrderSuccessor(rootNode, 4).value;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void lastNodeValueTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = createMinimalBST(array);
        BinaryTreeNode actualValue = inOrderSuccessor(rootNode, 10);

        Assertions.assertNull(actualValue);
    }

    @Test
    public void singleNodeValueTest(){
        int[] array = {1};

        BinaryTreeNode rootNode = createMinimalBST(array);
        BinaryTreeNode actualValue = inOrderSuccessor(rootNode, 1);

        Assertions.assertNull(actualValue);
    }

    @Test
    public void nullNodeValueTest(){
        BinaryTreeNode rootNode = null;
        BinaryTreeNode actualValue = inOrderSuccessor(rootNode, 3);

        Assertions.assertNull(actualValue);
    }
}
