package com.problems.ctci.ch3_stacks_queues.q6_animal_shelter;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    public String getName(){
        return "Cat: " + name;
    }
}
