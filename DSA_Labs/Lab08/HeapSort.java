public class HeapSort {
    public static void heapSort(int[] arr) {
        MaxHeap maxHeap = new MaxHeap(arr.length);

        // Insert elements into the max heap
        for (int num : arr) {
            maxHeap.insert(num);
        }

        // Extract the maximum element from the max heap and place it at the end of the array
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = maxHeap.extractMax();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 10, 3, 5, 1 };
        heapSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}