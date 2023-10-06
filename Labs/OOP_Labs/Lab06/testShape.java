public class testShape 
{
    public static void main(String[] arg)
    {
        Square sq = new Square(10, "red", false);
        Circle cir = new Circle(7, "blue", true);
        Rectangle rec = new Rectangle(4, 5, "green", true);
        
        System.out.println("522H0077");
        
        System.out.println(sq);
        System.out.println(cir.toString());

        sq.setWidth(12);

        System.out.println(sq);
        System.out.println(rec);
    }
}
