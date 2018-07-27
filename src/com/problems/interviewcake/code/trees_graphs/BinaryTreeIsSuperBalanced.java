package com.problems.interviewcake.code.trees_graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeIsSuperBalanced {

    private static class NodeDepthPair{
        BinaryTreeNode node;
        int depth;

        NodeDepthPair(BinaryTreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }

    }

    public static boolean isBalanced(BinaryTreeNode treeRoot){

        //a tree with no nodes is super balanced since there are no leaves
        if(treeRoot == null)return true;

        //our depths variable should take at most 3 depths
        List<Integer> depths = new ArrayList<>(3);

        Deque<NodeDepthPair> nodes = new ArrayDeque<>();

        //add rootnode to stack
        nodes.push(new NodeDepthPair(treeRoot,0));

        while(!nodes.isEmpty()){
            NodeDepthPair nodeDepthPair = nodes.pop();
            BinaryTreeNode node = nodeDepthPair.node;
            int depth = nodeDepthPair.depth;

            //check if this node is a leaf
            if(node.left == null && node.right == null){
                //check if this is a new depth
                if(!depths.contains(depth)){
                    depths.add(depth);
                    //check if we have > 2 depths, or if difference in 2 depths are > 1
                    if(depths.size() > 2 || depths.size() == 2 &&
                            Math.abs(depths.get(0)- depths.get(1)) > 1){
                        return false;
                    }
                }

            }else{
                //this node isn't a leaf so keep stepping down
                if (node.left != null){
                    nodes.push(new NodeDepthPair(node.left,depth+1));
                }

                if(node.right != null){
                    nodes.push(new NodeDepthPair(node.right,depth + 1));
                }
            }
        }

        return true;
    }
}
