package com.problems.ctci.ch4_trees_graphs.q8_lowest_common_ancestor;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

public class LowestCommonAncestorAttempt {
    public static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode rootNode, BinaryTreeNode node1, BinaryTreeNode node2){
        //if rootNode is null return
        if(rootNode == null) return null;

        //if either node 1 or 2 is rootNode return rootNode
        if(node1 == rootNode || node2 == rootNode) return rootNode;

        //recursively call for left and right
        BinaryTreeNode leftNode = lowestCommonAncestor(rootNode.left, node1, node2);
        BinaryTreeNode rightNode = lowestCommonAncestor(rootNode.right, node1, node2);

        //if leftNode and rightNode are null return null
        if(leftNode == null && rightNode == null) return null;

        //if leftNode and rightNode are not null return rootNode
        if(leftNode != null && rightNode != null) return rootNode;

        //return leftNode not null? left  : right
        return leftNode != null ? leftNode : rightNode;
    }
}
