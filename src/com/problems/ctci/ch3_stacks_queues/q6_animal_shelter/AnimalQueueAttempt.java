package com.problems.ctci.ch3_stacks_queues.q6_animal_shelter;

import java.util.LinkedList;

public class AnimalQueueAttempt {

    //initialize properties for dog queue and cat queue, and order
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    int order;

    public AnimalQueueAttempt(){
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    //enqueue
    public void enqueue(Animal animal){
        order++;
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.order = order;
            dogs.addLast(dog);
        }else{
            Cat cat = (Cat)animal;
            cat.order = order;
            cats.addLast(cat);
        }
    }


    //dequeueAny
    public Animal dequeueAny(){
        if(dogs.size() == 0 && cats.size() == 0){
            return null;
        }else if(dogs.size() == 0 && cats.size() > 0){
            return dequeueCat();
        }else if(dogs.size() > 0 && cats.size() == 0){
            return dequeueDog();
        }else{
            Dog dog = peekDog();
            Cat cat = peekCat();
            if(dog.order < cat.order){
                return dequeueDog();
            }else{
                return dequeueCat();
            }
        }
    }

    //dequeueAny
    public Animal peekAny(){
        if(dogs.size() == 0 && cats.size() == 0){
            return null;
        }else if(dogs.size() == 0 && cats.size() > 0){
            return peekCat();
        }else if(dogs.size() > 0 && cats.size() == 0){
            return peekDog();
        }else{
            Dog dog = peekDog();
            Cat cat = peekCat();
            if(dog.order < cat.order){
                return dog;
            }else{
                return cat;
            }
        }
    }

    //dequeCats
    public Cat dequeueCat(){
        if(cats.size() == 0) return null;
        return cats.poll();
    }

    //dequeDogs
    public Dog dequeueDog(){
        if(dogs.size() == 0) return null;
        return dogs.poll();
    }

    public Cat peekCat(){
        if(cats.size() == 0) return null;
        return cats.peek();
    }

    public Dog peekDog(){
        if(dogs.size() == 0) return null;
        return dogs.peek();
    }

    //abstract class Animal
    public abstract static class Animal{
        protected String name;
        int order;

        Animal(String name){
            this.name = name;
            order = 0;
        }

        abstract String getName();
    }

    public static class Dog extends Animal{
        Dog(String name){
            super(name);
        }

        String getName(){
            return "Dog: " + name;
        }
    }

    public static class Cat extends Animal{
        Cat(String name){
            super(name);
        }

        String getName(){
            return "Cat: " + name;
        }
    }

}
