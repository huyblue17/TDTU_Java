import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AM extends Graph {
    int[][] AM;

    @Override
    public void read() {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();

        AM = new int[V][V];
        for (int i = 0; i < V; i ++) {
            for (int j = 0; j < V; j++) {
                AM[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    @Override
    public void print() {
        System.out.println(V + " " + E);
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.printf("%-3d", AM[i][j]);
            }
            System.out.println();
        }
    }

    public int getVertices() {
        System.out.println("Count Vertices: " + AM.length);
        return AM.length;    
    }

    public int getEdges(int[][] AM) {
        int count = 0;
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (AM[i][j] != 0) {
                    count++;
                }
            }
        }
        System.out.println("Count Edges: " + count/2);
        return count;
    }

    public List<Integer> getNeighbors(int[][] AM, int u) {
        List<Integer> nb = new ArrayList<>();
        for (int j = 0; j < AM[u].length; j++) {
            if (AM[u][j] != 0) {
                nb.add(j);
            }
        }
        return nb;
    }

    public boolean checkExistence(int u, int v) {
        if (AM[u][v] != 0) {
            return true;
        }
        return false;
    }
}
