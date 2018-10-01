package com.problems.interviewcake.code.trees_graphs;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidBinarySearchTreeChecker_Attempt {
    private static class NodeBound{
        BinaryTreeNode node;
        int lowerBound;
        int upperBound;

        NodeBound(BinaryTreeNode node, int lowerBound, int upperBound){
            this.node = node;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
    }

    public static boolean isBinarySearchTree(BinaryTreeNode root){
        if(root == null) return true;

        Deque<NodeBound> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.add(new NodeBound(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        while(!nodesToVisit.isEmpty()){
            NodeBound nodeBound = nodesToVisit.pop();
            BinaryTreeNode node = nodeBound.node;
            int lowerBound = nodeBound.lowerBound;
            int upperBound = nodeBound.upperBound;

            if(node.value <= lowerBound || node.value >= upperBound) return false;

            if(node.left != null) nodesToVisit.push(new NodeBound(node.left, lowerBound, node.value));
            if(node.right != null) nodesToVisit.push(new NodeBound(node.right, node.value, upperBound));
        }
        return true;
    }
}
