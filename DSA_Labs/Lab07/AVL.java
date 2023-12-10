public class AVL {
Node root;


    public int height(Node node) {
        if (node == null)
            return -1;
        return node.height;
    }

    private int checkBalance(Node root) {
        return height(root.left) - height(root.right);
    }

    private Node rotateLeft(Node root) {
        Node y = root.right;
        root.right = y.left;
        y.left = root;
        root.height = 1 + Math.max(height(root.left), height(root.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private Node rotateRight(Node root) {
        Node y = root.left;
        root.left = y.right;
        y.right = root;
        root.height = 1 + Math.max(height(root.left), height(root.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    private Node balance(Node root) {
        if (checkBalance(root) < -1) {
            if (checkBalance(root.right) > 0) {
                root.right = rotateRight(root.right);
            }
            root = rotateLeft(root);
        } else if (checkBalance(root) > 1) {
            if (checkBalance(root.left) < 0) {
                root.left = rotateLeft(root.left);
            }
            root = rotateRight(root);
        }
        return root;
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        node.height = 1 + Math.max(height(node.right), height(node.left));

        return balance(node);
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node delete(Node node, int key) {
        if (node == null)
            return null;

        if (key < node.key)
            node.left = delete(node.left, key);
        else if (key > node.key)
            node.right = delete(node.right, key);
        else {
            if (node.right == null || node.left == null) {
                Node temp = null;

                if (temp == node.right) {
                    temp = node.right;
                } else {
                    temp = node.left;
                }

                if (temp == null) {
                    temp = node;
                    node = null;
                } else {
                    node = temp;
                }
            } else {
                Node temp = minValue(node.right);
                node.key = temp.key;
                node.right = delete(node.right, key);
            }
        }
        if (node == null)
            return node;

        node.height = 1 + Math.max(height(node.right), height(node.left));

        return balance(node);
    }

    private Node minValue(Node root) {
        if (root.left == null)
            return root;
        else
            return minValue(root.left);
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.key + "");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrder(root);
    }
}