package com.problems.ctci.ch3_stacks_queues.q6_animal_shelter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalQueueTest {
    @Test
    public void smallShelterTest(){
        AnimalQueue animalQueue = new AnimalQueue();
        animalQueue.enqueue(new Dog("Jack"));
        animalQueue.enqueue(new Dog("Jill"));
        animalQueue.enqueue(new Cat("White"));
        animalQueue.enqueue(new Cat("Pink"));

        String expectedName = "Dog: Jack";
        String actualName = animalQueue.peekAny().getName();

        Assertions.assertTrue(expectedName.equals(actualName));

        expectedName = "Cat: White";
        actualName = animalQueue.dequeueCat().getName();

        Assertions.assertTrue(expectedName.equals(actualName));

        expectedName = "Dog: Jack";
        actualName = animalQueue.dequeueAny().getName();

        Assertions.assertTrue(expectedName.equals(actualName));
    }


}
