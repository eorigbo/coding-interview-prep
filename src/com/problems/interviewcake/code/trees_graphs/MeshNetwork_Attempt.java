package com.problems.interviewcake.code.trees_graphs;

import java.util.*;

public class MeshNetwork_Attempt {
    public static String[] getPath(Map<String,String[]> graph, String startNode, String endNode){
        if(!graph.containsKey(startNode) || !graph.containsKey(endNode)) throw new IllegalArgumentException("Start node or end node is not in the graph.");

        Queue<String> nodesToVisit = new ArrayDeque<>();
        Map<String,String> howWeReachedNodes = new HashMap<>();

        nodesToVisit.add(startNode);
        howWeReachedNodes.put(startNode,null);

        while(!nodesToVisit.isEmpty()){
            String node = nodesToVisit.remove();
            if(node.equals(endNode)) return reconstructPath(howWeReachedNodes,endNode);

            for(String neighbor:graph.get(node)){
                if(!howWeReachedNodes.containsKey(neighbor)){
                    nodesToVisit.add(neighbor);
                    howWeReachedNodes.put(neighbor,node);
                }
            }
        }
        return null;
    }

    private static String[] reconstructPath(Map<String,String> previousNodes, String endNode){
        String currentNode = endNode;

        List<String> reversedPath = new ArrayList<>();
        while(currentNode != null){
            reversedPath.add(currentNode);
            currentNode = previousNodes.get(currentNode);
        }
        Collections.reverse(reversedPath);
        return reversedPath.toArray(new String[0]);

    }
}
