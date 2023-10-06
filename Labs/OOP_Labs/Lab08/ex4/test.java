import java.util.Scanner;
import java.util.Vector;

public class test
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the vector: ");
        
        int n = scanner.nextInt();

        Vector<Integer> x = new Vector<>(n);

        System.out.println("Enter the elements of the vector:");

        for (int i = 0; i < n; i++) 
        {
            int element = scanner.nextInt();
            x.add(element);
        }

        Vector<Integer> y = new Vector<>(n);

        for (int i = 0; i < n; i++) 
        {
            int element = 2 * x.get(i) * x.get(i) + 1;
            y.add(element);
        }

        System.out.println("The elements of vector Y are:");
        System.out.println(y.toString());
    }
}