public class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(int i) {
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return radius*radius*3.14;
    }

    public double getPerimeter()
    {
        return 2*radius*3.14;
    }

    public boolean equals(Shape s)
    {
        if (s instanceof Circle)
        {
            Circle temp = (Circle) s;
            if (this.radius == temp.radius)
                return true;
        }
        return false;     
    }

    public String toString()
    {
        return "Circle: Radius = " + getRadius() + ",color = " + getColor() + ", filled = " + isFilled() + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }
}
