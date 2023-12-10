public class Person implements Comparable<Person> {
    String name;
    int priority;

    public Person(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return String.format("(%s, %d)", this.name, this.priority);
    }

    @Override
    public int compareTo(Person o) {
        return this.priority - o.priority;
    }
}