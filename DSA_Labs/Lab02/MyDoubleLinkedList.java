public class MyDoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(double data) {
        DoubleNode newNode = new DoubleNode(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(double data) {
        DoubleNode newNode = new DoubleNode(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void remove(double data) {
        DoubleNode current = head;
        while (current != null) {
            if (current.getData() == data) {
                if (current == head) {
                    head = current.getNext();
                    if (head != null) {
                        head.setPrev(null);
                    } else {
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = current.getPrev();
                    if (tail != null) {
                        tail.setNext(null);
                    } else {
                        head = null;
                    }
                } else {
                    DoubleNode prevNode = current.getPrev();
                    DoubleNode nextNode = current.getNext();
                    prevNode.setNext(nextNode);
                    nextNode.setPrev(prevNode);
                }
                size--;
                break;
            }
            current = current.getNext();
        }
    }

    public boolean contains(double data) {
        DoubleNode current = head;
        while (current != null) {
            if (current.getData() == data) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}