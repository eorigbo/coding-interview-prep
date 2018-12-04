package com.problems.ctci.ch4_trees_graphs;

public class BinaryTreeNode {

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public BinaryTreeNode parent;
    private int size = 0;

    public BinaryTreeNode(int value) {
        this.value = value;
        size = 1;
    }

    public void setLeftChild(BinaryTreeNode left) {
        this.left = left;
        if (left != null) {
            left.parent = this;
        }
    }

    public void setRightChild(BinaryTreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }

    public int size() {
        return size;
    }

    public int height() {
        int leftHeight = left != null ? left.height() : 0;
        int rightHeight = right != null ? right.height() : 0;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public BinaryTreeNode find(int value) {
        if (value == this.value) {
            return this;
        } else if (value <= this.value) {
            return left != null ? left.find(value) : null;
        } else if (value > this.value) {
            return right != null ? right.find(value) : null;
        }
        return null;
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

    public static BinaryTreeNode createMinimalBST(int array[]) {
        return createMinimalBST(array, 0, array.length - 1);
    }

}
