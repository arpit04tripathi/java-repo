package org.a04t.java_repo.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SLLNodeTest {
    @Test
    void testConstructor() {
        SLLNode node = new SLLNode(25);
        assertEquals(25, node.getData());
        assertEquals(null, node.getNext());
    }
}