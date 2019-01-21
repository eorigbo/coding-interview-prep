package com.problems.ctci.ch4_trees_graphs.q7_build_order;

import java.util.*;

public class Graph {
    private LinkedHashMap<String, Project> projectsGraph = new LinkedHashMap<>();

    public void addProjectToGraph(String projectName) {
            Project project = new Project(projectName);
            projectsGraph.put(projectName, new Project(projectName));
    }

    public Project getProject(String projectName){
        return projectsGraph.get(projectName);
    }

    public void addDependency(String parentName, String childName) {
        Project parent = getProject(parentName);
        Project child = getProject(childName);
        parent.addChild(child);
        child.incrementDependencies();
    }

    public ArrayList<Project> getProjects() {
        ArrayList<Project> projects = new ArrayList<>(projectsGraph.values());
        return projects;
    }

}
