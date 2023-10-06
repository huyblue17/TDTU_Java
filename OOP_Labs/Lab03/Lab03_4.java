import java.util.*;

public class Lab03_4
{
    public static void main(String[] args)
    {
        System.out.print("522H0077-Tong Nguyen Gia Huy\n");
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter chain: ");
        String str = sc.nextLine();

        System.out.println("Length:  " + findlength(str));
        System.out.println("Number of word: " + countword(str));

        System.out.print("Enter chain to combine: ");
        String content = sc.nextLine();

        System.out.println("After combine: " + concatenateString(str, content));

        if(checkPalindrome(str))
            System.out.print("This is palindrome");
        else    
        System.out.print("This is not palindrome");
    }

    public static int findlength(String str)
    {
        return str.length();
    } 

    public static int countword(String str)
    {
        String[] words = str.split(" ");
        return words.length;
    }

    public static String concatenateString(String str, String content)
    {
        return str.concat(content);
    }

    public static boolean checkPalindrome(String str)
    {
        String strCheck = str.toLowerCase().replaceAll(" ", "");
        String reverse = "";

        for(int i = strCheck.length() - 1; i >= 0; i--)
        {
            reverse += strCheck.charAt(i);
        }

        if(strCheck.equals(reverse))
            return true;
        return false;
    }
}