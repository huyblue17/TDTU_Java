public class Recursion {
    public static void main(String[] args)
    {
        System.out.println(aP(3));
        System.out.println(bP(3));
        System.out.println(factorial(5));
        System.out.println(dP(3));
        System.out.println(eP(5));
        System.out.println("-----------Another Methods-----------");
        System.out.println(sumA(3));
        System.out.println(sumB(3));
        System.out.println(sumC(5));
        System.out.println(sumD(3));
        System.out.println(sumE(5));
    }

    //a
    public static int aP(int n) {
        if (n == 1)
            return 2;
        return (int) Math.pow(2, n) + aP(n - 1);
    }

    //b 
    public static double bP(int n) {
        if (n == 0)
            return 1/2;
        return (double) (n + 1)/2 + bP(n - 1);
    }

    //c
    public static int factorial1(int n) {
        if (n == 0)
            return 1;
        return n*factorial1(n - 1);
    }

    public static int factorial2(int n) {
        if (n == 1)
            return 1;
        return (n - 1)*factorial2(n - 1); 
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return factorial1(n)/factorial2(n) + factorial(n - 1);
    }

    //d
    public static int dP(int n) {
        if (n == 1)
            return 0;
        return n*(n - 1) + dP(n - 1);
    }

    //e
    public static int eP(int n) {
        if (n == 1)
            return 1;
        return n*eP(n - 1);
    }

    //Another method
    public static int sumA(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (int) Math.pow(2, i);
        return sum;
    }

    public static double sumB(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i + 1);
            double div = sum/2.0;
        return div;
    }

    public static int sumC(int n) {
        int sum = 0;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            int fac1 = a * i;
            sum += fac1 / (fac1 / i);
        }
        return sum;
    }
    
    public static int sumD(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*(i - 1);
        }
        return sum;
    }

    public static int sumE(int n) {
        int pro = 1;
        for (int i = 1; i <= n; i++) {
            pro *= i;
        }
        return pro;
    }
}