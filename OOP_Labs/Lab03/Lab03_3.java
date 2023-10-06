import java.util.*;

public class Lab03_3
{

    public static int countName(String s) 
    {
        int dem = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) 
        {
            if (c[i] == ' ') 
            {
                dem += 1;
            }
        }
        return dem + 1;
    }

    public static String fnlName(String s) 
    {
        String s1[] = s.split(" ");
        String s2 = " ";
        s2 = s2.concat(s1[0]);
        s2 = s2.concat(" ");
        s2 = s2.concat(s1[countName(s) - 1]);
        return s2;
    }
    
    public static String middleName(String s) 
    {
        String s1[] = s.split(" ");
        String s2 = " ";
        for (int i = 1 ; i < countName(s) - 1; i++) 
        {
            s2 = s2.concat(s1[i]);
            s2 = s2.concat(" ");
        }
        return s2;
    }
    
    public static String capitalizeName(String s) 
    {
        char[] c = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        for (int i = 1 ; i < s.length(); i++) 
        {
            if (c[i] == ' ') 
            {
            c[i+1] = Character.toUpperCase(c[i+1]);
            }
        }
        s = new String(c);
        return s;
    }
    
    public static String vowelName(String s) 
    {
        char[] s1 = s.toCharArray();
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s1[i];
            if (c == 'u' || c == 'o' || c == 'A' || c == 'a' || c == 'i') 
            {
            s1[i] = Character.toUpperCase(s1[i]);
            }
            else if (c == 'U' || c == 'E' || c == 'O' || c == 'A' || c == 'I') 
            {
                s1[i] = Character.toUpperCase(s1[i]);
            }
            else 
            {
                s1[i] = Character.toLowerCase(s1[i]);
            }
        }
        s = new String(s1);
        return s;
    }
    
    public static void main(String[] args) 
    {
        System.out.print("522H0077-Tong Nguyen Gia Huy\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String s = input.nextLine();
        System.out.println("Name after capitalize is : " + capitalizeName(s));
        s = capitalizeName(s);
        System.out.println("Final and Last name is : " + fnlName(s));
        System.out.println("Middle name is: " + middleName(s));
        System.out.println("After upcase vowel and lower conso is: " + vowelName(s));
        input.close();
    }
}