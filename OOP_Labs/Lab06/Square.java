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

    @Override
    public String toString()
    {
        return super.toString();
    }
}
