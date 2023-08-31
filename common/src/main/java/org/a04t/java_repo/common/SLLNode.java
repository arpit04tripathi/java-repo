package org.a04t.java_repo.common;

public class SLLNode {
    public int data;
    public SLLNode next;

    public SLLNode(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public SLLNode getNext() {
        return next;
    }
    public void setNext(SLLNode next) {
        this.next = next;
    }
}
