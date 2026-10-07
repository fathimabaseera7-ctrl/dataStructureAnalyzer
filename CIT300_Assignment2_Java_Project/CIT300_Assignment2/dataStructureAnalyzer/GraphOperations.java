package dataStructureAnalyzer;

import java.util.*;

public class GraphOperations {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    public void addVertex(int vertex) {
        if (graph.containsKey(vertex)) {
            System.out.println("Vertex already exists.");
            return;
        }
        graph.put(vertex, new ArrayList<>());
        System.out.println("Vertex added successfully.");
    }

    public void addEdge(int source, int destination) {
        if (!graph.containsKey(source)) addVertex(source);
        if (!graph.containsKey(destination)) addVertex(destination);
        graph.get(source).add(destination);
        System.out.println("Edge added successfully.");
    }

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
                if (visited.add(neighbour)) queue.offer(neighbour);
            }
        }
        System.out.println();
    }

    public void dfs(int startVertex) {
        if (!graph.containsKey(startVertex)) {
            System.out.println("Vertex not found.");
            return;
        }
        System.out.print("DFS Traversal: ");
        dfsRecursive(startVertex, new HashSet<>());
        System.out.println();
    }

    private void dfsRecursive(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        for (Integer neighbour : graph.get(vertex)) {
            if (!visited.contains(neighbour)) dfsRecursive(neighbour, visited);
        }
    }
}
