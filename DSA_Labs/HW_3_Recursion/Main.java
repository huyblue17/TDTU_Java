class Main {
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static int factorial2(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial2(n - 1);
    }

    public static int factorial3(int n) {
        return n < 1 ? 1 : n * factorial3(n - 1);
    }

    public static int sumN(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static int sumN1(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumN1(n - 1);
    }

    public static int sumN3(int n) {
        return n < 1 ? 0 : n + sumN3(n - 1);
    }

    public static int sumN4(int n) {
        return n * (n - 1) / 2;
    }

    // print: n n-1 n-2 ... 3 2 1
    public static void countDown(int n) {
        if (n >= 1) {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    // count digits
    public static int countDigits(int a) {
        return a < 10 ? 1 : 1 + countDigits(a / 10);
    }

    // binary form: 8 = 1000, 127=1111111
    public static void printBin(int a) {
        if (a > 0) {
            printBin(a / 2);
            System.out.print(a % 2);
        }
    }

    public static void printHex(int n) {
        if (n > 0) {
            printHex(n / 16);
            int d = n % 16;
            if (d < 10) {
                System.out.print(d);
            } else {
                switch (d) {
                    case 10:
                        System.out.print('A');
                        break;
                    case 11:
                        System.out.print('B');
                        break;
                    case 12:
                        System.out.print('C');
                        break;
                    case 13:
                        System.out.print('D');
                        break;
                    case 14:
                        System.out.print('E');
                        break;
                    case 15:
                        System.out.print('F');
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static void printTri(int n) {
        if (n > 0) {
            int d = n % 3;
            printTri(n / 3);
            System.out.print(d);
        }
    }

    public static void printArr(int[] a, int n) {
        if (n > 0) {
            printArr(a, n-1);
            System.out.println(a[n-1]);
        }
    }

    public static int sumArr(int[] a, int n) {
        return n == 0? 0: a[n-1] + sumArr(a, n-1);
    }

    public static int sumEvenDigit(int a) {
        if (a < 0) {
            return 0;
        }
        
        return (a % 10) % 2 == 0 ? a % 10 : 0;
    }

    //return into arr
    public static void printEven(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                sum += sumEvenDigit(num);
            }
        }
        
        System.out.println(sum);
    }

    public static int getMax(int[] a, int n) {
        if (n == 1) {
            return a[0];
        }

        return Math.max(a[n - 1], getMax(a, n - 1));
    }

    public static void printUpper(String s, int n) {
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                System.out.println(currentChar);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7};
        printArr(a, a.length);
        printEven(a);
        int max = getMax(a, a.length);
        System.out.println(max);

        String s = "HelLo WoRld";
        int n = s.length();
        printUpper(s, n);
    }
}