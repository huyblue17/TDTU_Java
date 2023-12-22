import java.util.Stack;

public class BST {
    Node x; //as root
    
    private Node insert(Node x, Integer key) {
        if (x == null)
            return new Node(key);
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            x.left = insert(x.left, key);
        else if (cmp > 0)
            x.right = insert(x.right, key);
        else
            x.key = key;
        return x;
    }

    //public
    public void insert(Integer key) {
        x = insert(x ,key);
    }

    public void NLR(Node x) {
        if (x != null) {
            System.out.print(x.key + " ");
            NLR(x.left);
            NLR(x.right);
        }
    }

    public void LNR(Node x) {
        // code here
        if (x != null)
            LNR(x.left);
            System.out.print(x.key + " ");
            LNR(x.right);
    }

    public void LRN(Node x) {
        // code here
        if (x != null)
            LNR(x.left);
            LNR(x.right);
            System.out.print(x.key + " ");
    }

    private Node search(Node x, Integer key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            return search(x.left , key);
        else if (cmp > 0)
            return search(x.right , key);
        else
            return x;
    }

    //public
    public Node search(Integer key) {
        return search(x, key);
    }

    private Node min(Node x) {
        if (x.left == null)
            return x;
        else
            return min(x.left);
    }

    //public
    public Node min() {
        return min(x);
    }

    private Node max(Node x) {
        // code here
        if (x.right == null)
            return x;
        else 
            return max(x.right);
    }

    //public
    public Node max() {
        return max(x);
    }

    private Node deleteMin(Node x) {
        if (x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        return x;
    }

    private Node delete(Node x, Integer key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            x.left = delete(x.left, key);
        else if (cmp > 0)
            x.right = delete(x.right, key);
        else {
            // node with only one child or no child
            if (x.right == null)
                return x.left;
            if (x.left == null)
                return x.right;
            // node with two children: Get the successor (smallest in
            // the right subtree)
            x.key = min(x.right).key;
            x.right = deleteMin(x.right);
        }
        return x;
    }

    //public
    public Node delete(Integer key) {
        return delete(x, key);
    }

    public boolean contains(Integer key) {
        // your code here
        if (search(x, key) != null)
            return true;
        return false;
    }
 
    private Node deleteMax(Node x) {
        if (x.right == null) 
            return x.left;
        x.right = deleteMax(x.right);
        return x;

    }
    public void deleteMax() {
        // your code here
        if (x.right != null)
            x.right = deleteMax(x.right);
    }



    private Node delete_pre(Node x, Integer key) {
         // your code here
         if(x == null){
            return null;
        }

        if(x.left != null){
            Node temp = x.left;
            while(temp.right != null){
                temp = temp.right;
            }
            return temp;
        }

        Node pre = null;
        Node root = x;
        while(root != null){
            if(key < root.key){
                root = root.left;
            }
            else if(key > root.key){
                pre = root;
                root = root.right;
            }
            else{
                if(root.left != null){
                    pre = max(root.left);
                }
                break;
            }
        }
        return pre;
    }

    public void delete_pre(Integer key) {
         if(x != null){
            x = delete_pre(x, key);
         }
    }

    

    private int getheight(Node x) {
        if (x == null) 
            return -1;
        return 1 + Math.max(getheight(x.right),getheight(x.left));
    }
    
    public int height() {
         // your code here
         return getheight(x);
    }

    public Integer sum(Node x) {
        if(x == null) 
            return 0;
        return x.key+sum(x.right) + sum(x.left);
    }

    public Integer sum() {
        return sum(x);
    }
    
    public Integer sumEven(Node x) {
        if(x == null) 
            return 0;
        if(x.key % 2 == 0) {
            return x.key+sum(x.right) + sum(x.left);
        }
        return sum(x.right) + sum(x.left);
    }

    public Integer sumEven() {
        return sumEven(x);
    }

    private int countLeaves(Node x){
        if(x == null) 
            return 0;
        if(x.right == null && x.left == null) {
            return 1 ;
        }
        return countLeaves(x.left) + countLeaves(x.right);
    }

    public int countLeaves() {
        return countLeaves(x);
    }

    public int sumEvenKeysAtLeaves(Node x) {
        if(x == null) 
            return 0;
        if(x.right == null && x.left == null) {
            if(x.key % 2 == 0)
                return x.key ;
            return 0;
        }
        return sumEvenKeysAtLeaves(x.left) + sumEvenKeysAtLeaves(x.right);
    }

    public int sumEvenKeysAtLeaves(){
        return sumEvenKeysAtLeaves(x);
    }

    public void bfs() {
        if (x == null) {
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(x);

        while (!stack1.isEmpty()) {
            Node node = stack1.pop();
            System.out.print(node.key + " ");

            if (node.left != null) {
                stack2.push(node.left);
            }

            if (node.right != null) {
                stack2.push(node.right);
            }

            if (stack1.isEmpty()) {
                Stack<Node> temp = stack1;
                stack1 = stack2;
                stack2 = temp;
            }
        }
    }
}