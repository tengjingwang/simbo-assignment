package me.tjwang.simbo_test;

class Node {
    public Node next = null;
    public int val = 0;

    // no default ctor to avoid mistakes(ex: forget adding stuff).
    @SuppressWarnings("unused")
    private Node() {}

    public Node(int val, Node next) {
        this.next = next;
        this.val = val;
    }
}

public class IntStack {
    Node top = null;
    public IntStack() {}
    public boolean isEmpty() {
        return null == top;
    }
    public void checkEmpty() throws OperationException {
        if(this.isEmpty()) {
            throw new OperationException();     // change me
        }
    }
    public IntStack push(int entry) {
        if(this.isEmpty()) {
            this.top = new Node(entry, null);
        } else {
            Node newTop = new Node(entry, this.top);
            this.top = newTop;
        }
        return this;
    }
    public int pop() throws OperationException {
        this.checkEmpty();
        int val = this.top.val;
        this.top = this.top.next;
        return val;
    }

    public int peek() throws OperationException {
        this.checkEmpty();
        return this.top.val;
    }

    public int getMax() throws OperationException {
        this.checkEmpty();
        Node curr = this.top;
        int max = Integer.MIN_VALUE;
        while(curr != null) {
            if(curr.val > max) {max = curr.val;}
            curr = curr.next;
        }
        return max;
    }

    public class OperationException extends RuntimeException {
    }
}
