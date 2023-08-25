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
}