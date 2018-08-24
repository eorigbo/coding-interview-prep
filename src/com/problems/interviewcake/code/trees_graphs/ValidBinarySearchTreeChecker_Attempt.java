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

    public static boolean isBinarySearchTree(BinaryTreeNode node){
        if(node == null) return true;

        Deque<NodeBound> nodeBounds = new ArrayDeque<>();
        nodeBounds.add(new NodeBound(node,Integer.MIN_VALUE,Integer.MAX_VALUE));

        while(!nodeBounds.isEmpty()){
            NodeBound nodeBound = nodeBounds.pop();
            BinaryTreeNode currNode = nodeBound.node;
            int lowerBound = nodeBound.lowerBound;
            int upperBound = nodeBound.upperBound;

            if(currNode.value <= lowerBound || currNode.value >= upperBound) return false;

            if(currNode.left != null) nodeBounds.add(new NodeBound(currNode.left, lowerBound, currNode.value));
            if(currNode.right != null) nodeBounds.add(new NodeBound(currNode.right, currNode.value, upperBound));
        }
        return true;
    }
}
