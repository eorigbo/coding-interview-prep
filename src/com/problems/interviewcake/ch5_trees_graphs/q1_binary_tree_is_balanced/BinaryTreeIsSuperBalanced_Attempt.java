package com.problems.interviewcake.ch5_trees_graphs.q1_binary_tree_is_balanced;

import com.problems.interviewcake.ch5_trees_graphs.BinaryTreeNode;

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
    public static boolean isBalanced(BinaryTreeNode root){
        if(root == null) return true;

        Deque<NodeDepth> nodeDepths = new ArrayDeque<>();
        List<Integer> depths = new ArrayList<>(3);

        nodeDepths.push(new NodeDepth(root, 0));

        while(!nodeDepths.isEmpty()){
            NodeDepth nodeDepth = nodeDepths.pop();
            BinaryTreeNode node = nodeDepth.node;
            int depth = nodeDepth.depth;

            if(node.left == null && node.right == null) {
                if (!depths.contains(depth)) depths.add(depth);
                if (depths.size() > 2 || depths.size() == 2 && Math.abs(depths.get(0) - depths.get(1)) > 1)
                    return false;
            }else {
                if (node.left != null) nodeDepths.push(new NodeDepth(node.left, depth + 1));
                if (node.right != null) nodeDepths.push(new NodeDepth(node.right, depth + 1));
            }
        }
        return true;
    }
}
