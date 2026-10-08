package dataStructureAnalyzer;

import java.util.*;

public class GraphOperations {
    private final Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add a new vertex
    public void addVertex(int vertex) {
        if (graph.containsKey(vertex)) {
            System.out.println("Vertex already exists.");
            return;
        }

        graph.put(vertex, new ArrayList<>());
        System.out.println("Vertex added successfully.");
    }

    // Add a directed edge between two vertices
    public void addEdge(int source, int destination) {
        if (!graph.containsKey(source)) {
            System.out.println("Source vertex does not exist. Adding it now.");
            addVertex(source);
        }

        if (!graph.containsKey(destination)) {
            System.out.println("Destination vertex does not exist. Adding it now.");
            addVertex(destination);
        }

        if (source == destination) {
            System.out.println("Self-loop is not allowed.");
            return;
        }

        if (graph.get(source).contains(destination)) {
            System.out.println("Edge already exists.");
            return;
        }

        graph.get(source).add(destination);
        System.out.println("Edge added successfully.");
    }

    // Display the graph
    public void displayGraph() {
        if (graph.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }

        System.out.println("\nGraph:");

        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            System.out.print(entry.getKey() + " -> ");

            for (Integer neighbour : entry.getValue()) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }
    }

    // Breadth First Search
    public void bfs(int startVertex) {
        if (!graph.containsKey(startVertex)) {
            System.out.println("Vertex not found.");
            return;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startVertex);
        visited.add(startVertex);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (Integer neighbour : graph.get(current)) {
                if (visited.add(neighbour)) {
                    queue.offer(neighbour);
                }
            }
        }

        System.out.println();
    }

    // Depth First Search
    public void dfs(int startVertex) {
        if (!graph.containsKey(startVertex)) {
            System.out.println("Vertex not found.");
            return;
        }

        System.out.print("DFS Traversal: ");
        dfsRecursive(startVertex, new HashSet<>());
        System.out.println();
    }

    // Recursive DFS helper
    private void dfsRecursive(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        for (Integer neighbour : graph.get(vertex)) {
            if (!visited.contains(neighbour)) {
                dfsRecursive(neighbour, visited);
            }
        }
    }
}