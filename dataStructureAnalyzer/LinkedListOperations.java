package dataStructureAnalyzer;

public class LinkedListOperations {

    private Node head;

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert a value at the end
    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println("Value inserted successfully.");
    }

    // Delete the first occurrence of a value
    public void delete(int value) {
        if (head == null) {
            System.out.println("Linked List is empty. Cannot delete.");
            return;
        }

        // Delete first node
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
            System.out.println("Value not found. Nothing was deleted.");
        } else {
            current.next = current.next.next;
            System.out.println("Value deleted successfully.");
        }
    }

    // Search for a value
    public boolean search(int value) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return false;
        }

        Node current = head;
        int position = 1;

        while (current != null) {
            if (current.data == value) {
                System.out.println("Value found at position: " + position);
                return true;
            }

            current = current.next;
            position++;
        }

        System.out.println("Value not found.");
        return false;
    }

    // Display all values
    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node current = head;
        int count = 0;

        System.out.println("Linked List Elements:");

        while (current != null) {
            System.out.print(current.data + " ");
            count++;
            current = current.next;
        }

        System.out.println();
        System.out.println("Total Elements: " + count);
    }
}