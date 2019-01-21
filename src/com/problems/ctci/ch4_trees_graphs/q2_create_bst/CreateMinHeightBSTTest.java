package com.problems.ctci.ch4_trees_graphs.q2_create_bst;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch4_trees_graphs.introduction.IterativeTraversals.inOrderTraversal;
import static com.problems.ctci.ch4_trees_graphs.q2_create_bst.CreateMinHeightBSTAttempt.*;

public class CreateMinHeightBSTTest {
    @Test
    public void minBSTTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode rootNode = createMinimalBST(array);
        int[] actualResult = inOrderTraversal(rootNode);

        Assertions.assertArrayEquals(actualResult, array);
    }
}
