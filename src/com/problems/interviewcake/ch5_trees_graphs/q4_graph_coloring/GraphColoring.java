package com.problems.interviewcake.ch5_trees_graphs.q4_graph_coloring;

import com.problems.interviewcake.ch5_trees_graphs.GraphNode;

import java.util.HashSet;
import java.util.Set;

public class GraphColoring {
    public static void colorGraph(GraphNode[] graph, String[] colors){
        for(GraphNode node: graph){
            //get the node's neighbors
            Set<GraphNode> neighbors = node.getNeighbors();

            //check if node has a loop which means it can't be legally colored
            if(neighbors.contains(node)) throw new IllegalArgumentException("Nodes with loops cannot be legally colored.");

            //loop through neighbors set and figure out which neighbors are already colored
            //those colors can't be used by the current node
            Set<String> illegalColors = new HashSet<>();
            for (GraphNode neighbor: neighbors){
                if(neighbor.hasColor()) illegalColors.add(neighbor.getColor());
            }

            //loop through colors and assign the first one not being used by a neighbor
            for(String color: colors){
                if(!illegalColors.contains(color)){
                    node.setColor(color);
                    break;
                }
            }
        }
    }
}
