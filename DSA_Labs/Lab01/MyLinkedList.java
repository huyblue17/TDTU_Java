import java.util.Comparator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ListInterface<E> {
    private Node<E> head;
    private int numNode;

    public MyLinkedList(){
        head = null;
        numNode = 0;
    }

    @Override
    public void addFirst(E item) {
        head = new Node<>(item,head);
        numNode++;
    }


    @Override
    public void addAfter(Node <E> curr, E item){
        if(curr == null){
            addFirst(item);
        }
        else {
            Node<E> newNode = new Node<E>(item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
    }

    @Override
    public void addLast(E item) {
        if(isEmpty()){
            addFirst(item);
        } else {
            Node<E> temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            Node<E> n = new Node<E>(item,null);
            temp.setNext(n);
            numNode++;
        }
    }
    @Override
    public E removeFirst() throws NoSuchElementException {
        if(head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else{
            Node<E> tmp = head;
            head = head.getNext();
            numNode --;
            return tmp.getData();
        }
            
    }

    @Override
    public E removeAfter(Node<E> curr) throws NoSuchElementException {
        if(curr == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else
        {
            Node<E> delNode = curr.getNext();
            if(delNode != null) {
                curr.setNext(delNode.getNext());
                numNode --;
                return delNode.getData();
            }
            else{
                throw new NoSuchElementException("No next node to remove");
            }
        } 
    }
    @Override
    public E removeLast() throws NoSuchElementException {
        if(head == null){
            throw new NoSuchElementException("Can't remove element from an empty list");
        }
        else{
            Node<E> preNode = null;
            Node<E> delNode = head;
            if(delNode.getNext() == null){
                return removeFirst();
            }
            while(delNode.getNext() != null){
                preNode = delNode;
                delNode = delNode.getNext();
            }
            preNode.setNext(delNode.getNext());
            numNode --;
            return delNode.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return (head == null)? true:false;
    }

    @Override
    public void print() {
        if(head != null){
            Node<E> temp = head;
            System.out.print("List: " + temp.getData());
            temp = temp.getNext();
            while (temp != null) {
                System.out.print(" -> " + temp.getData());
                temp = temp.getNext();
            }
            System.out.println();
        }  else {
            System.out.println("List is empty");
        }
    }

    @Override
    public E getFirst() throws NoSuchElementException {
        if (isEmpty()){
            throw new NoSuchElementException("Empty list");
        }
        else{
            return head.getData();
        }
    }

    @Override
    public Node<E> getHead(){
        return head;
    }

    @Override
    public boolean contains(E item){
        Node<E> tmp = head;
        while(tmp != null){
            if(tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    @Override
    public E removeCurr(Node<E> curr) throws NoSuchElementException {
        if(isEmpty()) {
            throw new NoSuchElementException("Invalid Code");
        }
        else {
            Node<E> temp = head;
            while(temp.getNext() != curr){
                temp = temp.getNext();
            }
            temp.setNext(curr.getNext());
            numNode--;
        }
        return curr.getData();  
    }
    
    @Override
    public int countEven() {
        Node<E> temp = head;
        int count = 0;
        while(temp != null){
            if((int)temp.getData() % 2 == 0){
                count++;
            }
            temp = temp.getNext();
        }
        return count;
    }

    @Override
    public int countPrime() {
        int count = 0;
        Node<E> n = head;
        while(n != null){
            int check = 0;
            for(int i = 1; i <= (int)n.getData(); i++){
                if((int)n.getData() % i == 0){
                    check++;
                }
            }
            if((int)n.getData() >= 2 && check == 2){
                count++;
            }
            n = n.getNext();
        }
        return count;
    }

    public void addBefore(E item, Node<E> curr) {
        if(curr == head){
            addFirst(item);
        }
        else {
            Node<E> preCurr = head;
            while(preCurr.getNext() == curr) {
                addAfter(item, preCurr);
            }
        }
    }

    @Override
    public void addBeforeFEven(E item) {
        Node<E> n = new Node<E> ();
        for(n = head; n != null; n = n.getNext()){
            if((int)n.getData() % 2 == 0){
                addBefore(item, n);
                System.out.println("Added item before first even");
                break;
            }
        }

        int check = numNode;
        for(n = head; n != null; n = n.getNext()){
            if((int)n.getData() % 2 != 0)
                check--;
                if(check == 0) 
                    System.out.println("No even number in linked list");
        }
    }

    @Override
    public E findMax() {
        Node<E> n = new Node<>();
        Node<E> max = head;

        for(n = head.getNext() ; n != null ; n = n.getNext()){
            if((int)max.getData() < (int)n.getData()){
                max = n;
            }
        }

        return max.getData();
    }

    public void addAfter(E item, Node<E> curr) {
        if(isEmpty()){
            addFirst(item);
        }
        else {
            Node<E> newNode = new Node<E> (item, curr.getNext());
            curr.setNext(newNode);
            numNode++;
        }
    }
    
    @Override
    public int size() {
        return numNode;
    }

    @Override
    public String reverse() {
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;

        StringBuilder reversed = new StringBuilder();
        Node<E> temp = head;
        while (temp != null) {
            reversed.append(temp.getData()).append(" -> ");
            temp = temp.getNext();
        }
        reversed.setLength(reversed.length() - 4); 
        return reversed.toString();
    }
    
    @Override
    public int sumAll() {
        Node<E> current = head;
        int sum = 0;
        while (current != null) {
            sum += (int) current.getData();
            current = current.getNext();
        }
        return sum;
    }

    @Override
    public void addSortedList(E item) {
        Node<E> newNode = new Node<>(item);

        if (isEmpty() || ((Comparable<E>) item).compareTo(head.getData()) < 0) {
            newNode.setNext(head);
            head = newNode;
        } 
        else {
            Node<E> current = head;
            while (current.getNext() != null && ((Comparable<E>) item).compareTo(current.getNext().getData()) > 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
    }
        numNode++;
    }

}