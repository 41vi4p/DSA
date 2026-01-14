import java.util.*;

public class GraphTraversal {
    
    // Graph representation
    static List<List<Integer>> adj = new ArrayList<>();

    public static void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // Undirected
    }

    public static void bfs(int start) throws InterruptedException {
        System.out.println("Starting BFS from " + start + "...");
        
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>(); // LinkedList implements Queue
        
        visited[start] = true;
        q.add(start);
        
        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.println("Visited: " + node);
            Thread.sleep(500);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Init graph with 5 nodes
        for (int i=0; i<5; i++) adj.add(new ArrayList<>());

        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 3);
        addEdge(2, 4);

        bfs(0);
    }
}
