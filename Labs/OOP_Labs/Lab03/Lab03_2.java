import java.util.*;

public class Lab03_2
{
    public static void show(int arr[][]) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }      

    }

    public static int[][] add(int arr1[][], int arr2[][]) 
    {
        int arr3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0 ;j < 3; j++) 
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }
    
    public static int[][] mul(int arr[][],int n) 
    {
        int arr3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0 ;j < 3; j++) 
            {
                arr3[i][j] = arr[i][j]*n;
            }
        }
        return arr3;
    }

    public static void main(String[] args) 
    {
        System.out.print("522H0077-Tong Nguyen Gia Huy\n");
        Scanner input = new Scanner(System.in);
        int arr1[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };
        int arr2[][] = {
                        {9,8,7},
                        {6,5,4},
                        {3,2,1}

                        };
        System.out.println("Matrices after add: ");
        show(add(arr1, arr2));
        System.out.println("Enter number: ");
        int n = input.nextInt();
        System.out.println("Matrices after multiply: ");
        show(mul(arr1,n));
        input.close();
    }
}
    
