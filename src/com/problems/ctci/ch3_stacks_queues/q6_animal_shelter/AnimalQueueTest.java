package com.problems.ctci.ch3_stacks_queues.q6_animal_shelter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalQueueTest {
    @Test
    public void smallShelterTest(){
        AnimalQueueAttempt animalQueue = new AnimalQueueAttempt();
        animalQueue.enqueue(new AnimalQueueAttempt.Dog("Jack"));
        animalQueue.enqueue(new AnimalQueueAttempt.Dog("Jill"));
        animalQueue.enqueue(new AnimalQueueAttempt.Cat("White"));
        animalQueue.enqueue(new AnimalQueueAttempt.Cat("Pink"));

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
