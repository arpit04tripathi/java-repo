package org.a04t.java_repo.ds.list;

import org.a04t.java_repo.common.SLLNode;

public class SinglyLinkedList {

    SLLNode head;
    int length;

    public SinglyLinkedList() {}

    public SinglyLinkedList(SLLNode head) {
        this.head = head;
    }

    public SinglyLinkedList(SinglyLinkedList sll) {
        this.head = sll.head;
    }

    public int size() {
        return this.length;
    }

    public SLLNode getHead() {
        return head;
    }

    public void setHead(SLLNode head) {
        this.head = head;
    }
}
