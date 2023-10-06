import java.util.*;

public class Lab02
{
    public static void main(String[] arg)
    {
        System.out.println("522H0077-Tong Nguyen Gia Huy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();    
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]++ + " ");
        }
        
        System.out.println("\n1. Find max  in array: "+ findmax(n,arr));
        System.out.println("\n2. Find min  in array: "+ findmin(n,arr));
        System.out.println("\n3. Sum all even in array: "+ sumall(n,arr));
        System.out.println("\n4. Total Max in array: "+ count(n,arr));
        System.out.println("\n5. Total prime in array: "+ primecount(n,arr));
        System.out.println("\n Enter k: ");
        int k = sc.nextInt();
        if (find(arr,k) != 1)
        {
            System.out.println("\n6.The array have "+ k + " in the array: " + find(arr,k));
        }
        else
        {
            System.out.println("\n6.The array not have"+ k + "in the array");
        }
        System.out.println("\n7. Array after quare: ");
        square(n,arr);
    }

    public static int findmax(int n, int [] arr)
    {
        int max = arr[0];
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findmin(int n, int [] arr)
    {
        int min = arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sumall(int n, int [] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
                sum = sum + arr[i];
        }
        return sum;
    }

    public static int count(int n, int [] arr)
    {
        int dem = 0;
        if (arr[0] > arr[1])
        {
            dem += 1;
        }
        if (arr[n - 1] > arr[n - 2])
        {
            dem += 1;
        }
        for (int i = 1; i < n - 2; i++)
        {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
            {
                dem += 1;
            }
        }
        return dem;
    }

    public static boolean checkprime(int n) 
    {
        if (n < 2) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static int primecount(int n, int [] arr)
    {
        int dem = 0;
        for (int i = 0; i < n; i++)
        {
            if (checkprime(arr[i]))
                dem++;
        }
        return dem;
    }

    public static int find(int [] arr, int k)
    {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == k)
            {
                return i;
            }
        return 1;
    }

    public static void square(int n, int [] arr) 
    {
        for (int i = 0; i < n; i++) 
        {
            arr[i] = arr[i] * arr[i];
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}