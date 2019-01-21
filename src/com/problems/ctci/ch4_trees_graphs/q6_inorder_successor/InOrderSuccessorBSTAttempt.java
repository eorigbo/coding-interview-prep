package com.problems.ctci.ch4_trees_graphs.q6_inorder_successor;

import com.problems.ctci.ch4_trees_graphs.BinaryTreeNode;

public class InOrderSuccessorBSTAttempt {
    public static BinaryTreeNode inOrderSuccessor(BinaryTreeNode rootNode, int targetValue){
        if(rootNode == null) return null;

        BinaryTreeNode currNode = rootNode;

        //while left and right nodes are not null or currNode = targetValue
        while(currNode.left != null || currNode.right != null || currNode.value == targetValue){
            //if currNode value > targetValue go left
            if(currNode.value > targetValue){
                currNode = currNode.left;
                //else if currNode value < targetValue go right
            }else if( currNode.value < targetValue){
                currNode = currNode.right;
                //else
            }else{
                //if currNode.right is not null
                if(currNode.right != null){
                    //currNode = currNode.right and return leftmost node
                    currNode = currNode.right;
                    while(currNode.left != null){
                        currNode = currNode.left;
                    }
                    return currNode;
                    //else
                }else{
                    //initialize tempNode and set currNode to rootNode
                    BinaryTreeNode tempNode = null;
                    currNode = rootNode;

                    //while currNodeValue is not targetNodeValue
                    while(currNode.value != targetValue){
                        //if currNode value > targetValue
                        if(currNode.value > targetValue){
                            //update tempNode and go left else go right
                            tempNode = currNode;
                            currNode = currNode.left;
                        }else{
                            currNode = currNode.right;
                        }
                        //return tempNode
                    }
                    return tempNode;
                }
            }

            //return null
        }
        return null;
    }
}
