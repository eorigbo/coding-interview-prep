package com.problems.interviewcake.ch5_trees_graphs.q5_mesh_network;

import java.util.*;

public class MeshNetwork_Attempt {
    private static String[] reconstructPath(Map<String, String> previousNodes, String endNode){

        //start with endNode and reversedPath List
        String node = endNode;
        List<String> reversedPath = new ArrayList<>();

        while(node != null){
            reversedPath.add(node);
            node = previousNodes.get(node);
        }

        Collections.reverse(reversedPath);

        return reversedPath.toArray(new String[0]);

    }

    public static String[] getPath(Map<String, String[]> graph, String startNode, String endNode){
        if(!graph.containsKey(startNode) || !graph.containsKey(endNode)) throw new IllegalArgumentException("Start or end nodes not present in graph.");
        //nodesToVisit and nodesSeen
        Queue<String> nodesToVisit = new ArrayDeque<>();
        Map<String, String> nodesSeen = new HashMap<>();
        nodesToVisit.add(startNode);
        nodesSeen.put(startNode, null);

        //remove node and if it is the end noode, return reconstructPath
        while(!nodesToVisit.isEmpty()){
            String node = nodesToVisit.remove();
            if(node.equals(endNode)) return reconstructPath(nodesSeen, endNode);
            for(String neighbor: graph.get(node)){
                if(!nodesSeen.containsKey(neighbor)){
                    nodesToVisit.add(neighbor);
                    nodesSeen.put(neighbor, node);
                }
            }
        }

        return null;
    }
}
