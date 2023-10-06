public class Square extends Rectangle
{
    public Square()
    {

    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return length;
    }

    public void setSide(double side)
    {
        this.length = side;
        this.width = side;
    }

    public void setWidth(double width)
    {
        super.setWidth(width);
    }

    public void setLength(double length)
    {
        super.setLength(length);
    }

    public boolean equals(Shape s)
    {
        if (s instanceof Square)
        {
            Square temp = (Square) s;
            if (this.length == temp.length)
                return true;
        }
        return false;     
    }

    public String toString()
    {
        return super.toString();
    }
}

