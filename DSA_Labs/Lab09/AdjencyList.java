import java.util.*;

public class AdjencyList {
    private int V;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("Unchecked")
    public AdjencyList(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex" + i + ": ");
            System.out.print("head");
            for (Integer v : adj[i]) {
                System.out.print("->" + v);
            }
            System.out.println();
        }
    }
}
