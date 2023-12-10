public class Recur {
    // (a) 
    public static double prod_recur(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + prod_recur(a, b - 1);
        } else {
            return -prod_recur(a, -b);
        }
    }

    // (b) 
    public static int bin2dec(int n, int exp) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) * (int) Math.pow(2, exp) + bin2dec(n / 10, exp + 1);
        }
    }

    // (c)
    public static int maxDigit(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            int maxRest = maxDigit(remainingDigits);
            return Math.max(lastDigit, maxRest);
        }
    }

    // (d) 
    public static int maxElement(int[] a, int n) {
        if (n == 1) {
            return a[0];
        } else {
            return Math.max(a[n - 1], maxElement(a, n - 1));
        }
    }

    // (e) 
    public static int search(int[] a, int n, int key) {
        if (n == 0) {
            return -1;
        } else if (a[n - 1] == key) {
            return n - 1;
        } else {
            return search(a, n - 1, key);
        }
    }

    public static void main(String[] args) {
        // (a) 
        int a = 5;
        int b = 3;
        double product = prod_recur(a, b);
        System.out.println("Product: " + product);

        // (b) 
        int binary = 1000;
        int decimal = bin2dec(binary, 0);
        System.out.println("Decimal: " + decimal);

        // (c) 
        int number = 563892;
        int maxDigit = maxDigit(number);
        System.out.println("Max Digit: " + maxDigit);

        // (d) 
        int[] array = {5, 8, 2, 10, 3};
        int maxElement = maxElement(array, array.length);
        System.out.println("Max Element: " + maxElement);

        // (e) 
        int[] searchArray = {2, 5, 9, 12, 7};
        int key = 9;
        int position = search(searchArray, searchArray.length, key);
    }
}