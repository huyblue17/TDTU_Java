public class DoubleNode {
    private double data;
    private DoubleNode prev;
    private DoubleNode next;

    public DoubleNode(double data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public double getData() {
        return data;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}