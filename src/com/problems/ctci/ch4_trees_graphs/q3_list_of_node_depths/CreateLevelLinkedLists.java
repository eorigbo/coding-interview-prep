package com.problems.ctci.ch4_trees_graphs.q3_list_of_node_depths;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CreateLevelLinkedLists {
    public static List<LinkedListNode> createLevelLinkedLists(BinaryTreeNode rootNode){
        if(rootNode == null) return null;
        Queue<NodeDepthPair> nodeDepths = new ArrayDeque<>();
        List<LinkedListNode> resultList = new ArrayList<>();

        nodeDepths.add(new NodeDepthPair(rootNode,0));

        while(!nodeDepths.isEmpty()){
            NodeDepthPair nodeDepth = nodeDepths.remove();
            BinaryTreeNode currNode = nodeDepth.node;
            int depth = nodeDepth.depth;
            if(depth == resultList.size()){
                resultList.add(new LinkedListNode(currNode.value));
            }else{
                resultList.get(depth).next = new LinkedListNode(currNode.value);
            }

            if(currNode.left != null) nodeDepths.add(new NodeDepthPair(currNode.left,depth + 1));
            if(currNode.right != null) nodeDepths.add(new NodeDepthPair(currNode.right,depth + 1));
        }
        return resultList;
    }

    private static class NodeDepthPair{
        BinaryTreeNode node;
        int depth;
        NodeDepthPair(BinaryTreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }
}
