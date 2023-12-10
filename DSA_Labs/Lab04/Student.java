public class Student {
    public String name;
    public double mathematicsG;
    public double programmingG;
    public double DSA1;

    public Student(){}

    public Student(String name, double mathematicsG, double programmingG, double DSA1) {
        this.name = name;
        this.mathematicsG = mathematicsG;
        this.programmingG = programmingG;
        this.DSA1 = DSA1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getmathematicsG() {
        return mathematicsG;
    }

    public void setmathematicsG(double mathematicsG) {
        this.mathematicsG = mathematicsG;
    }

    public double getprogrammingG() {
        return programmingG;
    }

    public void setprogrammingG(double programmingG) {
        this.programmingG = programmingG;
    }

    public double getDSA1() {
        return DSA1;
    }

    public void setDSA1(double DSA1) {
        this.DSA1 = DSA1;
    }

    public double getStuAVG() {
        return (this.mathematicsG + this.programmingG + this.DSA1)/3.0;
    }

    public String toString() {
        return "Student["+"Mathematics:" + mathematicsG +"," + "Programming: " + "," + "DSA1: "+ DSA1 + "]";
    }
}