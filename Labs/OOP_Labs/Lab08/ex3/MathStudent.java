public class MathStudent extends Student 
{
    private String sID;

    public MathStudent(String sName, double gpa, String sID) 
    {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getRank() 
    {
        if (gpa >= 5)
        {
            return "Passed";
        } else 
        {
            return "Failed";
        }
    }

    public String toString() 
    {
        return "Math Student - ID: " + sID + ", " + super.toString();
    }
}