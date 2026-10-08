package dataStructureAnalyzer;

import java.util.Stack;

public class StackOperations {
    private final Stack<Integer> stack = new Stack<>();

    public void push(int value) {
        stack.push(value);
        System.out.println("Value pushed successfully.");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }

        System.out.println("Popped value: " + stack.pop());
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Top value: " + stack.peek());
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack Elements:");

        for (Integer value : stack) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    // Check whether the stack is empty
    private boolean isEmpty() {
        return stack.isEmpty();
    }
}