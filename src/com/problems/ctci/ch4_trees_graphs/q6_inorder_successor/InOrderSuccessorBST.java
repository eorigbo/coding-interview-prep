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
                    //first case: if target node has a right subtree, return leftmost node of currNode.right
                    currNode = currNode.right;
                    while (currNode.left != null) {
                        currNode = currNode.left;
                    }
                    return currNode;
                } else {
                    //second case: if target node doesn't have a right subtree
                    // go to rootNode and start coming down. Return the last node
                    // from which we moved left
                    currNode = rootNode;
                    BinaryTreeNode tempNode = null;
                    //While loop checks to make sure that we are not
                    // getting to the target node in this loop
                    // important for case where targetNode is the last element of BST
                    while (currNode.value != targetNodeValue) {
                        if (currNode.value > targetNodeValue) {
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
