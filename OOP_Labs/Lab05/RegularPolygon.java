import javax.lang.model.util.ElementScanner6;

public class RegularPolygon 
{
    private String name;
    private int edgeAmount; //amount of edge
    private double edgeLength; //length of edge
    
    public RegularPolygon()
    {
        this("", 3, 1);
    }

    public RegularPolygon(String string, int edgeAmount, double edgeLength)
    {
        this.name = string;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(String name, int edgeAmount)
    {
        this.edgeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon)
    {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getEdgdeAmount()
    {
        return this.edgeAmount;
    }

    public void setEdgeAmount(int edgeAmount)
    {
        this.edgeAmount = edgeAmount;
    }

    public double getEdgeLength()
    {
        return this.edgeLength;
    }

    public void setEdgeLength(double edgeLength)
    {
        this.edgeLength = edgeLength;
    }

    public String getPolygon()
    {
        if (this.edgeAmount == 3)
            return "Triangle";
        else if (this.edgeAmount == 4)
            return "Quadrangle";
        else if (this.edgeAmount == 5)
            return "Pentagon";
        else if (this.edgeAmount == 6)
            return "Hexagon";
        else
            return "Polygon has the number of edges greater than 6"; 

    }

    public double getPerimeter()
    {
        return this.edgeLength*this.edgeAmount;
    }

    public double getArea()
    {
        if (this.edgeAmount == 3)
            return this.edgeLength*this.edgeLength*0.433;
        else if (this.edgeAmount == 4)
            return this.edgeLength*this.edgeLength*1;
        else if (this.edgeAmount == 5)
            return this.edgeLength*this.edgeLength*1.72;
        else if (this.edgeAmount == 6)
            return this.edgeLength*this.edgeLength*2.595;
        else
            return -1;
    }

    public String toString()
    {
        return this.name + "-" + getPolygon() + "-" + getArea();
    }
}
