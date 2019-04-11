package com.problems.interviewcake.ch5_trees_graphs.q2_binary_search_tree_checker;

import com.problems.interviewcake.ch5_trees_graphs.BinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidBinarySearchTreeChecker {

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
        if(root == null)return true;

        Deque<NodeBounds> nodeBounds = new ArrayDeque<>();
        nodeBounds.push(new NodeBounds(root,Integer.MIN_VALUE,Integer.MAX_VALUE));

        while(!nodeBounds.isEmpty()){
            NodeBounds nodeBound = nodeBounds.pop();
            BinaryTreeNode node = nodeBound.node;
            int lowerBound = nodeBound.lowerBound;
            int upperBound = nodeBound.upperBound;

            if(node.value <= lowerBound || node.value >= upperBound)return false;

            if (node.left != null)nodeBounds.push(new NodeBounds(node.left,lowerBound,node.value));
            if (node.right!= null) nodeBounds.push(new NodeBounds(node.right,node.value,upperBound));
        }
        return true;
    }
}
