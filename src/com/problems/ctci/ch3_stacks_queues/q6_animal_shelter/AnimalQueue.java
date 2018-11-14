package com.problems.ctci.ch3_stacks_queues.q6_animal_shelter;

import java.util.LinkedList;

public class AnimalQueue {
    private LinkedList<Dog> dogs;
    private LinkedList<Cat> cats;
    private int order;

    public AnimalQueue(){
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    public void enqueue(Animal animal){
        animal.setOrder(order);
        order++;
        if(animal instanceof Dog){
            dogs.addLast((Dog)animal);
        }
        else if(animal instanceof Cat){
            cats.addLast((Cat)animal);
        }
    }

    public Animal dequeueAny(){
        if(dogs.size() == 0){
            return dequeueCat();
        }else if (cats.size() == 0){
            return dequeueDog();
        }

        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();

        if(oldestDog.isOlderThan(oldestCat)) return dogs.poll();
        else return cats.poll();
    }

    public Dog dequeueDog(){
        return dogs.poll();
    }

    public Cat dequeueCat(){
        return cats.poll();
    }

    public Dog peekDog(){
        return dogs.peek();
    }

    public Cat peekCat(){
        return cats.peek();
    }

    public Animal peekAny(){
        if(dogs.size() == 0){
            return peekCat();
        }else if (cats.size() == 0){
            return peekDog();
        }

        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();

        if(oldestDog.isOlderThan(oldestCat)) return dogs.peek();
        else return cats.peek();
    }

}
