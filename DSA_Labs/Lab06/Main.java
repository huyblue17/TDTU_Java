public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(50);
        bst.insert(30);
        bst.insert(40);
        bst.insert(70);
        bst.insert(90);

        
        System.out.println(bst.contains(10));
    }
}
