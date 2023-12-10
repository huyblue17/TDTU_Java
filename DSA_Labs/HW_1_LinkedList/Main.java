public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i < 10; i++) {
            list.addFirst(i);
        }
        list.print();
        System.out.println(list.removeFirst());
        list.print();
    }
}
