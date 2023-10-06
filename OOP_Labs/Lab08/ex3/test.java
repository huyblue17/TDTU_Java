import java.util.ArrayList;

public class test 
{
    public static ArrayList<Student> findStudent(ArrayList<Student> lstStu) 
    {
        ArrayList<Student> result = new ArrayList<>();

        for (Student student : lstStu) 
        {
            String rank = student.getRank();
            if (rank.equals("A") || rank.equals("Passed")) 
            {
                result.add(student);
            }
        }

        return result;
    }

    public static void main(String[] args) 
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new ITStudent("Anh", 4.5, 1001));
        students.add(new ITStudent("An", 7.8, 1002));
        students.add(new ITStudent("Bao", 9.3, 1003));
        students.add(new MathStudent("Cuong", 3.7, "M1001"));
        students.add(new MathStudent("Han", 6.2, "M1002"));
        students.add(new MathStudent("Huy", 8.9, "M1003"));

        ArrayList<Student> result = findStudent(students);

        System.out.println("Students with rank A or Pass:");
        for (Student student : result) 
        {
            System.out.println(student.toString());
        }
    }
}