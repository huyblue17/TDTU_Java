public class Ex2 {
    //a
    public static int factorial(int n) {
        if (n >= 1)
            return n * factorial(n - 1);
        return 1;
    }

    //b
    public static int power(int n, int x) {
        if (x == 0)
            return 1;
        else if (n == 0)
            return 0;
        else if (x == 1)
            return n;
        return n * power(n, x - 1);
    }

    //c
    public static int positivedigit(int a) {
        if (a == 0)
            return 0;
        return 1 + positivedigit(a / 10);
    }

    //d
    public static int GCD(int n, int x) {
        if (x == 0)
            return n;
        return GCD(x, n % x);
    }

    public static void main(String[] args) {
        int n = 3;
        int x = 2;
        int a = 1345;
        System.out.println(factorial(n));
        System.out.println(power(n, x));
        System.out.println(positivedigit(a));
        System.out.println(GCD(n, x));
    }
}
