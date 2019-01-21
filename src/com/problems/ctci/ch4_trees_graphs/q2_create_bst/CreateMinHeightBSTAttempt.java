package com.problems.ctci.ch4_trees_graphs.q2_create_bst;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

public class CreateMinHeightBSTAttempt {
    public static BinaryTreeNode createMinimalBST(int[] arr){
        return createMinimalBST(arr, 0, arr.length - 1);
    }

    private static BinaryTreeNode createMinimalBST(int[] arr, int floor, int ceiling){
        if(ceiling < floor) return null;

        //create mid and initialize BST
        int mid = (floor + ceiling)/2;

        //add mid element to root of BST
        BinaryTreeNode rootNode = new BinaryTreeNode(arr[mid]);

        //populate left and right recursively
        rootNode.left = createMinimalBST(arr, floor, mid - 1);
        rootNode.right = createMinimalBST(arr, mid + 1, ceiling);

        //return BST
        return rootNode;
    }
}
