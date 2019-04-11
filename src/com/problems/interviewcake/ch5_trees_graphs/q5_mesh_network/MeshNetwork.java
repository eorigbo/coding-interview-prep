package com.problems.interviewcake.ch5_trees_graphs.q5_mesh_network;

import java.util.*;

public class MeshNetwork {
    private static String[] reconstructPath(Map<String,String> previousNodes,String endNode){
        List<String> reversedShortestPath = new ArrayList<>();

        String currentNode = endNode;

        while(currentNode != null){
            reversedShortestPath.add(currentNode);
            currentNode = previousNodes.get(currentNode);
        }

        Collections.reverse(reversedShortestPath);
        return reversedShortestPath.toArray(new String[0]);
    }

    public static String[] getPath(Map<String, String[]> graph, String startNode, String endNode){

        if(!graph.containsKey(startNode)) throw new IllegalArgumentException("Start node is not in graph");

        if(!graph.containsKey(endNode)) throw new IllegalArgumentException("End node is not in graph");

        Queue<String> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.add(startNode);

        Map<String,String> howWeReachedNodes = new HashMap<>();
        howWeReachedNodes.put(startNode,null);

        while(!nodesToVisit.isEmpty()){
            String currentNode = nodesToVisit.remove();

            if(currentNode.equals(endNode))return reconstructPath(howWeReachedNodes,endNode);

            for(String neighbor: graph.get(currentNode)){
                if(!howWeReachedNodes.containsKey(neighbor)){
                    nodesToVisit.add(neighbor);
                    howWeReachedNodes.put(neighbor,currentNode);
                }
            }
        }
        return null;
    }

}
