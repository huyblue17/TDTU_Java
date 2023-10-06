import java.math.BigDecimal;
import java.util.*;

public class Lab02_1
{
    public static BigDecimal findMax(BigDecimal [] arr)
    {
        BigDecimal max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i].compareTo(max) > 0)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        BigDecimal [] arr = 
        {
            new BigDecimal("15"),
            new BigDecimal("4"),
            new BigDecimal("6.6")
        };
        System.out.println("\n8.BigDecimal object array: "+ findMax(arr));
    }
}