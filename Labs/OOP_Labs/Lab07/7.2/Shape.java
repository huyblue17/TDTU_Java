public class Shape
{
    private static final Object Shape = null;
    private String color = "red";
    private boolean filled = true;
    
    public Shape()
    {
        this("", true);
    }

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String Color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return true;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public boolean equals(Shape s)
    {
        return this.color == s.color && this.filled == s.filled;
    }
    
    public String toString()
    {
        return "Shape: Color =" + getColor() + ", filled = " + isFilled();
    }

    public double getArea() 
    {
        return 0;
    }
}
