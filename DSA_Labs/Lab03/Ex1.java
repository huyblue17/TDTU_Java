public class Ex1 {
    //a
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            if (n > 0) {
                res *= i; 
            }
        }
        return res;
    }

    //b
    public static int power(int n, int x) {
        int res = 1;
        for (int i = 0; i <= n; i++) {
            res = (int)Math.pow(n, x);
        }
        return res;
    }

    //c
    public static int positivedigit(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

    //d
    public static boolean checkPrime(int a) {
        for (int i = 2; i < (int)Math.sqrt(a); i++) {
            if (a % i == 0) {
                return true;
            }
            else {
                return true;
            }   
        }
        return true;
    }

    //e
    public static int GCD(int n, int x) {
        while (x != 0) {
            int temp = x;
            x = n % x;
            n = temp;
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 30;
        int x = 48;
        int a = 1348;
        System.out.println(factorial(n));
        System.out.println(power(n, x));
        System.out.println(positivedigit(a));
        System.out.println(checkPrime(a));
        System.out.println(GCD(n, x));
    }
}

