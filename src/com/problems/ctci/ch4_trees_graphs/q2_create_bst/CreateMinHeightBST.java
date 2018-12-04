package com.problems.ctci.ch4_trees_graphs.q2_create_bst;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

public class CreateMinHeightBST {
    public static BinaryTreeNode createMinimalBST(int array[]) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    private static BinaryTreeNode createMinimalBST(int arr[], int start, int end){
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        BinaryTreeNode rootNode = new BinaryTreeNode(arr[mid]);
        rootNode.setLeftChild(createMinimalBST(arr, start, mid - 1));
        rootNode.setRightChild(createMinimalBST(arr, mid + 1, end));
        return rootNode;
    }
}
