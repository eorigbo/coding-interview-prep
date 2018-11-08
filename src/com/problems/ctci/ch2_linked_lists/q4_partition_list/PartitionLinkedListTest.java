package com.problems.ctci.ch2_linked_lists.q4_partition_list;

import com.problems.ctci.ch2_linked_lists.LinkedListNode;
import org.junit.jupiter.api.Test;

import static com.problems.ctci.ch2_linked_lists.q4_partition_list.PartitionLinkedListStable.partition;

public class PartitionLinkedListTest {
    @Test
    public void midListTest(){
        LinkedListNode[] listNodes = LinkedListNode.valuesToLinkedListNodes(new int[]{3,5,10,2,8,2,1});
        LinkedListNode partitionedList = partition(listNodes[0],5);
        System.out.println("midListTest: " + partitionedList.printForward());
    }

    @Test
    public void largeListTest(){
        LinkedListNode[] listNodes = LinkedListNode.valuesToLinkedListNodes(new int[]{3,5,10,12,8,21,1,4,2,3,5,15,17,18});
        LinkedListNode partitionedList = partition(listNodes[0],8);
        System.out.println("largeListTest: " + partitionedList.printForward());
    }

    @Test
    public void singleListTest(){
        LinkedListNode[] listNodes = LinkedListNode.valuesToLinkedListNodes(new int[]{3});
        LinkedListNode partitionedList = partition(listNodes[0],8);
        System.out.println("singleListTest: " + partitionedList.printForward());
    }

    @Test
    public void smallListTest(){
        LinkedListNode[] listNodes = LinkedListNode.valuesToLinkedListNodes(new int[]{7,3,5,9,6});
        LinkedListNode partitionedList = partition(listNodes[0],6);
        System.out.println("smallListTest: " + partitionedList.printForward());
    }
}
