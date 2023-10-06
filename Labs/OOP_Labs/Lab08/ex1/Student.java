public class Student extends Person {
    private int id;
    private int score;

    public Student(String name, int birthYear, int id, int score) 
    {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getScore() 
    {
        return score;
    }

    public void setScore(int score) 
    {
        this.score = score;
    }

    @Override
    public String toString() 
    {
        return "Student{" + "name= " + getName() + ", birthYear=" + getBirthYear() + ", id=" + id + ", score=" + score + '}';
    }
}