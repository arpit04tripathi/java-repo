package org.a04t.java_repo.common;

import lombok.Data;

@Data
public class SLLNode {
    public int data;
    public SLLNode next;

    public SLLNode(int data) {
        this.data = data;
    }
}
