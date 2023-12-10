public class Ex3 {
    public static boolean checkPrime(int n, int d) {
        if (n <= 1)
            return false;
        else if (d * d > n)
            return true;
        else if (n % d == 0)
            return false;
        return checkPrime(n, d + 1);
    }

    public static void main(String[] args) {
        System.out.print(checkPrime(53, 2));
    }
}
