package com.problems.ctci.ch4_trees_graphs.q3_list_of_node_depths;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

import java.util.*;

public class CreateLevelLinkedListsAttempt {
    public static List<LinkedListNode> createLevelLinkedLists(BinaryTreeNode rootNode){
        //if root is null return null
        if(rootNode == null) return null;

        //create list of type linkedlist
        List<LinkedListNode> resultList = new ArrayList<>();

        //initialize stack
        Queue<NodeDepthPair> queue = new ArrayDeque<>();

        //add nodeDepthPair to the stack and while it is not empty
        queue.add(new NodeDepthPair(rootNode, 0));

        while(!queue.isEmpty()){

            //pop from the stack and if depth = list.size(), add as new LinkedListNode
            NodeDepthPair nodeDepth = queue.remove();
            BinaryTreeNode currNode = nodeDepth.node;
            int currDepth = nodeDepth.depth;

            if(currDepth == resultList.size()){
                resultList.add(new LinkedListNode(currNode.value));
            }else{
                LinkedListNode.appendToList(resultList.get(currDepth), currNode.value);
            }

            //if currNode.left is not null add to stack, same for right
            if(currNode.left != null) queue.add(new NodeDepthPair(currNode.left, currDepth + 1));
            if(currNode.right != null) queue.add(new NodeDepthPair(currNode.right, currDepth + 1));
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
