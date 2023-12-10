import java.util.NoSuchElementException;

public interface ListInterface<E> {
    public void addFirst(E item);
    public void addAfter(Node<E> curr, E item);
    public void addLast(E item);
    
    public E removeFirst() throws NoSuchElementException;
    public E removeAfter(Node<E> curr) throws NoSuchElementException;
    public E removeLast() throws NoSuchElementException;
    public E removeCurr(Node<E> curr);


    public void print();
    public boolean isEmpty();
    public E getFirst() throws NoSuchElementException;
    public Node<E> getHead();
    public int size();
    public boolean contains(E item);    


    //EX3
    public int countEven();
    public int countPrime();
    public void addBeforeFEven(E item);
    public E findMax();
    public String reverse();

    //Lab03_EX4
    public void addSortedList(E item);
    public int sumAll();
}
