import java.util.*;

public class Student
{
    private String id;
    private String firstName;
    private String lastName;
    private String Name;

    public Student(){
        String id="";
        String firstName="";
        String lastName="";
        String Name="";
    }

    public Student(String id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.Name=this.firstName+" "+this.lastName;
    }

    public String getID(){
        return this.id;
    }

    public void setID(String id){
        this.id=id;
    }

    public String getFN(){
        return this.firstName;
    }

    public void setFN(String firstName){
        this.firstName=firstName;
    }

    public String getLN(){
        return this.lastName;
    }

    public void setLN(String lastName){
        this.lastName=lastName;
    }

    public String getName(){
        return this.Name;
    }

    public void setName(String lastName, String firstName){
        this.Name=Name;
    }

    public String toString() {
        return "Student[id:" + this.id + ", First Name:" + this.firstName + ", Last Name:" + this.lastName +", Name:" +this.Name+"]";
    }
    
    public static void main(String[] args) 
    {            
        System.out.println("Enter your name");
        Student student= new Student("522H0077","Gia Huy","Tong Nguyen");
        System.out.println(student.getID());
        System.out.println(student.getFN());
        System.out.println(student.getLN());
        System.out.println(student.getName());
        System.out.println(student.toString());
    }
}
