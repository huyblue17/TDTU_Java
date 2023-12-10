import java.util.*;

public class Test {
    
    //heap slow
    public static void heapAsc(int[] a) {
        MinHeap minh = new MinHeap(a.length);
        for (int key : a) {
            minh.insert(key);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = minh.extractMin();
        }
    }

    public static void heapDesc(int[] a) {
        MaxHeap maxh = new MaxHeap(a.length);
        for (int key : a) {
            maxh.insert(key);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = maxh.extractMax();
        }
    }

    //heap fast
    public static void heapAscF(int[] a) {
        MinHeap heap = new MinHeap(a.length);
        heap.buildHeapFast(a);

        for (int i = 0; i < a.length; i++) {
            a[i] = heap.extractMin();
        }
    }

    public static void heapDescF(int[] a) {
        MaxHeap heap = new MaxHeap(a.length);
        heap.buildHeapFast(a);

        for (int i = 0; i < a.length; i++) {
            a[i] = heap.extractMax();
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 50, 79, 63, 75, 46, 90, 45, 45, 63};

        System.out.println(Arrays.toString(a));
        System.out.println("Sort using build heap slow");
        System.out.print("ASC ");
        heapAsc(a);
        System.out.println(Arrays.toString(a));
        System.out.print("DESC ");
        heapDesc(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Sort using build heap fast");
        System.out.print("ASC ");
        heapAscF(a);
        System.out.println(Arrays.toString(a));
        System.out.print("DESC ");
        heapDescF(a);
        System.out.println(Arrays.toString(a));
    }
}
