public class Edge implements Comparable<Edge> {
    protected int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    public String toString() {
        return String.format("(%d, %d, %d)", src, dest, weight);
    }

    @Override
    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}