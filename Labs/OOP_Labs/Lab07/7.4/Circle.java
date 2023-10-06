public class Circle implements Geo
{
    protected double radius;
    
    public Circle()
    {
        this.radius = 0.0;
    }
    
    public Circle(double radius)
    {
        this.radius = radius;
    }

    
    public double getArea()
    {
        return 3.14*radius*radius; 
    }

    public double getPerimeter()
    {
        return radius*2.0*3.14;
    }

    @Override
    public String toString()
    {
        return "Circle: Radius = " + radius;
    }

    @Override
    public double getPermimeter() 
    {
        return 0;
    }
}
