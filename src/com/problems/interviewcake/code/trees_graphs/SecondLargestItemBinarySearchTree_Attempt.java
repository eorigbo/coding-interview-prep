package com.problems.interviewcake.code.trees_graphs;

public class SecondLargestItemBinarySearchTree_Attempt {
    private static int findLargest(BinaryTreeNode node){
        BinaryTreeNode current = node;
        while(current.right != null){
            current = current.right;
        }
        return current.value;
    }

    public static int findSecondLargest(BinaryTreeNode node){
        if(node == null || (node.left == null && node.right == null)) throw new IllegalArgumentException("At least two nodes are required.");

        BinaryTreeNode currNode = node;

        while(true){
            if (currNode.right == null && currNode.left != null) return findLargest(currNode.left);
            if (currNode.right != null && (currNode.right.left == null && currNode.right.right == null)) return currNode.value;

            currNode = currNode.right;
        }
    }
}
