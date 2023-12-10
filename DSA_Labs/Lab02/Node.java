public class Node <E> {
    public E data;
    public Node <E> next;

    public Node(){
        data = null;
        next = null;
    }

    public Node(E data){
        this(data, null);
    }

    public Node(E data, Node <E> next){
        this.data = data;
        this .next = next;
    }

    public E getData(){
        return data;
    }    

    public Node <E> getNext(){
        return next;
    }

    public void setData(E data){
        this.data = data;
    }

    public void setNext(Node <E> next){
        this.next = next;
    }
}
