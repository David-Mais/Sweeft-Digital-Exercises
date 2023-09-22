package org.example.exercises.exercisesix;

public class Node {
    private int info;
    private Node next;
    private Node previous;

    public Node(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
}
