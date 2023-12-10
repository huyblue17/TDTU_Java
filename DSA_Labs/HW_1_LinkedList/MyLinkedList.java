import java.util.NoSuchElementException;

public class MyLinkedList implements ListInterface {
    Node head;

    @Override
    public void addFirst(int item) {
        head = new Node(item, head);
    }

    @Override
    public int count() {
        int size = 0;

        for (Node n = head; n != null; n = n.getNext()) {
            size++;
        }
        return size;
    }

    @Override
    public void print() {
        System.out.print("[");
        for(Node n = head; n != null; n = n.getNext()) {
            System.out.print(n.getElement() + " ");
        }
        System.out.println("]");
    }

    @Override
    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        int value = head.getElement();
        head = head.getNext();
        return value;
    }
    @Override
    public int getMax() {
        if (head == null)
            throw new NoSuchElementException();
        int max = head.element;
        Node current = head.next;
        while (current != null) {
            if (current.element > max) {
                max = current.element;
            }
            current = current.next;
        }
        return max;
    }
    
    @Override
    public int sumEven() {
        int sum = 0;
        Node dem = head;
        while (dem != null) {
            if (dem.element % 2 == 0) {
                sum += dem.element;
            }
            dem = dem.next;
        }
            return sum;
    }
    @Override
    public int countKey(int x) {
        int  ck = 0;
        Node dem = head;
        while (dem != null) {
            if ( dem.element == x) 
                ck++;     
            dem = dem.next; 
        }
        return ck;
    }
}