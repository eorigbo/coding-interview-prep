package com.problems.ctci.ch4_trees_graphs.q8_lowest_common_ancestor;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch4_trees_graphs.q8_lowest_common_ancestor.LowestCommonAncestor.lowestCommonAncestor;

public class LowestCommonAncestorTest {
    @Test
    public void leftAndRightSideTest(){
        int[] array = {3, 6, 8, 2, 11, 4, 13, 15, 16, 9, 5, 21, 22, 7, 23};
        BinaryTreeNode rootNode = BinaryTreeNode.createTreeFromArray(array);

        BinaryTreeNode node1 = rootNode.left.left; //node with value 2
        BinaryTreeNode node2 = rootNode.right; //node with value 8
        BinaryTreeNode expectedNode = rootNode;//node with value 3 (rootNode)
        BinaryTreeNode actualNode = lowestCommonAncestor(rootNode, node1, node2);

        Assertions.assertEquals(expectedNode, actualNode);
    }

    @Test
    public void leftSideDiffLevelsTest(){
        int[] array = {3, 6, 8, 2, 11, 4, 13, 15, 16, 9, 5, 21, 22, 7, 23};
        BinaryTreeNode rootNode = BinaryTreeNode.createTreeFromArray(array);

        BinaryTreeNode node1 = rootNode.left.left; //node with value 2
        BinaryTreeNode node2 = rootNode.left.right.right; //node with value 5
        BinaryTreeNode expectedNode = rootNode.left;//node with value 6
        BinaryTreeNode actualNode = lowestCommonAncestor(rootNode, node1, node2);

        Assertions.assertEquals(expectedNode, actualNode);
    }

    @Test
    public void leftSideSameLevelsTest(){
        int[] array = {3, 6, 8, 2, 11, 4, 13, 15, 16, 9, 5, 21, 22, 7, 23};
        BinaryTreeNode rootNode = BinaryTreeNode.createTreeFromArray(array);

        BinaryTreeNode node1 = rootNode.left.right.left; //node with value 9
        BinaryTreeNode node2 = rootNode.left.right.right; //node with value 5
        BinaryTreeNode expectedNode = rootNode.left.right;//node with value 11
        BinaryTreeNode actualNode = lowestCommonAncestor(rootNode, node1, node2);

        Assertions.assertEquals(expectedNode, actualNode);
    }

    @Test
    public void rightSideOneNodeAncestorTest(){
        int[] array = {3, 6, 8, 2, 11, 4, 13, 15, 16, 9, 5, 21, 22, 7, 23};
        BinaryTreeNode rootNode = BinaryTreeNode.createTreeFromArray(array);

        BinaryTreeNode node1 = rootNode.right; //node with value 8
        BinaryTreeNode node2 = rootNode.right.right.left; //node with value 7
        BinaryTreeNode expectedNode = rootNode.right;//node with value 8
        BinaryTreeNode actualNode = lowestCommonAncestor(rootNode, node1, node2);

        Assertions.assertEquals(expectedNode, actualNode);
    }

    @Test
    public void rootAndOneChildTest(){
        int[] array = {3, 6, 8, 2, 11, 4, 13, 15, 16, 9, 5, 21, 22, 7, 23};
        BinaryTreeNode rootNode = BinaryTreeNode.createTreeFromArray(array);

        BinaryTreeNode node1 = rootNode; //node with value 3
        BinaryTreeNode node2 = rootNode.left.right.left; //node with value 9
        BinaryTreeNode expectedNode = rootNode;//node with value 3
        BinaryTreeNode actualNode = lowestCommonAncestor(rootNode, node1, node2);

        Assertions.assertEquals(expectedNode, actualNode);
    }
}
