package com.problems.ctci.ch4_trees_graphs.q6_inorder_successor;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

public class InOrderSuccessorBST {
    public static BinaryTreeNode inOrderSuccessor(BinaryTreeNode rootNode, int targetNodeValue) {
        if (rootNode == null) return null;
        BinaryTreeNode currNode = rootNode;

        while (currNode.left != null || currNode.right != null || currNode.value == targetNodeValue) {
            if (currNode.value < targetNodeValue) {
                currNode = currNode.right;
            } else if (currNode.value > targetNodeValue) {
                currNode = currNode.left;
            } else {//currNode.value == targetNodeValue
                if (currNode.right != null) {
                    //return leftmost node of currNode.right
                    currNode = currNode.right;
                    while (currNode.left != null) {
                        currNode = currNode.left;
                    }
                    return currNode;
                } else {
                    //return the last node from which we moved left
                    currNode = rootNode;
                    BinaryTreeNode tempNode = null;
                    while (currNode.value != targetNodeValue) {
                        if (currNode.value >= targetNodeValue) {
                            tempNode = currNode;
                            currNode = currNode.left;
                        } else {
                            currNode = currNode.right;
                        }
                    }
                    return tempNode;
                }
            }
        }
        return null;
    }

}
