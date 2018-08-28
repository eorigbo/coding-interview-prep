package com.problems.interviewcake.code.trees_graphs;

import java.util.*;

public class MeshNetwork_Attempt {
    private static String[] reconstructPath(Map<String,String> previousNodes, String endNode){
        String currNode = endNode;
        List<String> reversedPath = new ArrayList<>();

        while(currNode != null){
            reversedPath.add(currNode);
            currNode = previousNodes.get(currNode);
        }

        Collections.reverse(reversedPath);

        return reversedPath.toArray(new String[0]);
    }

    public static String[] getPath(Map<String,String[]> graph, String startNode, String endNode){

        //check if start and end are in graph
        if(!graph.containsKey(startNode) || !graph.containsKey(endNode)) throw new IllegalArgumentException("Start node or end node is not in graph.");

        //initialize queue and Hashmap with start
        Queue<String> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.add(startNode);

        Map<String,String> howWeReachedNode = new HashMap<>();
        howWeReachedNode.put(startNode,null);

        //start bfs with queue
        while(!nodesToVisit.isEmpty()){
            String node = nodesToVisit.remove();
            if(node.equals(endNode)) return reconstructPath(howWeReachedNode, endNode);

            for(String neighbor: graph.get(node)){
                if(!howWeReachedNode.containsKey(neighbor)){
                    nodesToVisit.add(neighbor);
                    howWeReachedNode.put(neighbor,node);
                }
            }
        }

        //if node is end node reconstruct path

        //loop through neighbors and if not in hashmap add to hashmap and queue

        //outside while loop return null
        return null;
    }
}
