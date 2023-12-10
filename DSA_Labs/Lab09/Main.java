import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //AM test
        AM am = new AM();
        am.read();
        am.print();
        am.getVertices();
        am.getEdges(am.AM);
        
        int vertexU = 3;
        System.out.println("Neighbors of vertex " + vertexU + ": ");
        for (Integer neighbor : am.getNeighbors(am.AM, vertexU)) {
            System.out.println(neighbor);
        }

        boolean exist = am.checkExistence(1, vertexU);
        System.out.print("The existence: " + exist);

        //AL test
    }
}