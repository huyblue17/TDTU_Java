import java.util.ArrayList;

public class PersonModel {
    private ArrayList<Person> people = new ArrayList<>();

    public void add(Person person) {
        people.add(person);
    }

    public void display() {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}