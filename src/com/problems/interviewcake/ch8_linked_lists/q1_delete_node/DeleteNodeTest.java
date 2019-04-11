package com.problems.interviewcake.ch8_linked_lists.q1_delete_node;

import com.problems.interviewcake.ch8_linked_lists.LinkedListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeleteNodeTest {
    @Test
    public void nodeAtBeginningTest() {
        LinkedListNode head = new LinkedListNode(1);
        appendToList(head, 2);
        appendToList(head, 3);
        appendToList(head, 4);

        DeleteNode_Attempt.deleteNode(head);

        LinkedListNode node = head;
        assertEquals(2, node.value);

        node = node.next;
        assertEquals(3, node.value);

        node = node.next;
        assertEquals(4, node.value);

        assertNull(node.next);
    }

    @Test
    public void nodeInTheMiddleTest() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode nodeToDelete = appendToList(head, 2);
        appendToList(head, 3);
        appendToList(head, 4);

        DeleteNode_Attempt.deleteNode(nodeToDelete);

        LinkedListNode node = head;
        assertEquals(1, node.value);

        node = node.next;
        assertEquals(3, node.value);

        node = node.next;
        assertEquals(4, node.value);

        assertNull(node.next);
    }

    @Test
    public void nodeAtTheEndTest() {
        LinkedListNode head = new LinkedListNode(1);
        appendToList(head, 2);
        appendToList(head, 3);
        LinkedListNode nodeToDelete = appendToList(head, 4);

        assertThrows(IllegalArgumentException.class, ()->{
            DeleteNode_Attempt.deleteNode(nodeToDelete);});

    }

    @Test
    public void oneNodeListTest() {
        LinkedListNode head = new LinkedListNode(1);
        assertThrows(IllegalArgumentException.class,()->{
            DeleteNode_Attempt.deleteNode(head);}) ;
    }

    private static LinkedListNode appendToList(final LinkedListNode head, int value) {
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new LinkedListNode(value);
        return current.next;
    }

}
