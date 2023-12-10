import java.util.LinkedList;
import java.util.Queue;

public class AdjencyMatrix {
    private int[][] adj;
    private final int nov; //number of vertices
    
    public AdjencyMatrix(int vertices) {
        nov = vertices;
        adj = new int[nov][nov];
    }

    public void setEdge(int vertexSource, int vertexDestination, int weight) {
        try {
            adj[vertexSource][vertexDestination] = weight;
            adj[vertexDestination][vertexSource] = weight;
        }
        catch (ArrayIndexOutOfBoundsException indexBounce){
            System.out.println("The vertex is invalid");
        }
    }

    public int getEdge(int vertexSource, int vertexDestination) {
        try {
            return adj[vertexSource][vertexDestination];
        }
        catch (ArrayIndexOutOfBoundsException indexBounce) {
            System.out.println("The vertex is invalid");
        }
        return -1;
    }

    public void printGraph() {
        for (int i = 0; i < nov; i++) {
            for (int j = 0; j < nov; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    //BFS
    public void BFS(int s) {
        boolean visited[] = new boolean[nov];

        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");

            for (int i = 0; i < nov; i++) {
                if (adj[x][i] != 0 && visited[1] == false) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    //DFS
    public void reDFS(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 0; i < nov; i++) {
            if (adj[v][i] != 0 && visited[i] == false) {
                reDFS(i, visited);
            }
        }
    }

    public void DFS(int s) {
        boolean[] visited = new boolean[nov];
        reDFS(s, visited);
    }
}