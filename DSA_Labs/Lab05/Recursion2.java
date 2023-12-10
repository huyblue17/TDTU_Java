public class Recursion2 {
    public static void main(String[] args) {
        System.out.println(aP(5));
        System.out.println(bP(120));
        System.out.println(cP(3, 3));
        System.out.println(dP(3));
        System.out.println("-----Another Methods-----");
        System.out.println(aaP(5));
        System.out.println(bbP(120));

    }

    //a
    public static int aP(int n) {
        if (n == 0)
            return 2;
        else if (n > 0)
            return 2 - 1*aP(n - 1)/2;
        return 0;
    }


    public static int bP(int n) {
        if (n < 10)
            return 1;
        else if ( n>= 10)
            return 1 + bP(n / 10);
        return 0;
    }

    public static int cP(int n, int k) {
        if (k == 1)
            return n;
        else if (k > 1)
            return n + cP(n, k - 1);
        return 0;
    }

    public static int dP(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return dP(n - 1) + dP(n - 2);
    }

    public static int aaP(int n) {
        int res = 2;
        for (int i = 1; i <= n; i++) {
            res = 2 - (1 * res) / 2;
        }
        return res;
    }

    public static int bbP(int n) {
        int res = 0;
        while (n >= 10) {
            n = n / 10;
            res++;
        }
        return res + 1;
    }
}
