package dataStructureAnalyzer;

public class LinkedListOperations {
    private Node head;

    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        System.out.println("Value inserted successfully.");
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        if (head.data == value) {
            head = head.next;
            System.out.println("Value deleted successfully.");
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Value not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Value deleted successfully.");
        }
    }

    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node current = head;
        System.out.println("Linked List Elements:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
