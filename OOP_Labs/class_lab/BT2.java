import java.util.*;

public class BT2
{
    public static void main(String[] arg)
    {
        System.out.println("522H0077");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        countname(name);
        lastname(name);
        firstname(name);
        middlename(name);
        Capitalname(name);

    }

    public static void countname(String name)
    {
        int wordCount = name.split("\\s+").length;
        System.out.println("Word have counted: "+ wordCount);
    }

    public static void lastname(String name)
    {
        StringTokenizer tn1 = new StringTokenizer(name);
        String tn2 = " ";
        while (tn1.hasMoreTokens())
        {
            tn2 = tn1.nextToken();
        }
        System.out.println("Last name: "+ tn2);
    }

    public static void firstname(String name)
    {
        StringTokenizer tn1 = new StringTokenizer(name);
        System.out.println("First name: "+tn1.nextToken());
    }

    public static void middlename(String name)
    {
        int n = name.split("\\s+").length;
        StringBuffer tn1 = new StringBuffer(" ");
        String[] myname = name.split(" ");
        for (int i = 1; i < n - 1; i++)
        {
            tn1.append(myname[i]);
            tn1.append(" ");
        }
        System.out.println("Middle name: "+ tn1);
    }

    public static void Capitalname(String name)
    {
        StringBuffer tn1 = new StringBuffer(name);
        tn1.setCharAt(0, Character.toUpperCase(tn1.charAt(0)));
        for (int i = 0; i < tn1.length(); i++)
        {
            if (tn1.charAt(i) == ' ')
                tn1.setCharAt(i + 1, Character.toUpperCase(tn1.charAt(i+1)));
        }
        System.out.println("Capitalized Name: "+ tn1);
    }


}