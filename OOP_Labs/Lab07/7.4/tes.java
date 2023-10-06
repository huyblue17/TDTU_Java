public class tes 
{
    public static void main (String [] args)
    {
        Circle s = new Circle(3);
        ResizableCircle s1 = new ResizableCircle(5);
        
        System.out.println(s.toString());
        System.out.println("Area = " + s1.getArea());
        System.out.println("Perimeter = " + s1.getPerimeter());
    }
}
