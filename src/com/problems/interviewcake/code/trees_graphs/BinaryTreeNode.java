package com.problems.interviewcake.code.trees_graphs;

public class BinaryTreeNode {
    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value){
        this.value = value;
    }

    public BinaryTreeNode insertLeft(int leftValue){
        left = new BinaryTreeNode(leftValue);
        return left;
    }

    public BinaryTreeNode insertRight(int rightValue){
        right = new BinaryTreeNode(rightValue);
        return right;
    }
}
