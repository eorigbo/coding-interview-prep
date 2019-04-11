package com.problems.interviewcake.ch5_trees_graphs.q3_second_largest_item_bst;

import com.problems.interviewcake.ch5_trees_graphs.BinaryTreeNode;

public class SecondLargestItemBinarySearchTree {
    private static int findLargest(BinaryTreeNode rootNode){
        BinaryTreeNode current = rootNode;
        while(current.right!=null){
            current = current.right;
        }
        return current.value;
    }

    public static int findSecondLargest(BinaryTreeNode rootNode){
        if(rootNode == null || (rootNode.left == null
                && rootNode.right == null)) {
            throw new IllegalArgumentException("Tree must have at least 2 nodes");
        }

        BinaryTreeNode current = rootNode;

        while(true){
            // Scenario 1: If the rightmost node has a left node, return the largest
            // element of the left node.
            if(current.left != null && current.right == null) return findLargest(current.left);

            // Scenario 2: If we are in the second to the rightmost node, return it
            // as the second to largest element of the BST
            if(current.right != null
                    && current.right.left == null
                    && current.right.right == null) return current.value;

            current = current.right;

        }
    }
}
