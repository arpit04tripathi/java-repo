package org.a04t.java_repo.ds.list;

import org.a04t.java_repo.common.SLLNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    SinglyLinkedList sll;

    @BeforeEach
    void beforeEach() {
        sll = new SinglyLinkedList();
    }

    @Test
    void size() {
        assertEquals(0, sll.size());
    }

    @Test
    void getHead() {
        SLLNode node = new SLLNode(20);
        sll.setHead(node);
        assertEquals(node, sll.getHead());
    }

    @Test
    void setHead() {
        SLLNode node = new SLLNode(30);
        sll.setHead(node);
        assertEquals(node, sll.getHead());
    }

    @Test
    void run() {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(20).addFirst(50).addFirst(18).addLast(99).print();
        sll.deleteFirst();
        sll.print();
        System.out.println(String.format("SLL length is %d", sll.size()));
        System.out.println(String.format("Last Node Value is %d", sll.getLastNode().getData()));
        System.out.println(String.format("Node Value at index %d is %d", 1, sll.getNodeAt(1).getData()));
        sll.insertAt(2, 85);
        sll.insertAt(3, 67);
        sll.print();
        sll.deleteAt(2);
        sll.print();
        sll.reverseIterative();
        sll.print();
        sll.printRecursive();
        sll.print();
        sll.reverseRecursive();
        sll.print();
    }
}