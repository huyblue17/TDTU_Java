public class TestPre {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(10);

        queue.enQueue(new Person("Alex", 3));
        queue.enQueue(new Person("Bob", 2));
        queue.enQueue(new Person("David", 6));
        queue.enQueue(new Person("Susan", 1));

        System.out.println(queue.deQueue());

        queue.enQueue(new Person("Mike", 5));
        queue.enQueue(new Person("Kelvin", 4));

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        queue.enQueue(new Person("Helen", 0));
        queue.enQueue(new Person("Paul", 8));

        System.out.println(queue.deQueue());
    }
}
