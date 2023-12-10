import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("Hung",90.0,80.0,70.0));
        s.add(new Student("Huy",80.0,70.0,60.0));
        s.add(new Student("Hao",70.0,60.0,50.0));
        Comparator<Student> AVGrade = new AVGcomp();
        s.sort(AVGrade);
        for(Student s1:s) {
            System.out.println(s1.getStuAVG());
        }
    }
}
