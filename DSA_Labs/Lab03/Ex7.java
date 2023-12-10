public class Ex7 {
    //a
    public static int findMin(int[] arr, int size) {
        if (size == 1) {
            return arr[0];
        } 
        else {
            return Math.min((int) findMin(arr, size - 1), arr[size - 1]);
        }
    }

    //b
    public static int compSum(int[] arr, int size) {
        if (size == 0) {
            return 0;
        } 
        else {
            return arr[size - 1] + compSum(arr, size - 1);
        }
    }

    //c
    public static int countEven(int[] arr, int size) {
        if (size == 0) {
            return 0;
        } 
        else {
            int count = countEven(arr, size - 1);
            if (arr[size - 1] % 2 == 0) {
                count++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 6, 7, 1, 3, 5};
        int size = arr.length;
        System.out.println("Minimum: " + findMin(arr, size));
        System.out.println("Sum: " + compSum(arr, size));
        System.out.println("Even Count: " + countEven(arr, size));
    }
}
