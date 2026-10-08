package dataStructureAnalyzer;

import java.util.Stack;

public class StackOperations {
   private final Stack<Integer> stack = new Stack<>();

    public void push(int value) {
        stack.push(value);
        System.out.println("Value pushed successfully.");
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        System.out.println("Popped value: " + stack.pop());
    }

    public void peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top value: " + stack.peek());
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack Elements:");
        for (Integer value : stack) System.out.print(value + " ");
        System.out.println();
    }
}
