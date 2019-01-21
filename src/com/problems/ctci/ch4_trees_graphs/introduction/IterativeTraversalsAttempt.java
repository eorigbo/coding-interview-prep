package com.problems.ctci.ch4_trees_graphs.introduction;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class IterativeTraversalsAttempt {
    public static int[] inOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode == null) return null;

        BinaryTreeNode currNode = rootNode;
        List<Integer> resultList = new ArrayList<>();

        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        while(true){
            if(currNode != null){
                stack.push(currNode);
                currNode = currNode.left;
            }else{
                if(stack.isEmpty()) break;
                currNode = stack.pop();
                resultList.add(currNode.value);
                currNode = currNode.right;
            }
        }

        int[] resultArr = listToArray(resultList);

        return resultArr;
    }

    public static int[] preOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode == null) return null;

        BinaryTreeNode currNode = rootNode;
        List<Integer> resultList = new ArrayList<>();

        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        stack.push(currNode);

        while(!stack.isEmpty()){
            currNode = stack.pop();
            resultList.add(currNode.value);

            if(currNode.right != null) stack.push(currNode.right);
            if(currNode.left != null) stack.push(currNode.left);
        }

        int[] resultArr = listToArray(resultList);

        return resultArr;
    }

    public static int[] postOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode == null) return null;

        BinaryTreeNode currNode = rootNode;

        Deque<BinaryTreeNode> stack1 = new ArrayDeque<>();
        Deque<BinaryTreeNode> stack2 = new ArrayDeque<>();

        stack1.push(currNode);

        while(!stack1.isEmpty()){
            currNode = stack1.pop();

            if(currNode.left != null) stack1.push(currNode.left);
            if(currNode.right != null) stack1.push(currNode.right);

            stack2.push(currNode);
        }

        int[] resultArr = stackToArray(stack2);

        return resultArr;
    }

    private static int[] listToArray(List<Integer> list){
        int[] result = new int[list.size()];

        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }

    private static int[] stackToArray(Deque<BinaryTreeNode> stack){
        int[] result = new int[stack.size()];

        for(int i = 0; i < result.length; i++){
            result[i] = stack.pop().value;
        }
        return result;
    }
}
