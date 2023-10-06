public class Employee extends Person {
    private int id;
    private double salary;

    public Employee(String name, int birthYear, int id, double salary) {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() 
    {
        return "Employee{" + "name='" + getName() + '\'' + ", birthYear=" + getBirthYear() + ", id=" + id + ", salary=" + salary + '}';
    }
}