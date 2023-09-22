package org.example.exercises.exercisesix;

public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;

    public void insertAtHead(int data) {
        Node tempNode = new Node(data);
        if(head == null) {
            head = tempNode;
            tail = tempNode;
        } else {
            tempNode.setNext(head);
            head.setPrevious(tempNode);
            head = tempNode;
        }
    }

    public void insertAtTail(int data) {
        Node tempNode = new Node(data);
        if(tail == null) {
            tail = tempNode;
            head = tempNode;
        } else {
            tail.setNext(tempNode);
            tempNode.setPrevious(tail);
            tail = tempNode;
        }
    }

    public void deleteAtHead() {
        if(head == null) {
            return;
        }
        if(head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node temp = head;
        head = head.getNext();
        head.setPrevious(null);
        temp.setNext(null);
    }

    public void deleteAtTail() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.getPrevious();
        tail.setNext(null);
        temp.setPrevious(null);
    }

    public void delete(int position) {
        if (head == null) {
            return;
        }

        if (position == 1) {
            deleteAtHead();
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count != position) {
            current = current.getNext();
            count++;
        }

        if (current == null) {
            System.out.println("Position wrong");
            return;
        }

        if (current == tail) {
            deleteAtTail();
            return;
        }

        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        current.setPrevious(null);
        current.setNext(null);
    }
}
