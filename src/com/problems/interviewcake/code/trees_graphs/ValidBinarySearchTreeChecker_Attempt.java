package com.problems.interviewcake.code.trees_graphs;

public class ValidBinarySearchTreeChecker_Attempt {
    public static boolean isBinarySearchTree(BinaryTreeNode root){
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean isBinarySearchTree(BinaryTreeNode node, int lowerBound, int upperBound){
        if(node == null)return true;
        if(node.value <= lowerBound || node.value >= upperBound) return false;
        return(isBinarySearchTree(node.left, lowerBound, node.value)
                && isBinarySearchTree(node.right, node.value, upperBound));
    }
}
