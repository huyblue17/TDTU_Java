import java.util.Arrays;

public class SelectionSort {
    public static void addSelection(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int MinInd = 1;

            for (int j = i + 1; j < n; j ++) {
                if (a[j] > a[MinInd])
                    MinInd = j;    
            }

            int temp = a[MinInd];
            a[MinInd] = a[i];
            a[i] = temp;
            
            System.out.println(Arrays.toString(a));
        }
        
    }

    public static void main(String[] args) {
        int[] a = {58, 4, 24, 93, 48, 33};
        System.out.println("Selection Sort DESC: ");
        addSelection(a);
    }
}