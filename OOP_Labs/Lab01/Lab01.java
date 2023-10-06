import java.util.*;

class Lab01
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        
        //1
        System.out.print("522H0077");
        System.out.println("1.");
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your date of birth: ");
        String dob = sc.nextLine();
        
        System.out.print("Enter your id: ");
        int id = sc.nextInt();

        System.out.println("Please check again");
        System.out.println("Your name: "+name);
        System.out.println("Date of birth: "+dob);
        System.out.println("Your id: "+id);

        //2
        System.out.print("2.");
        System.out.println("Enter base: ");
        double b = sc.nextDouble();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        double a = 0.5*h*b;
        System.out.println("Area of triangle: "+a);

        //3 
        System.out.print("3.");
        double result = 100 % 9;
        System.out.println("Division remainder of 100 and 9: "+result);
    

        //4
        System.out.print("4.");
        System.out.print("Enter Fahrenheit temaperature: ");
        double fahrenheit = sc.nextDouble();
        double Celsius = (fahrenheit - 32)*5/9;
        System.out.println("Fahrenheit to Celsius: "+Celsius);

        //5
        System.out.print("5.");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            System.out.println("This is a leap year");
        }
        else
        {
            System.out.println("This is not a leap year");
        }

        //6
        System.out.print("6.");
        System.out.println("Enter a: ");
        int a1 = sc.nextInt();
        System.out.println("Enter b: ");
        int b1 = sc.nextInt();
        System.out.println("Enter c: ");
        int c1 = sc.nextInt();
        int minimum = Math.min(a1, Math.min(b1,c1));
        System.out.println("The min of 3: "+ minimum);
        
        //7
        System.out.print("7.");
        System.out.println("Enter a alphanumeric: ");
        char n = sc.next().charAt(0);
        if (( n >= 'a' && n <= 'z') || (n >= 'A' && n <='Z') || (n >= '0' && n <= '9'))
        {
            System.out.println("This is a alphanumeric");
        }
        else
        {
            System.out.println("This is not a alphanumeric");
        }

        //8
        System.out.print("8.");
        System.out.print("Enter n: ");
        int sum = 0;
        int n1 = sc.nextInt();
        for (int i = 1; i <=n1; i++)
        {
            sum += i*Math.pow(2,i);
        }
        System.out.println("The sum from 1 to n: "+ sum);

        //9
        System.out.print("9.");
        System.out.println("Enter a number: ");
        int hail = sc.nextInt();
        while (hail != 1)
        {
            if (hail % 2 == 0)
            {
                hail = hail / 2;
                System.out.println(hail+ " is even, so we take n/2");
            }
            else
            {
                hail = 3*hail+1;
                System.out.println(hail+ " is odd, so we take 3*n+1");

            }
        }
        System.out.println("Last Hailstone is: "+hail);

        //10
        System.out.print("10.");
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int firstdigit = number;
        while (firstdigit >=10)
        {
            firstdigit = number/10;
        }
        int lastdigit = number % 10;
        int s = firstdigit + lastdigit;
        System.out.println("Sum of first and last digit: "+s);

        //11
        System.out.print("11.");
        int count = 0;
        for (int i = 0; i <= number; i++);
        {
            count++;
        }
        System.out.println("Total number: "+count);

        //12
        System.out.print("12.");
        System.out.println("Enter an integer number");
        int res = sc.nextInt();
        int reverse = 0;
        while (res != 0)
        {
            int t = res % 10;
            reverse = reverse*10 + t;
            res /=10;
        }
        System.out.println("The reverse: "+ reverse);
        

        //13
        System.out.print("13.");
        System.out.println("Enter any number");
        int numb = sc.nextInt();
        int ori = numb; 
        int reversed = 0;
        while (numb != 0)
        {
            int t = numb % 10;
            reversed = reversed*10 + t;
            numb /=10;
        }
        if (ori == reversed)
        {
            System.out.print("This is a palindrome num");
        }
        else
        {
            System.out.print("This is not a palindrome num");
        }

    }
        
}