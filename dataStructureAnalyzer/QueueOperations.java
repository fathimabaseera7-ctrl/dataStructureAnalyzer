package dataStructureAnalyzer;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    private Queue<Integer> queue = new LinkedList<>();

    public void enqueue(int value) {
        queue.offer(value);
        System.out.println("Value enqueued successfully.");
    }

    public void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        System.out.println("Dequeued value: " + queue.poll());
    }

    public void peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Front value: " + queue.peek());
    }

    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue Elements:");
        for (Integer value : queue) System.out.print(value + " ");
        System.out.println();
    }
}
