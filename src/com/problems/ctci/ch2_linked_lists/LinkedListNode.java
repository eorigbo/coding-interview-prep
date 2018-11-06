package com.problems.ctci.ch2_linked_lists;

public class LinkedListNode {
    public int value;
    public LinkedListNode next;

    public LinkedListNode(int value){
        this.value = value;
    }

    public String printForward() {
        if (next != null) {
            return value + "->" + next.printForward();
        } else {
            return Integer.toString(value);
        }
    }

    public static LinkedListNode[] valuesToLinkedListNodes(int[] values) {
        final LinkedListNode[] nodes = new LinkedListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new LinkedListNode(values[i]);
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        return nodes;
    }

    public static LinkedListNode appendToList(LinkedListNode headNode, int value) {
        LinkedListNode current = headNode;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new LinkedListNode(value);
        return current.next;
    }
}
