package com.problems.ctci.ch4_trees_graphs.introduction;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch4_trees_graphs.introduction.IterativeTraversalsAttempt.*;

public class IterativeTraversalsTest {
    @Test
    public void inOrderTraversalTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = BinaryTreeNode.createMinimalBST(array);
        int[] actualResult = inOrderTraversal(rootNode);

        Assertions.assertArrayEquals(actualResult, array);
    }

    @Test
    public void postOrderTraversalTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = BinaryTreeNode.createMinimalBST(array);
        int[] expectedResult = {1, 4, 3, 2, 7, 6, 10, 9, 8, 5};
        int[] actualResult = postOrderTraversal(rootNode);

        Assertions.assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    public void preOrderTraversalTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = BinaryTreeNode.createMinimalBST(array);
        int[] expectedResult = {5, 2, 1, 3, 4, 8, 6, 7, 9, 10};
        int[] actualResult = preOrderTraversal(rootNode);

        Assertions.assertArrayEquals(actualResult, expectedResult);
    }

    @Test
    public void nullNodeTest(){
        BinaryTreeNode rootNode = null;
        int[] expectedResult = null;
        int[] actualResult = inOrderTraversal(rootNode);

        Assertions.assertArrayEquals(expectedResult, actualResult);

        actualResult = preOrderTraversal(rootNode);
        Assertions.assertArrayEquals(expectedResult, actualResult);

        actualResult = postOrderTraversal(rootNode);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
