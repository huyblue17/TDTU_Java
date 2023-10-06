public class Rectangle extends Shape
{
    protected double width = 1.0;
    protected double length = 1.0;
    
    public Rectangle()
    {

    }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length =length;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return width*length;
    }

    public double getPerimeter()
    {
        return width*2 + length*2;
    }

    @Override
    public String toString()
    {
        return "Rectangle: Width =" + getWidth() + ", length =" + getLength() + ", color =" + getColor() + ", filled =" + isFilled() + ", area =" + getArea() + ",perimeter =" + getPerimeter(); 
    }
}
