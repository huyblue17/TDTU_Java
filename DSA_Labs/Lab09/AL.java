import java.util.*;

public class AL extends Graph{
    LinkedList<Integer>[] AL;

    @Override
    public void read() {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        AL = new LinkedList[V];
        
        for (int i = 0; i < V; i++) {
            AL[i] = new LinkedList<>();
        }
        int u, v, w;
        for (int i = 0; i < E; i++) {
            u = sc.nextInt();
            v = sc.nextInt();
            w = sc.nextInt();
            AL[u].add(v);
            AL[v].add(u);
        }
        sc.close();
    }
}
