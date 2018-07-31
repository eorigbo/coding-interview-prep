package com.problems.interviewcake.code.trees_graphs;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidBinarySearchTreeCheckerRecursive {

    private static class NodeBounds{
        BinaryTreeNode node;
        int lowerBound;
        int upperBound;

        NodeBounds(BinaryTreeNode node, int lowerBound, int upperBound){
            this.node = node;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
    }

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
