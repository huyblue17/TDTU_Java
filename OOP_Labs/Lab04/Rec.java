import java.util.*;

public class Rec
{
    private float width;
    private float length;
    private float Area;
    private float Perimeter;

    public Rec()
    {
        width = 1.0f;
        length = 1.0f;
    }

    public Rec(float width, float length) 
    {
        this.width = width;
        this.length = length;
    }

    public float getWidth()
    {
        return this.width;
    }

    public void setWidth(float width)
    {
        this.width = width;
    }

    public float getLength()
    {
        return this.length;
    }

    public void setLength(float length)
    {
        this.length = length;
    }

    public float getArea() 
    {
        return this.width * this.length;
    }

    public float getPeri()
    {
        return (this.width + this.length)*2;
    }

    public String toString() 
    {
        return "Rectangle[width:" + this.width + ", length:" + this.length + "]";
    }


    public static void main(String[] args) 
    {
        Rec bien1 = new Rec(6,10);
        System.out.println("Width is: "+bien1.getWidth());
        System.out.println("Length is: "+bien1.getLength());
        System.out.println("Area of Rectangle is: "+bien1.getArea());
        System.out.println("Perimeter of Rectangle is: "+bien1.getPeri());
        System.out.println("Rectangle"+bien1.toString());
    }
}
