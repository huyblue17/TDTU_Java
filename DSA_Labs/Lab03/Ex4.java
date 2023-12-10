public class Ex4 {
    //a
    public static int aP(int n) {
        if (n == 1)
            return 3;
        return 2*n + 1 + aP(n - 1);
    }

    //b
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else 
            return n * factorial(n - 1);
    }

    public static int sum_of_bP(int n) {
        if (n == 1)
            return 1;
        else
            return factorial(n) + sum_of_bP(n - 1);
    }

    //c
    public static int product_of_cP(int n) {
        if(n == 1)
            return 1;
        else
            return factorial(n) * product_of_cP(n - 1);
    }

    //d
    public static int dP(int n, int r) {
        if ((r <= n) && (r > 0)) {
            return n * dP( - 1, r - 1);
        }
        else
            return 1;
    }

    //e
    public static int eP(int n) {
        if (n == 1) {
            return 3;
        }
        else if (n > 1) {
            return (int) (Math.pow(2, n) + Math.pow(n, 2) + eP(n - 1));
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(aP(5));
        System.out.println(sum_of_bP(5));
        System.out.println(product_of_cP(5));
        System.out.println(dP(4, 5));
        System.out.println(eP(5));
    }
}
