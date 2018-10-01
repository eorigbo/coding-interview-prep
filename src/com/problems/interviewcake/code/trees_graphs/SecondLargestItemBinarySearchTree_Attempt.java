package com.problems.interviewcake.code.trees_graphs;

public class SecondLargestItemBinarySearchTree_Attempt {
    private static int largest(BinaryTreeNode root){
        BinaryTreeNode current = root;

        while(current.right != null){
            current = current.right;
        }

        return current.value;
    }

    public static int findSecondLargest(BinaryTreeNode root){
        if(root == null || (root.left == null && root.right == null)) throw new IllegalArgumentException("At least 2 nodes are needed.");

        BinaryTreeNode current = root;

        while(true){
            //if current.right != null, and current.right.right is null and current.right.left is null return current.value
            if(current.right != null && current.right.right == null && current.right.left == null) return current.value;

            //if current.right == null and current.left is not null return largest of current.left
            if(current.right == null && current.left != null) return largest(current.left);

            current = current.right;
        }

    }
}
