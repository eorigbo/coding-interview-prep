package com.problems.ctci.ch3_stacks_queues.q6_animal_shelter;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public String getName(){
        return "Dog: " + name;
    }
}
