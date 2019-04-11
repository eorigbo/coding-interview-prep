package com.problems.interviewcake.ch5_trees_graphs.q2_binary_search_tree_checker;

import com.problems.interviewcake.ch5_trees_graphs.BinaryTreeNode;

public class ValidBinarySearchTreeCheckerRecursive {

    public static boolean isBinarySearchTree(BinaryTreeNode root){
        return isBinarySearchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private static boolean isBinarySearchTree(BinaryTreeNode root, int lowerBound, int upperBound){
        if(root == null)return true;
        if(root.value >= upperBound || root.value <= lowerBound)return false;

        return isBinarySearchTree(root.left,lowerBound,root.value) &&
                isBinarySearchTree(root.right,root.value,upperBound);
    }
}
