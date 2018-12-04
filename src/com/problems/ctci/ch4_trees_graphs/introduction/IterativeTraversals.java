package com.problems.ctci.ch4_trees_graphs.introduction;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class IterativeTraversals {
    public static int[] inOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode == null) return null;
        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        List<Integer> resultList = new ArrayList<>();
        BinaryTreeNode currNode = rootNode;

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

    public static int[] postOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode == null) return null;
        Deque<BinaryTreeNode> stack1 = new ArrayDeque<>();
        Deque<BinaryTreeNode> stack2 = new ArrayDeque<>();

        stack1.push(rootNode);

        while(!stack1.isEmpty()){
            rootNode = stack1.pop();
            stack2.push(rootNode);
            if(rootNode.left != null)stack1.push(rootNode.left);
            if(rootNode.right != null) stack1.push(rootNode.right);
        }

        int[] resultArr = stackToArray(stack2);

        return resultArr;
    }

    public static int[] preOrderTraversal(BinaryTreeNode rootNode){
        if(rootNode == null) return null;
        Deque<BinaryTreeNode> stack = new ArrayDeque<>();
        List<Integer> resultList = new ArrayList<>();

        stack.push(rootNode);
        while(!stack.isEmpty()){
            rootNode = stack.pop();
            resultList.add(rootNode.value);
            if(rootNode.right != null) stack.push(rootNode.right);
            if(rootNode.left != null) stack.push(rootNode.left);
        }

        int[] resultArr = listToArray(resultList);
        return resultArr;
    }

    private static int[] listToArray(List<Integer> resultList) {
        int resultArr[] = new int[resultList.size()];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = resultList.get(i);
        }
        return resultArr;
    }

    private static int[] stackToArray(Deque<BinaryTreeNode> stack){
        int resultArr[] = new int[stack.size()];
        for(int i = 0; i < resultArr.length; i++){
            resultArr[i] = stack.pop().value;
        }
        return resultArr;
    }
}
