package com.problems.interviewcake.code.trees_graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeIsSuperBalanced_Attempt {
    private static class NodeDepth{
        BinaryTreeNode node;
        int depth;

        NodeDepth(BinaryTreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }
    public static boolean isBalanced(BinaryTreeNode node){
        if(node == null) return true;

        Deque<NodeDepth> nodeDepths = new ArrayDeque<>();
        nodeDepths.add(new NodeDepth(node,0));
        List<Integer> depths = new ArrayList<>(3);

        while(!nodeDepths.isEmpty()){
            NodeDepth nodeDepth = nodeDepths.pop();
            BinaryTreeNode currNode = nodeDepth.node;
            int depth = nodeDepth.depth;

            if(currNode.right == null && currNode.left == null){
                if(!depths.contains(depth)) depths.add(depth);
                if(depths.size() > 2 || (depths.size() == 2 && Math.abs(depths.get(0) - depths.get(1)) > 1)) return false;
            }else{
                if(currNode.left != null) nodeDepths.add(new NodeDepth(currNode.left, depth+1));
                if(currNode.right != null) nodeDepths.add(new NodeDepth(currNode.right, depth+1));
            }
        }
        return true;
    }
}
