package com.problems.ctci.ch4_trees_graphs.q8_lowest_common_ancestor;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

public class LowestCommonAncestor {
    public static BinaryTreeNode lowestCommonAncestor(BinaryTreeNode rootNode,BinaryTreeNode node1,BinaryTreeNode node2){
        if(rootNode == null) return null;
        if(rootNode == node1 || rootNode == node2) return rootNode;

        BinaryTreeNode leftNode = lowestCommonAncestor(rootNode.left, node1, node2);
        BinaryTreeNode rightNode = lowestCommonAncestor(rootNode.right, node1, node2);

        if(leftNode != null && rightNode != null) return rootNode;
        if(leftNode == null && rightNode == null) return null;

        return leftNode != null ? leftNode : rightNode;
    }

}
