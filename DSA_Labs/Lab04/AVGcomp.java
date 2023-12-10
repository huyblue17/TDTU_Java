import java.util.Comparator;

public class AVGcomp implements Comparator<Student> {
    public int compare(Student a, Student b){
        double temp = (a.getStuAVG() - b.getStuAVG());
        if(temp < 0) return -1;
        if(temp > 0) return 1;
        return 0;
    }

}
