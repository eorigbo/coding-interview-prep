package com.problems.ctci.ch4_trees_graphs.introduction;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class RecursiveTraversals {
    List<Integer> result = new ArrayList<>();

    public static void visit(BinaryTreeNode node) {
        if (node != null) {
            System.out.println(node.value);
        }
    }

    public static void inOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    public static void preOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(BinaryTreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // We needed this code for other files, so check out the code in the library
        BinaryTreeNode root = BinaryTreeNode.createMinimalBST(array);

        System.out.println("In Order Traversal:");
        inOrderTraversal(root);

        System.out.println("Pre Order Traversal:");
        preOrderTraversal(root);

        System.out.println("Post Order Traversal:");
        postOrderTraversal(root);
    }

}
