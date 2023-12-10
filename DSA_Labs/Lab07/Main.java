public class Main {
    public static void main(String[] args) {
        AVL avl = new AVL();

        int[] values = {3, 6, 10, 47, 27, 87, 11, 38};
        for (int value : values)
            avl.insert(value);

        System.out.print("Duyet truoc");
        avl.preOrderTraversal();
        System.out.println();
    }
}
