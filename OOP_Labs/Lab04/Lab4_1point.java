import java.util.*;

public class Lab4_1point 
{
    private float x;
    private float y;

    public Lab4_1point() 
    {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Lab4_1point(float x, float y) 
    {
        this.x = x;
        this.y = y;
    }

    public float getX() 
    {
        return x;
    }

    public float getY() 
    {
        return y;
    }

    public void setX(float x) 
    {
        this.x = x;
    }

    public void setY(float y) 
    {
        this.y = y;
    }

    public void setLocation(float x, float y) 
    {
        this.x = x;
        this.y = y;
    }

    public void translate(float dx, float dy) 
    {
        this.x += dx;
        this.y += dy;
    }

    public float distance(Lab4_1point other) 
    {
        float dx = this.x - other.x;
        float dy = this.y - other.y;
        return (float) Math.sqrt(dx*dx + dy*dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        
        System.out.print("522H0077-Tong Nguyen Gia Huy");
        Lab4_1point p1 = new Lab4_1point(5, 1);
        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
    
        Lab4_1point p2 = new Lab4_1point(2, 3);
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}