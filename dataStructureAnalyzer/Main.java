package dataStructureAnalyzer;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayOperations arrayOperations = new ArrayOperations(100);
    static StackOperations stackOperations = new StackOperations();
    static QueueOperations queueOperations = new QueueOperations();
    static LinkedListOperations linkedListOperations = new LinkedListOperations();
    static SearchingOperations searchingOperations = new SearchingOperations();
    static GraphOperations graphOperations = new GraphOperations();
    static PerformanceAnalyzer performanceAnalyzer = new PerformanceAnalyzer();

    public static void main(String[] args) {
        int choice;
        do {
            displayMainMenu();
            choice = getIntegerInput("Enter your choice: ");
            switch (choice) {
                case 1 -> arrayMenu();
                case 2 -> stackMenu();
                case 3 -> queueMenu();
                case 4 -> linkedListMenu();
                case 5 -> searchingMenu();
                case 6 -> graphMenu();
                case 7 -> performanceMenu();
                case 8 -> displayAllResults();
                case 9 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 9);
        scanner.close();
    }

    static void displayMainMenu() {
        System.out.println("\n==============================================");
        System.out.println("     DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("==============================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
        System.out.println("==============================================");
    }

    static void arrayMenu() {
        int choice;
        do {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert\n2. Delete\n3. Search\n4. Display\n5. Back");
            choice = getIntegerInput("Enter choice: ");
            switch (choice) {
                case 1 -> arrayOperations.insert(getIntegerInput("Enter value: "));
                case 2 -> arrayOperations.delete(getIntegerInput("Enter value: "));
                case 3 -> {
                    int result = arrayOperations.search(getIntegerInput("Enter value: "));
                    System.out.println(result == -1 ? "Value not found." : "Found at index: " + result);
                }
                case 4 -> arrayOperations.display();
                case 5 -> {}
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void stackMenu() {
        int choice;
        do {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Back");
            choice = getIntegerInput("Enter choice: ");
            switch (choice) {
                case 1 -> stackOperations.push(getIntegerInput("Enter value: "));
                case 2 -> stackOperations.pop();
                case 3 -> stackOperations.peek();
                case 4 -> stackOperations.display();
                case 5 -> {}
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void queueMenu() {
        int choice;
        do {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Front\n4. Display\n5. Back");
            choice = getIntegerInput("Enter choice: ");
            switch (choice) {
                case 1 -> queueOperations.enqueue(getIntegerInput("Enter value: "));
                case 2 -> queueOperations.dequeue();
                case 3 -> queueOperations.peek();
                case 4 -> queueOperations.display();
                case 5 -> {}
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void linkedListMenu() {
        int choice;
        do {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert\n2. Delete\n3. Search\n4. Display\n5. Back");
            choice = getIntegerInput("Enter choice: ");
            switch (choice) {
                case 1 -> linkedListOperations.insert(getIntegerInput("Enter value: "));
                case 2 -> linkedListOperations.delete(getIntegerInput("Enter value: "));
                case 3 -> {
                    boolean found = linkedListOperations.search(getIntegerInput("Enter value: "));
                    System.out.println(found ? "Value found." : "Value not found.");
                }
                case 4 -> linkedListOperations.display();
                case 5 -> {}
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    static void searchingMenu() {
        int size = getIntegerInput("Enter number of elements: ");
        if (size <= 0) {
            System.out.println("Size must be greater than zero.");
            return;
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = getIntegerInput("Enter element " + (i + 1) + ": ");
        }
        int target = getIntegerInput("Enter value to search: ");
        searchingOperations.compareSearch(array, target);
    }

    static void graphMenu() {
        int choice;
        do {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex\n2. Add Edge\n3. Display Graph\n4. BFS\n5. DFS\n6. Back");
            choice = getIntegerInput("Enter choice: ");
            switch (choice) {
                case 1 -> graphOperations.addVertex(getIntegerInput("Enter vertex: "));
                case 2 -> {
                    int source = getIntegerInput("Enter source: ");
                    int destination = getIntegerInput("Enter destination: ");
                    graphOperations.addEdge(source, destination);
                }
                case 3 -> graphOperations.displayGraph();
                case 4 -> graphOperations.bfs(getIntegerInput("Enter starting vertex: "));
                case 5 -> graphOperations.dfs(getIntegerInput("Enter starting vertex: "));
                case 6 -> {}
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }

    static void performanceMenu() {
        int[] testArray = {10,20,30,40,50,60,70,80,90,100};
        int target = getIntegerInput("Enter value to search: ");
        performanceAnalyzer.compareLinearAndBinarySearch(testArray, target);
    }

    static void displayAllResults() {
        System.out.println("\n========== CURRENT DATA ==========");
        System.out.println("\nArray:"); arrayOperations.display();
        System.out.println("\nStack:"); stackOperations.display();
        System.out.println("\nQueue:"); queueOperations.display();
        System.out.println("\nLinked List:"); linkedListOperations.display();
        System.out.println("\nGraph:"); graphOperations.displayGraph();
    }

    static int getIntegerInput(String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) return scanner.nextInt();
            System.out.println("Invalid input. Enter a number.");
            scanner.next();
        }
    }
}
