import java.util.*;
import java.util.Scanner;

public class String1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        menu();

        System.out.print("Enter your choice: ");
        int userChoice = sc.nextInt();
        System.out.println();

        switch (userChoice)
        {
            case 0:
                return;
            case 1:
                System.out.println("Shorted name: " + shortName(name));
                break;
            case 2: 
                System.out.println("Hashtaged name: " + hashtagName(name));
                break;
            case 3:
                System.out.println("Uppercased all vowels in a string: " + uppercaseAllVowel(str));
                break;
            case 4:
                System.out.println("Upppercased all 'n letter in a string: " + uppercaseAllNLetter(str));
                break;
            default:
                return;
        }
    }

    public static void menu()
    {
        System.out.println();
        System.out.println("0. Exit");
        System.out.println("1. Concatenate first name - last name");
        System.out.println("2. Hashtag");
        System.out.println("3. Uppercase vowel letter");
        System.out.println("4. Uppercase 'n' letter");
        System.out.println();
    }

    public static String shortName(String name)
    {
        String[] words = name.split(" ");
        return words[0] + " " + words[words.length - 1];
    }

    public static String hashtagName(String name)
    {
        String[] words = name.split(" ");
        return "#" + words[0] + words[words.length - 1];
    }

    public static String uppercaseAllVowel(String str)
    {
        char[] charArr = str.toCharArray();                  
         for(int i = 0; i < charArr.length; i++)
        {
            if(charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'u' || charArr[i] == 'i' || charArr[i] == 'o')
            {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        return String.valueOf(charArr);
    }

    public static String uppercaseAllNLetter(String str)
    {
        return str.replaceAll("n", "N");
    }
}