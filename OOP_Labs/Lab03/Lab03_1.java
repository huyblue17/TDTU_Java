import java.util.*;

public class Lab03_1
{
    public static void main(String[] args)
    {
        System.out.print("522H0077-Tong Nguyen Gia Huy\n");
        int[] arr = {1, 5, 7, 2, 1, 2, 1, 2, 3, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (check(arr, n) == 1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
        
        insert(arr, 2, 5);
        System.out.print("\n2.Insert" + Arrays.toString(arr));

        System.out.println("\n3.Duplicate");
        findDuplicates(arr);
        sc.close();
    }

    public static void rev(int[] arr, int d)
    {
        for (int i = d; i < arr.length - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
    }

    public static int check(int[] arr, int n)
    {
        int num = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == n)
            {
                rev(arr, i);
                num = 1;
                break;
            }
        }
        return num;
    }

    public static void insert(int[] arr, int k, int val) 
    {
    for (int i = arr.length - 1; i > k; i--) 
    {
        arr[i] = arr[i - 1];
    }
    arr[k] = val;
    arr[arr.length - 1] = arr[arr.length - 2];
    }

    public static void findDuplicates(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                  System.out.println("Duplicate found: " + arr[i]);
                }
            }
        }
    }
}
