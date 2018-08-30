package com.problems.interviewcake.test.stacks_queues;

import com.problems.interviewcake.code.stacks_queues.QueueWithTwoStacks_Attempt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueWithTwoStacksTest {
    @Test
    public void basicQueueOperationsTest() {
        final QueueWithTwoStacks_Attempt q = new QueueWithTwoStacks_Attempt();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        assertEquals( 1, q.dequeue(),"dequeue #1");
        assertEquals( 2, q.dequeue(), "dequeue #2");
        q.enqueue(4);
        assertEquals( 3, q.dequeue(), "dequeue #3");
        assertEquals( 4, q.dequeue(), "dequeue #4");
    }

    @Test
    public void exceptionWhenDequeueFromNewQueueTest() {
        final QueueWithTwoStacks_Attempt q = new QueueWithTwoStacks_Attempt();
        assertThrows(Exception.class,()->{
            q.dequeue();
        });

    }

    @Test
    public void exceptionWhenDequeueFromEmptyQueueTest() {
        final QueueWithTwoStacks_Attempt q = new QueueWithTwoStacks_Attempt();
        assertThrows(Exception.class,()->{
            q.enqueue(1);
            q.enqueue(2);
            q.dequeue();
            q.dequeue();
            q.dequeue();
        });
    }
}
