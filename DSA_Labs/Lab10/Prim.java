import java.util.*;

class Prim {

    static void primMST(int[][] adjMatrix, int V) {

        // Create a set to store the vertices of the MST.
        Set<Integer> mstSet = new HashSet<>();

        // Create a set to track visited nodes.
        Set<Integer> visited = new HashSet<>();

        // Create a priority queue to store the edges to be considered for the MST.
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        // Add the first vertex to the MST and mark it as visited.
        mstSet.add(0);
        visited.add(0);

        // While the MST is not complete, consider the edge with the minimum weight that connects a vertex in the MST to a vertex not in the MST.
        while (mstSet.size() != V) {

            // Find the edge with the minimum weight that connects a vertex in the MST to a vertex not in the MST.
            Edge minEdge = null;
            for (int u : mstSet) {
                for (int v = 0; v < V; v++) {
                    if (!visited.contains(v) && adjMatrix[u][v] > 0) {
                        Edge edge = new Edge(u, v, adjMatrix[u][v]);
                        if (minEdge == null || minEdge.weight > edge.weight) {
                            minEdge = edge;
                        }
                    }
                }
            }

            // If no valid edge was found, the MST is complete.
            if (minEdge == null) {
                break;
            }

            // Add the edge to the MST and mark the destination vertex as visited.
            mstSet.add(minEdge.dest);
            visited.add(minEdge.dest);
            pq.add(minEdge);
        }

        // Print the edges of the MST.
        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            System.out.println(edge.src + " - " + edge.dest + " (" + edge.weight + ")");
        }
    }

    public static void main(String[] args) {

        // Sample graph data
        int[][] adjMatrix = {
                {0, 4, 0, 0, 0},
                {4, 0, 8, 0, 0},
                {0, 8, 0, 2, 0},
                {0, 0, 2, 0, 7},
                {0, 0, 0, 7, 0}
        };

        primMST(adjMatrix, adjMatrix.length);
    }
}
