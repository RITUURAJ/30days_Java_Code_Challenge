import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph {
    private int V; // Number of vertices
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        V = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // For an undirected graph
    }

    public void DFS(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (Integer neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                DFS(neighbor, visited);
            }
        }
    }

    public void DFS() {
        boolean[] visited = new boolean[V];

        System.out.println("Depth-First Search (DFS):");
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(i, visited);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);

        graph.DFS();
    }
}
