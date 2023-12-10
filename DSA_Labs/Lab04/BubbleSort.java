import java.util.Arrays;

public class BubbleSort {
    
    public static void addBubble(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                    
            }
            System.out.println(Arrays.toString(a));
        }
    }
    
    public static void main(String[] args) {
        int[] a = {36, 22, 4, 34, 85, 29};
        System.out.println("Bubble Sort ASC: ");
        addBubble(a);
    }
}
