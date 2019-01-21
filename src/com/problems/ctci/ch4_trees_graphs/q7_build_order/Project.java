package com.problems.ctci.ch4_trees_graphs.q7_build_order;

import java.util.*;

public class Project {
    private List<Project> children = new ArrayList<>();
    private String name;
    private int dependencyCount = 0;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addChild(Project project) {children.add(project);}

    public void incrementDependencies() {
        dependencyCount++;
    }

    public List<Project> getChildren() {
        return children;
    }

    public void decrementDependencies() {
        dependencyCount--;
    }

    public int getNumberDependencies() {
        return dependencyCount;
    }
}

