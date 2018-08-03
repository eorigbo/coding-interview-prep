package com.problems.interviewcake.code.trees_graphs;

public class SecondLargestItemBinarySearchTree_Attempt {
    private static int findLargest(BinaryTreeNode rootNode){

        BinaryTreeNode current = rootNode;

        while(current.right != null) current = current.right;

        return current.value;

    }

    public static int findSecondLargest(BinaryTreeNode rootNode){

        if(rootNode == null ||
                (rootNode.left == null && rootNode.right == null)) throw new IllegalArgumentException("At least two nodes are required.");

        BinaryTreeNode current = rootNode;
        while(true){
            if(current.right == null && current.left != null)return findLargest(current.left);

            if(current.right != null && current.right.left == null && current.right.right == null) return current.value;

            current = current.right;
        }
    }
}
