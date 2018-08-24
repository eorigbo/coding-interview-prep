package com.problems.interviewcake.code.trees_graphs;

import java.util.*;

public class MeshNetwork_Attempt {
    private static String[] reconstructPath(Map<String,String> previousNodes, String endNode){
        List<String> reversedPath = new ArrayList<>();
        String currNode = endNode;

        while(currNode != null){
            reversedPath.add(currNode);
            currNode = previousNodes.get(currNode);
        }
        Collections.reverse(reversedPath);

        return reversedPath.toArray(new String[0]);
    }

    public static String[] getPath(Map<String,String[]> graph, String startNode, String endNode){
        if(!graph.containsKey(startNode) || !graph.containsKey(endNode)) throw new IllegalArgumentException("Start or end node is not in map.");

        //Initialize Queue and HashMap
        Queue<String> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.add(startNode);

        Map<String, String> howWeReachedNodes = new HashMap<>();
        howWeReachedNodes.put(startNode,null);

        //Do BFS, and when endNode is found return reconstructpath, else add to queue and hashmap
        while(!nodesToVisit.isEmpty()){
            String node = nodesToVisit.remove();
            if(node.equals(endNode)) return reconstructPath(howWeReachedNodes, endNode);

            for(String neighbor: graph.get(node)){
                if(!howWeReachedNodes.containsKey(neighbor)){
                    howWeReachedNodes.put(neighbor,node);
                    nodesToVisit.add(neighbor);
                }
            }
        }

        //return null when path is not found
        return null;
    }
}
