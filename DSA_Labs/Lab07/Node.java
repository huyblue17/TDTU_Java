public class Node {
    int key;
    Node left;
    Node right;
    int height;

    public Node(int key) {
        this.key = key;
        this.height = 0;
        this.left = null;
        this.right = null;
    }
}
