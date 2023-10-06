import java.util.HashMap;

public class test 
{
    public static void main(String[] args) {
        System.out.print("522H0077");
        
        PersonModel studentModel = new PersonModel();
        Student student1 = new Student("Huy", 2004, 1, 85);
        Student student2 = new Student("Kha", 2003, 2, 90);
        studentModel.add(student1);
        studentModel.add(student2);

        System.out.println("Student information:");
        studentModel.display();

        PersonModel employeeModel = new PersonModel();
        Employee employee1 = new Employee("Hieu", 2000, 1001, 50000);
        Employee employee2 = new Employee("Cuong", 2002, 1002, 60000);
        employeeModel.add(employee1);
        employeeModel.add(employee2);

        System.out.println("Employee information:");
        employeeModel.display();

        PersonModel personModel = new PersonModel();
        Person person1 = new Person("Minh Hieu", 2004);
        Person person2 = new Person("Gia Huy", 2003);
        personModel.add(person1);
        personModel.add(person2);

        System.out.println("Person information:");
        personModel.display();
    }
}