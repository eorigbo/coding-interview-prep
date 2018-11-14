package com.problems.ctci.ch3_stacks_queues.q6_animal_shelter;

public abstract class Animal {
    private int order;
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    //definition of getName method to be implemented
    // in classes that extend Animal abstract class
    public abstract String getName();

    public void setOrder(int order){
        this.order = order;
    }

    public int getOrder(){
        return order;
    }

    public boolean isOlderThan(Animal animal){
        return this.order < animal.order; //double check
    }
}
