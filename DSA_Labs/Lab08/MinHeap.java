import java.util.NoSuchElementException;

public class MinHeap {
    int[] heap;
    int heapSize;
    int maxSize;

    public MinHeap(int capity) {
        heapSize = 0;
        this.maxSize = capity + 1;
        heap = new int[maxSize];
        heap[0] = -1;
    }

    private int parent(int i) {
        return i/2;
}

    private int left(int i) {
        return 2*i;
    }

    private int right(int i) {
        return 2*i + 1;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int key) {
        if (heapSize == maxSize) {
            throw new NoSuchElementException("Overflow Exception");
        }
        heapSize += 1;
        heap[heapSize] = key;

        shiftUp(heapSize);
    }

    private void shiftUp(int i) {
        while(i > 1 && heap[parent(i)] < heap[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public int extractMin() {
        if (heapSize == 0) {
            throw new NoSuchElementException("Underflow Exception");
        }
        int max = heap[1];
        heap[1] = heap[heapSize];
        heapSize -= 1;
        shiftDown(1);
        return max;
    }

    private void shiftDown(int i) {
        while (i <= heapSize) {
            int min = heap[1];
            int min_id = i;
            if (left(i) <= heapSize && min < heap[left(i)]) {
                min = heap[left(i)];
                min_id = left(i);
            }
            if (right(i) <= heapSize && min < heap[right(i)]) {
                min = heap[right(i)];
                min_id = left(i);
            }
            if (min_id != i) {
                swap(min_id, i);
                i = min_id;
            }
            else {
                break;
            }
        }
    }

    //fast heap build
    public void buildHeapFast(int[] a) {
        this.heap = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            this.heap[i + 1] = a[i];
        }

        this.heapSize = a.length;

        for (int i = this.heapSize / 2; i >= 1; i--) {
            shiftDown(i);
        }
    }
}
