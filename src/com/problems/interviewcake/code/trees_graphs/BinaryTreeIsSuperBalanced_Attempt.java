package com.problems.interviewcake.code.trees_graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeIsSuperBalanced_Attempt {
    private static class NodeDepthPair{
        int depth;
        BinaryTreeNode node;

        public NodeDepthPair(BinaryTreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }

    public static boolean isBalanced(BinaryTreeNode treeRoot){

        //check if root is null
        if(treeRoot == null)return true;

        //initialize stack and arraylist
        Deque<NodeDepthPair> nodes = new ArrayDeque<>();
        List<Integer> depths = new ArrayList<>(3);

        nodes.push(new NodeDepthPair(treeRoot,0));

        //loop through stack and add logic for leaf nodes, then non-leaf nodes
        while(!nodes.isEmpty()){
            NodeDepthPair nodeDepthPair = nodes.pop();
            BinaryTreeNode node = nodeDepthPair.node;
            int depth = nodeDepthPair.depth;

            if(node.left == null && node.right == null){
                if(!depths.contains(depth))depths.add(depth);
                if(depths.size() > 2 || depths.size() == 2 && Math.abs(depths.get(0) - depths.get(1)) > 1)return false;
            }else{
                if(node.left != null) nodes.push(new NodeDepthPair(node.left, depth + 1));
                if(node.right != null) nodes.push(new NodeDepthPair(node.right, depth + 1));
            }

        }
        //return true outside while loop
        return true;
    }
}
