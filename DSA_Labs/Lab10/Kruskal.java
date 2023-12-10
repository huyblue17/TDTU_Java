import java.util.*;

class Edge {
    int src;
    int dest;
    int weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class DisjointSet {

    private int[] parent;
    private int[] rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int u) {
        if (parent[u] != u) {
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }

    public void union(int u, int v) {
        int uRoot = find(u);
        int vRoot = find(v);

        if (uRoot == vRoot) {
            return;
        }

        if (rank[uRoot] > rank[vRoot]) {
            parent[vRoot] = uRoot;
        } else if (rank[uRoot] < rank[vRoot]) {
            parent[uRoot] = vRoot;
        } else {
            parent[vRoot] = uRoot;
            rank[uRoot]++;
        }
    }

    public boolean isConnected(int u, int v) {
        return find(u) == find(v);
    }
}

class Kruskal {

    static void kruskalMST(Edge[] edges, int V) {

        // Create a DisjointSet to keep track of the connected components.
        DisjointSet ds = new DisjointSet(V);

        // Create a set to store the edges of the MST.
        Set<Edge> mstSet = new HashSet<>();

        // Sort the edges in ascending order of weight.
        Arrays.sort(edges, Comparator.comparingInt(e -> e.weight));

        // Iterate over the edges and add them to the MST if they do not form a cycle.
        for (Edge edge : edges) {
            int src = edge.src;
            int dest = edge.dest;

            if (!ds.isConnected(src, dest)) {
                mstSet.add(edge);
                ds.union(src, dest);
            }
        }

        // Print the edges of the MST.
        for (Edge edge : mstSet) {
            System.out.println(edge.src + " - " + edge.dest + " (" + edge.weight + ")");
        }
    }

    public static void main(String[] args) {

        // Create a graph with 4 vertices.
        int V = 4;

        // Create an array of edges.
        Edge[] edges = {
                new Edge(0, 1, 4),
                new Edge(0, 2, 8),
                new Edge(1, 2, 2),
                new Edge(1, 3, 6),
                new Edge(2, 3, 7)
        };

        // Find the MST using Kruskal's algorithm.
        kruskalMST(edges, V);
    }
}
