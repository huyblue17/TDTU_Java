import java.util.*;

public class Array 
{
    public static void main(String1 [] args)
    {
        int[] a = {1, 3, 2, 4, 10, 5, 6};
        System.out.println("Max ele in even: " + maxEven(a));
        System.out.println("Min ele odd: " + minOdd(a));
        System.out.println("Sum greatest and smallest: " + sumMEMO(a));
        System.out.println("First even: "+ idxFirstEven(a));
    }

    public static int maxEven(int[] a)
    {
        int temp = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0 && a[i] > temp)
            {
                temp = a[i];
            }
        }
        return temp;
    }

    public static int minOdd(int[] a)
    {
        int min = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 1 && a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public static int sumMEMO(int[] a)
    {
        int maxEven = maxEven(a);
        int minOdd = minOdd(a);
        return maxEven + minOdd;
    }

    public static int idxFirstEven(int[] a)
    {
        int index = -1;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] input(int n)
    {
        Scanner sc = new Scanner(System.in);
        int[] arrNew = new int[n];
        for(int i = 0; i < arrNew.length; i++)
        {
            System.out.print("Enter arrNew[" + i + "]: ");
            arrNew[i] = sc.nextInt();
        }
        return arrNew;
    }
}
