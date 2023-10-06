public class testShape 
{
    public static void main(String[] arg)
    {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        
        System.out.print("522H0077");

        double maxA = 0.0;
        Shape shapeA  = shapes[0];
        for (int i = 0; i < shapes.length; i++)
        {
            Shape shape = shapes[i];
            double area = shape.getArea();
            if (maxA < area)
            {
                maxA = area;
                shapeA = shape;
            }
        }

        System.out.print("Larget area: \n");
        System.out.print(shapeA);
        
    }
}
