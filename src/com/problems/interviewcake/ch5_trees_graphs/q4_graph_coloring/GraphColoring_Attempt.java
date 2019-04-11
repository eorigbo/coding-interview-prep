package com.problems.interviewcake.ch5_trees_graphs.q4_graph_coloring;

import com.problems.interviewcake.ch5_trees_graphs.GraphNode;

import java.util.HashSet;
import java.util.Set;

public class GraphColoring_Attempt {
    public static void colorGraph(GraphNode[] graph, String[] colors){
        //if graph is null throw exception
        if(graph.length < 1) throw new IllegalArgumentException("At least one graph node is needed for coloring.");

        //loop through each node
        for(GraphNode node: graph){
            Set<String> usedColors = new HashSet<>();
            for(GraphNode neighbor: node.getNeighbors()){
                if(neighbor.equals(node)) throw new IllegalArgumentException("Node connects with itself and cannot be legally colored.");

                if(neighbor.hasColor()) usedColors.add(neighbor.getColor());
            }

            for(String color: colors){
                if(!usedColors.contains(color)){
                    node.setColor(color);
                    break;
                }
            }
        }

    }
}
